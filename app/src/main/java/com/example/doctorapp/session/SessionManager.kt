package com.example.doctorapp.session

import android.content.SharedPreferences
import android.util.Log
import com.example.doctorapp.common.Constants
import javax.inject.Inject

class SessionManager @Inject constructor(
    private val preferences: SharedPreferences
) {
    fun setFirstAccess() {
        preferences.edit().putBoolean(Constants.FIRST_ACCESS_KEY, false).apply()
    }

    fun isFirstAccess(): Boolean {
        return preferences.getBoolean(Constants.FIRST_ACCESS_KEY, true)
    }

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
        preferences.edit().remove(Constants.LOGGED_USER_KEY).apply()
    }
}