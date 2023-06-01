package com.example.doctorapp.navigation.host

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.doctorapp.navigation.graph.Graph
import com.example.doctorapp.navigation.screen.AuthScreen
import com.example.doctorapp.navigation.screen.SignUpScreen
import com.example.doctorapp.presentation.signin.SignInScreen
import com.example.doctorapp.presentation.signup.SignUpScreen
import com.example.doctorapp.presentation.signup.doctor.ChooseDoctorScreen
import com.example.doctorapp.presentation.signup.information.PatientInformationScreen

@Composable
fun SignUpNavHost(
    modifier: Modifier,
    rootNavHostController: NavHostController,
    navHostController: NavHostController,
    startDestination: String,
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        route = Graph.SIGNUP,
        startDestination = startDestination
    ) {
        composable(
            route = SignUpScreen.SignUp.route
        ) {
            SignUpScreen(
                onContinueClick = {
                    navHostController.navigate(SignUpScreen.PatientInformation.route)
                },
                onSignInClick = {
                    rootNavHostController.navigate(Graph.AUTH)
                }
            )
        }
        composable(
            route = SignUpScreen.PatientInformation.route
        ) {
            PatientInformationScreen(
                onContinueClick = {
                    navHostController.navigate(SignUpScreen.ChooseDoctor.route)
                }
            )
        }
        composable(
            route = SignUpScreen.ChooseDoctor.route
        ) {
            ChooseDoctorScreen()
        }
    }
}