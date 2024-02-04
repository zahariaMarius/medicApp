package com.example.doctorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.doctorapp.navigation.graph.Graph
import com.example.doctorapp.navigation.host.RootNavHost
import com.example.doctorapp.presentation.signin.SignInScreen
import com.example.doctorapp.session.AuthServiceHelper
import com.example.doctorapp.session.SessionManager
import com.example.doctorapp.ui.theme.DoctorAppTheme
import dagger.hilt.android.AndroidEntryPoint
import net.openid.appauth.AppAuthConfiguration
import net.openid.appauth.AuthorizationService
import java.net.HttpURLConnection
import java.net.URL
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    @Inject
    lateinit var sessionManager: SessionManager
    @Inject
    lateinit var authServiceHelper: AuthServiceHelper
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
                        else if (sessionManager.getAuthState().isAuthorized) Graph.HOME
                        else Graph.AUTH,
                        sessionManager = sessionManager,
                        authServiceHelper = authServiceHelper
                    )
                }
            }
        }
    }
}

