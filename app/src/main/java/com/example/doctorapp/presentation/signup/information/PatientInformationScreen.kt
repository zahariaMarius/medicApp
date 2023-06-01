package com.example.doctorapp.presentation.signup.information

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.hilt.navigation.compose.hiltViewModel

@SuppressLint("UnrememberedMutableState")
@Composable
fun PatientInformationScreen(
    viewModel: PatientInformationScreenViewModel = hiltViewModel(),
    onContinueClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxHeight(),
    ) {
        Text(
            text = "Your information's",
            style = MaterialTheme.typography.headlineLarge
        )
        OutlinedTextField(
            value = viewModel.name,
            onValueChange = { viewModel.name = it },
            label = { Text(text = "Name") }
        )
        OutlinedTextField(
            value = viewModel.surname,
            onValueChange = { viewModel.surname = it },
            label = { Text(text = "Surname") },
        )
        OutlinedTextField(
            value = viewModel.fiscalCode,
            onValueChange = { viewModel.fiscalCode = it },
            label = { Text(text = "Fiscal code") }
        )
        Button(onClick = {
            onContinueClick()
        }) {
            Text(text = "Continue")
        }

    }
}



