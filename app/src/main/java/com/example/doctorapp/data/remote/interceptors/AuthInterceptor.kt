package com.example.doctorapp.data.remote.interceptors

import com.example.doctorapp.session.SessionManager
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.net.HttpURLConnection
import javax.inject.Inject

class AuthInterceptor @Inject constructor(
    private val sessionManager: SessionManager
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()
        var accessToken = sessionManager.getAuthState().accessToken

        val response = chain.proceed(newRequestWithAccessToken(accessToken, request))

        if (response.code == HttpURLConnection.HTTP_UNAUTHORIZED) {
            val newAccessToken = sessionManager.getAuthState().accessToken
            if (newAccessToken != accessToken) {
                return chain.proceed(newRequestWithAccessToken(accessToken, request))
            } else {
                accessToken = refreshToken()
                if (accessToken.isNullOrBlank()) {
                    sessionManager.logout()
                    return response
                }
                return chain.proceed(newRequestWithAccessToken(accessToken, request))
            }
        }

        return response
    }

    private fun newRequestWithAccessToken(accessToken: String?, request: Request): Request =
        request.newBuilder()
            .header("Authorization", "Bearer $accessToken")
            .build()

    private fun refreshToken(): String? {
        synchronized(this) {
            val refreshToken = sessionManager.getAuthState().refreshToken
            refreshToken?.let {
                //return sessionManager.setRefreshToken(refreshToken)
                return "token refreshato"
            } ?: return null
        }
    }

}

