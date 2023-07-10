package com.example.doctorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.doctorapp.navigation.graph.Graph
import com.example.doctorapp.navigation.host.RootNavHost
import com.example.doctorapp.presentation.signin.SignInScreen
import com.example.doctorapp.session.SessionManager
import com.example.doctorapp.ui.theme.DoctorAppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var sessionManager: SessionManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DoctorAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RootNavHost(
                        startDestination =
                        if (sessionManager.isFirstAccess()) Graph.ONBOARD
                        else if (sessionManager.isLogged()) Graph.HOME
                        else Graph.AUTH,
                        sessionManager = sessionManager
                    )
                }
            }
        }
    }
}

