package com.example.doctorapp.session

import android.content.SharedPreferences
import com.example.doctorapp.common.Constants
import net.openid.appauth.AuthState
import javax.inject.Inject

class SessionManager @Inject constructor(
    private val preferences: SharedPreferences
) {
    fun setAuthState(authState: AuthState) {
        preferences.edit().putString(Constants.AUTHSTATE_KEY, authState.jsonSerializeString())
            .apply()
    }

    fun getAuthState(): AuthState {
        val authState = preferences.getString(Constants.AUTHSTATE_KEY, null)
        return if (authState.isNullOrBlank()) {
            AuthState()
        } else {
            AuthState.jsonDeserialize(authState)
        }
    }

    fun setFirstAccess() {
        preferences.edit().putBoolean(Constants.FIRST_ACCESS_KEY, false).apply()
    }

    fun isFirstAccess(): Boolean {
        return preferences.getBoolean(Constants.FIRST_ACCESS_KEY, true)
    }

    fun setUserFiscalCode(fiscalCode: String) {
        preferences.edit().putString(Constants.LOGGED_USER_KEY, fiscalCode).apply()
    }

    fun getUserFiscalCode(): String? {
        return preferences.getString(Constants.LOGGED_USER_KEY, null)
    }

    fun logout() {
        preferences.edit().remove(Constants.LOGGED_USER_KEY).apply()
        preferences.edit().remove(Constants.AUTHSTATE_KEY).apply()
    }
}