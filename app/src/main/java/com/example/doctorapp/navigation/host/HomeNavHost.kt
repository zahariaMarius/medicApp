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
import com.example.doctorapp.presentation.home.request_prescription.RequestPrescriptionScreen
import com.example.doctorapp.presentation.home.visit.VisitScreen

@Composable
fun HomeNavHost(
    modifier: Modifier,
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
            VisitScreen()
        }
        composable(
            route = HomeScreen.BookVisit.route
        ) {
            BookVisitScreen()
        }
        composable(
            route = HomeScreen.RequestPrescription.route
        ) {
            RequestPrescriptionScreen()
        }
    }

}