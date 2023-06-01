package com.example.doctorapp.presentation.signup

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
    viewModel: SignUpScreenViewModel = hiltViewModel(),
    onContinueClick: () -> Unit,
    onSignInClick: () -> Unit
) {
    Column(
        modifier = Modifier
    ) {
        Text(
            text = "Hi!",
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = "Create a new account",
            //style = MaterialTheme.typography
        )
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
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = viewModel.termService,
                onCheckedChange = {
                    viewModel.termService = it
                }
            )
            Text(
                buildAnnotatedString {
                    append("I agree to the ")
                    withStyle(
                        style = SpanStyle(
                            color = Color.Green
                        )
                    ) {
                        append("Term of Service ")
                    }
                    append("and ")
                    withStyle(
                        style = SpanStyle(
                            color = Color.Green
                        )
                    ) {
                        append("Privacy Policy")
                    }
                }
            )
        }
        Button(onClick = {
            onContinueClick()
        }) {
            Text(text = "Continue")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Have an Account?")
            Text(
                modifier = Modifier.clickable { onSignInClick() },
                text = "Sign In"
            )
        }
    }
}