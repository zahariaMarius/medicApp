package com.example.doctorapp.navigation.host

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.doctorapp.navigation.graph.Graph
import com.example.doctorapp.navigation.screen.HomeScreen
import com.example.doctorapp.presentation.home.HomeScreen
import com.example.doctorapp.presentation.home.book_visit.BookVisitScreen
import com.example.doctorapp.presentation.home.profile.ProfileScreen

@Composable
fun HomeNavHost(
    modifier: Modifier,
    rootNavHostController: NavHostController,
    navHostController: NavHostController,
    startDestination: String
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        route = Graph.HOME,
        startDestination = startDestination
    ) {
        composable(
            route = HomeScreen.Home.route
        ) {
            HomeScreen()
        }
        composable(
            route = HomeScreen.Profile.route
        ) {
            ProfileScreen()
        }

    }

}