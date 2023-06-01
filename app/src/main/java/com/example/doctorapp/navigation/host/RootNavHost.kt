package com.example.doctorapp.navigation.host

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.doctorapp.navigation.graph.Graph
import com.example.doctorapp.presentation.home.HomeScreenContent
import com.example.doctorapp.presentation.signin.SignInScreenContent
import com.example.doctorapp.presentation.signup.SignUpScreenContent

@Composable
fun RootNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController(),
    startDestination: String
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        route = Graph.ROOT,
        startDestination = startDestination
    ) {
        composable(
            route = Graph.AUTH
        ) {
            SignInScreenContent(
                rootNavHostController = navHostController
            )
        }
        composable(
            route = Graph.SIGNUP
        ) {
            SignUpScreenContent(
                rootNavHostController = navHostController
            )
        }
        composable(
            route = Graph.HOME
        ) {
            HomeScreenContent()
        }
    }
}