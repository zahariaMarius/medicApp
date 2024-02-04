package com.example.doctorapp.session

import android.content.Intent
import android.net.Uri
import android.util.Base64
import android.util.Log
import androidx.browser.browseractions.BrowserActionsIntent.launchIntent
import com.auth0.android.jwt.JWT
import com.example.doctorapp.common.Constants
import com.example.doctorapp.common.Constants.CODE_VERIFIER_CHALLENGE_METHOD
import com.example.doctorapp.common.Constants.MESSAGE_DIGEST_ALGORITHM
import net.openid.appauth.AuthState
import net.openid.appauth.AuthorizationException
import net.openid.appauth.AuthorizationRequest
import net.openid.appauth.AuthorizationResponse
import net.openid.appauth.AuthorizationService
import net.openid.appauth.AuthorizationServiceConfiguration
import net.openid.appauth.EndSessionRequest
import net.openid.appauth.ResponseTypeValues
import org.json.JSONObject
import java.security.MessageDigest
import java.security.SecureRandom
import javax.inject.Inject

class AuthServiceHelper @Inject constructor(
    private val authorizationService: AuthorizationService,
    private val sessionManager: SessionManager
) {
    fun buildAuthRequestIntent(): Intent {
        val authorizeUri = Uri.parse(Constants.AUTHORIZATION_URL)
        val endSessionUri = Uri.parse(Constants.LOGOUT_URL)
        val tokenUri = Uri.parse(Constants.TOKEN_URL)
        val redirectUri = Uri.parse(Constants.REDIRECT_AUTH_URL)

        val secureRandom = SecureRandom()
        val bytes = ByteArray(64)
        secureRandom.nextBytes(bytes)

        val encoding = Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP
        val codeVerifier = Base64.encodeToString(bytes, encoding)

        val digest = MessageDigest.getInstance(MESSAGE_DIGEST_ALGORITHM)
        val hash = digest.digest(codeVerifier.toByteArray())
        val codeChallenge = Base64.encodeToString(hash, encoding)

        val config = AuthorizationServiceConfiguration(authorizeUri, tokenUri, null, endSessionUri)
        val request = AuthorizationRequest
            .Builder(config, Constants.KEYCLOAK_CLIENT_ID, ResponseTypeValues.CODE, redirectUri)
            .setScope("openid")
            .setCodeVerifier(
                codeVerifier,
                codeChallenge,
                CODE_VERIFIER_CHALLENGE_METHOD
            )
            .build()

        return authorizationService.getAuthorizationRequestIntent(request)
    }

    fun handleAuthorizationResponse(
        intent: Intent,
        signInWithSocial: () -> Unit,
    ) {
        val authorizationException = AuthorizationException.fromIntent(intent)
        val authorizationResponse = AuthorizationResponse.fromIntent(intent)
        var authState = AuthState(authorizationResponse, authorizationException)

        Log.i("AuthServiceHelper", "authState: ${authState.jsonSerialize()} ")
        if (authorizationResponse != null) {
            val tokenExchangeRequest = authorizationResponse.createTokenExchangeRequest()
            authorizationService.performTokenRequest(tokenExchangeRequest) { response, exception ->
                if (exception != null) {
                    authState = AuthState()
                } else {
                    if (response != null) {
                        authState.update(response, exception)
                        sessionManager.setAuthState(authState)
                        signInWithSocial()
                    }
                }
            }
        }
    }

    fun logOut(): Intent {
        val authState = sessionManager.getAuthState()
        val endSessionRequest =
            EndSessionRequest.Builder(authState.authorizationServiceConfiguration!!)
                .setPostLogoutRedirectUri(Uri.parse(Constants.REDIRECT_LOGOUT_URL))
                .setIdTokenHint(authState.idToken)
                .build()

        return authorizationService.getEndSessionRequestIntent(endSessionRequest)
    }

}