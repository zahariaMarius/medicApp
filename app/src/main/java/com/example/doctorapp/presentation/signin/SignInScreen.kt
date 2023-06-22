package com.example.doctorapp.presentation.signin

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Facebook
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Facebook
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.hilt.navigation.compose.hiltViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(
    viewModel: SignInScreenViewModel = hiltViewModel(),
    onSignUpClick: () -> Unit,
    onSignInSuccess: () -> Unit
) {
    Column(
        modifier = Modifier,
    ) {
        Text(
            text = "Welcome!",
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = "Signin to continue",
            //style = MaterialTheme.typography
        )
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
        Button(onClick = {
            viewModel.signIn(onSuccessCallback = onSignInSuccess)
        }) {
            Text(text = "Sign In")
        }
        Text(text = "or use one of your social profile")
        Row(modifier = Modifier) {
            Button(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Facebook,
                    contentDescription = "Sign In with Google"
                )
                Text(text = "Google")
            }
            Button(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Facebook,
                    contentDescription = "Sign In with Facebook"
                )
                Text(text = "Facebook")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Forgot password?")
            Text(modifier = Modifier.clickable { onSignUpClick() }, text = "Sign up")
        }
    }
}
