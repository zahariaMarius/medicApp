package com.example.doctorapp.presentation.signup.information

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.hilt.navigation.compose.hiltViewModel
import com.example.doctorapp.presentation.signup.SignUpScreenViewModel

@SuppressLint("UnrememberedMutableState")
@Composable
fun PatientInformationScreen(
    viewModel: SignUpScreenViewModel,
    onContinueClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Your information's",
                style = MaterialTheme.typography.headlineLarge
            )
        }

        Column(
            modifier = Modifier.fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
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

/*
            ExposedDropdownMenuBox(
                expanded = ,
                onExpandedChange =
            ) {

            }*/



            Button(onClick = {
                onContinueClick()
            }) {
                Text(text = "Continue")
            }
        }

    }
}



