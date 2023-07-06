package com.example.doctorapp.presentation.signin

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.doctorapp.navigation.host.SignInNavHost
import com.example.doctorapp.navigation.screen.AuthScreen
import com.example.doctorapp.navigation.screen.SignUpScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreenContent(
    rootNavHostController: NavHostController,
    navHostController: NavHostController = rememberNavController()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "") },
                navigationIcon = {}
            )
        },
    ) { contentPadding ->
        SignInNavHost(
            modifier = Modifier.padding(contentPadding),
            rootNavHostController = rootNavHostController,
            navHostController = navHostController,
            startDestination = AuthScreen.SignIn.route
        )
    }
}