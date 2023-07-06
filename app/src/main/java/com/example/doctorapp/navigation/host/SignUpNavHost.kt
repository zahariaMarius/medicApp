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
import com.example.doctorapp.presentation.signup.SignUpScreenViewModel
import com.example.doctorapp.presentation.signup.doctor.ChooseDoctorScreen
import com.example.doctorapp.presentation.signup.information.PatientInformationScreen
import com.example.doctorapp.presentation.signup.summary.SummaryScreen

@Composable
fun SignUpNavHost(
    modifier: Modifier,
    rootNavHostController: NavHostController,
    navHostController: NavHostController,
    startDestination: String,
    viewModel: SignUpScreenViewModel
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
                },
                viewModel = viewModel
            )
        }
        composable(
            route = SignUpScreen.PatientInformation.route
        ) {
            PatientInformationScreen(
                onContinueClick = {
                    navHostController.navigate(SignUpScreen.ChooseDoctor.route)
                },
                viewModel = viewModel
            )
        }
        composable(
            route = SignUpScreen.ChooseDoctor.route
        ) {
            ChooseDoctorScreen(
                onContinueClick = {
                    navHostController.navigate(SignUpScreen.Summary.route)
                },
                viewModel = viewModel
            )
        }
        composable(
            route = SignUpScreen.Summary.route
        ) {
            SummaryScreen(
                viewModel = viewModel,
                onBasicInformationEditClick = {
                    navHostController.navigate(SignUpScreen.SignUp.route)
                },
                onInformationEditClick = {
                    navHostController.navigate(SignUpScreen.PatientInformation.route)

                },
                onDoctorEditClick = {
                    navHostController.navigate(SignUpScreen.ChooseDoctor.route)

                },
                onSignUpSuccess = {
                    rootNavHostController.navigate(Graph.AUTH)
                }
            )
        }
    }
}