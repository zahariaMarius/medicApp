package com.example.doctorapp.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.outlined.Logout
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.doctorapp.components.SimpleModalNavigationDrawer
import com.example.doctorapp.navigation.graph.Graph
import com.example.doctorapp.navigation.host.HomeNavHost
import com.example.doctorapp.navigation.screen.HomeScreen
import com.example.doctorapp.navigation.screen.SignUpScreen
import com.example.doctorapp.session.SessionManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenContent(
    rootNavHostController: NavHostController,
    navHostController: NavHostController = rememberNavController(),
    sessionManager: SessionManager
) {
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val openDialog = remember { mutableStateOf(false) }

    SimpleModalNavigationDrawer(
        drawerState = drawerState,
        navHostController = navHostController
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        when (navBackStackEntry?.destination?.route) {
                            HomeScreen.Home.route -> Text(text = "Home")
                            HomeScreen.BookVisit.route -> Text(text = "Book visit")
                            HomeScreen.Profile.route -> {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(text = "Profile")
                                    TextButton(
                                        onClick = {
                                            openDialog.value = true
                                        }
                                    ) {
                                        Text(text = "Logout")
                                        Icon(Icons.Outlined.Logout, contentDescription = "Logout")
                                    }
                                }
                            }
                        }
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch { drawerState.open() }
                        }) {
                            Icon(
                                imageVector = Icons.Rounded.Menu,
                                contentDescription = "Drawer Icon"
                            )
                        }
                    }
                )
            },
        ) { contentPadding ->
            HomeNavHost(
                modifier = Modifier.padding(contentPadding),
                rootNavHostController = rootNavHostController,
                navHostController = navHostController,
                startDestination = HomeScreen.Home.route
            )
        }

        if (openDialog.value) {
            AlertDialog(
                onDismissRequest = {},
                title = {
                    Text(
                        text = "Goodbye!",
                    )
                },
                text = {
                    Text(
                        "Are you sure you want to log out?"
                    )
                },
                confirmButton = {
                    TextButton(
                        onClick = {
                            openDialog.value = false
                            sessionManager.logout()
                            rootNavHostController.navigate(Graph.AUTH) {
                                rootNavHostController.popBackStack()
                            }
                        }
                    ) {
                        Text("Confirm")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            openDialog.value = false
                        }
                    ) {
                        Text("Dismiss")
                    }
                }
            )
        }
    }
}

