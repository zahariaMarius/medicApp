package com.example.doctorapp.presentation.signup

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.doctorapp.navigation.host.SignUpNavHost
import com.example.doctorapp.navigation.screen.SignUpScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreenContent(
    rootNavHostController: NavHostController,
    navHostController: NavHostController = rememberNavController(),
    viewModel: SignUpScreenViewModel
) {
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "") },
                navigationIcon = {
                    if (navBackStackEntry?.destination?.route != SignUpScreen.SignUp.route) {
                        IconButton(
                            onClick = {
                                navHostController.navigateUp()
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = "Back"
                            )
                        }
                    }
                }
            )
        }
    ) { contentPadding ->
        SignUpNavHost(
            modifier = Modifier.padding(contentPadding),
            rootNavHostController = rootNavHostController,
            navHostController = navHostController,
            startDestination = SignUpScreen.SignUp.route,
            viewModel = viewModel
        )
    }
}