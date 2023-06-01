package com.example.doctorapp.navigation.host

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.doctorapp.navigation.graph.Graph
import com.example.doctorapp.navigation.screen.AuthScreen
import com.example.doctorapp.presentation.signin.SignInScreen

@Composable
fun SignInNavHost(
    modifier: Modifier,
    rootNavHostController: NavHostController,
    navHostController: NavHostController,
    startDestination: String,
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        route = Graph.AUTH,
        startDestination = startDestination
    ) {
        composable(
            route = AuthScreen.SignIn.route
        ) {
            SignInScreen(
                onSignInClick = { rootNavHostController.navigate(Graph.HOME) },
                onSignUpClick = { rootNavHostController.navigate(Graph.SIGNUP) }
            )
        }
    }
}