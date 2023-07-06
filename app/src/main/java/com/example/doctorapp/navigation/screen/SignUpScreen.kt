package com.example.doctorapp.navigation.screen

sealed class SignUpScreen(val route: String) {
    object SignUp: SignUpScreen("SIGNUP")
    object PatientInformation : SignUpScreen("PATIENT_INFORMATION")
    object ChooseDoctor : SignUpScreen("CHOOSE_DOCTOR")
    object Summary : SignUpScreen("SUMMARY")

}
