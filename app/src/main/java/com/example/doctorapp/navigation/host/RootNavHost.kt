package com.example.doctorapp.navigation.host

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.doctorapp.navigation.graph.Graph
import com.example.doctorapp.presentation.home.HomeScreenContent
import com.example.doctorapp.presentation.onboard.OnboardScreen
import com.example.doctorapp.presentation.signin.SignInScreenContent
import com.example.doctorapp.presentation.signup.SignUpScreenContent
import com.example.doctorapp.presentation.signup.SignUpScreenViewModel
import com.example.doctorapp.session.AuthServiceHelper
import com.example.doctorapp.session.SessionManager
import net.openid.appauth.AuthorizationService

@Composable
fun RootNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController(),
    startDestination: String,
    sessionManager: SessionManager,
    authServiceHelper: AuthServiceHelper
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        route = Graph.ROOT,
        startDestination = startDestination
    ) {
        composable(
            route = Graph.ONBOARD
        ) {
            OnboardScreen(
                rootNavHostController = navHostController,
                sessionManager = sessionManager
            )
        }
        composable(
            route = Graph.AUTH
        ) {
            SignInScreenContent(
                rootNavHostController = navHostController,
                authServiceHelper = authServiceHelper
            )
        }
        composable(
            route = Graph.SIGNUP
        ) {
            SignUpScreenContent(
                rootNavHostController = navHostController,
                viewModel = hiltViewModel<SignUpScreenViewModel>()
            )
        }
        composable(
            route = Graph.HOME
        ) {
            HomeScreenContent(
                rootNavHostController = navHostController,
                sessionManager = sessionManager,
                authServiceHelper = authServiceHelper
            )
        }
    }
}