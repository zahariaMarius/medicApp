package com.example.doctorapp.presentation.signup

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
    viewModel: SignUpScreenViewModel,
    onContinueClick: () -> Unit,
    onSignInClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            Text(
                text = "Hi!",
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = "Create a new account",
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
                label = {
                    Text(text = "Email")
                },
                singleLine = true
            )
            OutlinedTextField(
                value = viewModel.password,
                onValueChange = {
                    viewModel.password = it
                },
                label = {
                    Text(text = "Password")
                },
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
            OutlinedTextField(
                value = viewModel.repeatPassword,
                onValueChange = {
                    viewModel.repeatPassword = it
                },
                label = {
                    Text(text = "Repeat password")
                },
                singleLine = true,
                visualTransformation = if (viewModel.repeatPasswordHidden) PasswordVisualTransformation()
                else VisualTransformation.None,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    IconButton(
                        onClick = { viewModel.repeatPasswordHidden = !viewModel.repeatPasswordHidden }
                    ) {
                        val visibilityIcon =
                            if (viewModel.repeatPasswordHidden) Icons.Filled.Visibility
                            else Icons.Filled.VisibilityOff
                        val description =
                            if (viewModel.repeatPasswordHidden) "Show password" else "Hide password"
                        Icon(imageVector = visibilityIcon, contentDescription = description)
                    }
                }
            )
            Button(onClick = {
                onContinueClick()
            }) {
                Text(text = "Continue")
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
                Text(text = "Have an Account?")
                Text(
                    modifier = Modifier.clickable { onSignInClick() },
                    text = "Sign In",
                    fontWeight = FontWeight.Bold

                )
            }
        }
    }
}