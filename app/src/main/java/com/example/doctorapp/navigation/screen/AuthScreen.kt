package com.example.doctorapp.navigation.screen

sealed class AuthScreen(val route: String) {
    object SignIn : AuthScreen("SIGNIN")
}
