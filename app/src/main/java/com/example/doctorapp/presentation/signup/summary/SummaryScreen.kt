package com.example.doctorapp.presentation.signup.summary

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Badge
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Medication
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.doctorapp.components.SimpleSummaryCard
import com.example.doctorapp.presentation.signup.SignUpScreenViewModel

@Composable
fun SummaryScreen(
    viewModel: SignUpScreenViewModel,
    onBasicInformationEditClick: () -> Unit,
    onInformationEditClick: () -> Unit,
    onDoctorEditClick: () -> Unit,
    onSignUpSuccess: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Summary",
            style = MaterialTheme.typography.headlineLarge
        )

        SimpleSummaryCard(
            imageVector = Icons.Filled.Email,
            headLine = "Email",
            supportingText = viewModel.email,
            onEditClick = onBasicInformationEditClick
        )

        SimpleSummaryCard(
            imageVector = Icons.Filled.AccountCircle,
            headLine = "Name",
            supportingText = viewModel.name.plus(" ").plus(viewModel.surname),
            onEditClick = onInformationEditClick
        )

        SimpleSummaryCard(
            imageVector = Icons.Filled.Badge,
            headLine = "Fiscal code",
            supportingText = viewModel.fiscalCode,
            onEditClick = onInformationEditClick
        )

        SimpleSummaryCard(
            imageVector = Icons.Filled.CalendarMonth,
            headLine = "Name",
            supportingText = "Matte Miceli",
            onEditClick = onInformationEditClick
        )

        SimpleSummaryCard(
            imageVector = Icons.Filled.Medication,
            headLine = "Doctor",
            supportingText = viewModel.doctor!!.fullName(),
            onEditClick = onDoctorEditClick
        )

        ElevatedButton(onClick = {
            viewModel.signUp(onSuccessCallback= onSignUpSuccess)
        }) {
            Text(text = "SIGN UP")
        }

    }
}
