package com.example.doctorapp.session

import android.content.SharedPreferences
import android.util.Log
import com.example.doctorapp.common.Constants
import javax.inject.Inject

class SessionManager @Inject constructor(
    private val preferences: SharedPreferences
) {

    fun isLogged(): Boolean {
        return !preferences.getString(Constants.LOGGED_USER_KEY, null).isNullOrBlank()
    }

    fun setLoggedUser(fiscalCode: String) {
        preferences.edit().putString(Constants.LOGGED_USER_KEY, fiscalCode).apply()
    }

    fun getUserFiscalCode(): String? {
        return preferences.getString(Constants.LOGGED_USER_KEY, null)
    }

    fun logout() {
        preferences.edit().clear().apply()
    }
}