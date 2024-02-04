package com.example.doctorapp.common

object Constants {
    const val RETROFIT_BASE_URL = "http://api-gateway-service.192.168.105.4.nip.io/api/"

    const val DATE_FORMAT = "dd-MM-yyyy"

    const val SHARED_PREFERENCES_KEY = "SESSION"
    const val AUTHSTATE_KEY = "AUTHSTATE"
    const val FIRST_ACCESS_KEY = "FIRSTACCESS"
    const val LOGGED_USER_KEY = "LOGGEDUSER"

    const val MESSAGE_DIGEST_ALGORITHM = "SHA-256"
    const val CODE_VERIFIER_CHALLENGE_METHOD = "S256"

    const val AUTHORIZATION_URL = "http://keycloak.192.168.105.4.nip.io/auth/realms/swagmed_oauth/protocol/openid-connect/auth"
    const val TOKEN_URL = "http://keycloak.192.168.105.4.nip.io/auth/realms/swagmed_oauth/protocol/openid-connect/token"
    const val LOGOUT_URL = "http://keycloak.192.168.105.4.nip.io/auth/realms/swagmed_oauth/protocol/openid-connect/logout"
    const val KEYCLOAK_CLIENT_ID = "swagmed-oauth-client"
    const val REDIRECT_AUTH_URL = "com.example.doctorapp://oauth/callback"
    const val REDIRECT_LOGOUT_URL = "com.example.doctorapp://oauth/logout"
}