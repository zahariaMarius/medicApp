package com.example.doctorapp.presentation.signin

import android.app.Activity.RESULT_OK
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.doctorapp.R
import com.example.doctorapp.session.AuthServiceHelper
import kotlin.math.sign


@Composable
fun SignInScreen(
    viewModel: SignInScreenViewModel = hiltViewModel(),
    authServiceHelper: AuthServiceHelper,
    goToSignUp: () -> Unit,
    onSignInSuccess: () -> Unit
) {

    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult(),
        onResult = {
            if (it.resultCode == RESULT_OK) {
                authServiceHelper.handleAuthorizationResponse(
                    intent = it.data!!,
                    signInWithSocial = {
                        viewModel.signInWithSocial(
                            onSuccessCallback = onSignInSuccess,
                            onFailedCallback = goToSignUp
                        )
                    }
                )
            }
        }
    )

    Column(
        modifier = Modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.medicapp_vector),
                contentDescription = "",
                modifier = Modifier.size(200.dp, 200.dp)
            )
            Text(
                text = "Welcome!",
                style = MaterialTheme.typography.headlineLarge,
            )
            Text(
                text = "Signin to continue",
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            OutlinedTextField(
                value = viewModel.email,
                onValueChange = {
                    viewModel.email = it
                },
                label = { Text("Email") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                ),
            )
            OutlinedTextField(
                value = viewModel.password,
                onValueChange = { viewModel.password = it },
                label = { Text(text = "Password") },
                singleLine = true,
                visualTransformation = if (viewModel.passwordHidden) PasswordVisualTransformation()
                else VisualTransformation.None,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    IconButton(
                        onClick = { viewModel.passwordHidden = !viewModel.passwordHidden }
                    ) {
                        val visibilityIcon =
                            if (viewModel.passwordHidden) Icons.Filled.Visibility
                            else Icons.Filled.VisibilityOff
                        val description =
                            if (viewModel.passwordHidden) "Show password" else "Hide password"
                        Icon(imageVector = visibilityIcon, contentDescription = description)
                    }
                }
            )
            Button(
                modifier = Modifier,
                onClick = {
                    viewModel.signInWithCredential {
                        onSignInSuccess()
                    }
                }
            ) {
                Text(text = "Sign In with credential")
            }
            Text(text = "or")
            Button(onClick = {
                launcher.launch(authServiceHelper.buildAuthRequestIntent())
            }) {
                if (viewModel.inLoading)
                    CircularProgressIndicator(color = Color.White)
                else
                    Text(text = "Sign in with social")
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Divider()
            Row(
                modifier = Modifier.padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                Text(text = "Don't have an account yet?")
                Text(
                    modifier = Modifier
                        .clickable { goToSignUp() },
                    text = "Sign Up",
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
