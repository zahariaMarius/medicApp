package com.example.doctorapp.presentation.signup.information

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

import androidx.hilt.navigation.compose.hiltViewModel
import com.example.doctorapp.common.DateVisualTransformation
import com.example.doctorapp.presentation.signup.SignUpScreenViewModel

@OptIn(ExperimentalMaterial3Api::class)
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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Information",
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = "Add your own information"
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
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
                label = { Text(text = "Fiscal code") },
                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.Characters
                )
            )

            ExposedDropdownMenuBox(
                expanded = viewModel.genderMenuIsExpanded,
                onExpandedChange = {
                    viewModel.genderMenuIsExpanded = !viewModel.genderMenuIsExpanded
                },
            ) {
                OutlinedTextField(
                    // The `menuAnchor` modifier must be passed to the text field for correctness.
                    modifier = Modifier.menuAnchor(),
                    readOnly = true,
                    value = viewModel.selectedGender,
                    onValueChange = {},
                    label = { Text("Gender") },
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = viewModel.genderMenuIsExpanded) }
                )
                ExposedDropdownMenu(
                    expanded = viewModel.genderMenuIsExpanded,
                    onDismissRequest = { viewModel.genderMenuIsExpanded = false },
                ) {
                    viewModel.genders.forEach { selectionOption ->
                        DropdownMenuItem(
                            text = { Text(selectionOption.toString()) },
                            onClick = {
                                viewModel.selectedGender = selectionOption.toString()
                                viewModel.genderMenuIsExpanded = false
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                        )
                    }
                }
            }

            OutlinedTextField(
                singleLine = true,
                value = viewModel.birthdayDate,
                label = { Text("Birthday") },
                placeholder = { Text("DD-MM-YYYY") },
                //keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                onValueChange = {
                    if (it.length <= 8) viewModel.birthdayDate = it
                },
                visualTransformation = DateVisualTransformation()
            )

            Button(onClick = {
                viewModel.formattedBirthdayDateString()
                onContinueClick()
            }) {
                Text(text = "Continue")
            }
        }

    }
}



