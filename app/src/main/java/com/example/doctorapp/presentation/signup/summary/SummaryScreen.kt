package com.example.doctorapp.presentation.signup.summary

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Badge
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Medication
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.doctorapp.components.SimpleLottieFiles
import com.example.doctorapp.components.SimpleProfilePersonalInfo
import com.example.doctorapp.components.SimpleSignUpAlertDialog
import com.example.doctorapp.components.SimpleSummaryCard
import com.example.doctorapp.presentation.signup.SignUpScreenViewModel

@OptIn(ExperimentalMaterial3Api::class)
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
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Summary",
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = "See the summary of your registration data"
            )
        }

        TabRow(selectedTabIndex = viewModel.currentTab) {
            viewModel.tabTitles.forEachIndexed { index, title ->
                Tab(
                    selected = viewModel.currentTab == index,
                    onClick = { viewModel.currentTab = index },
                    text = {
                        Text(
                            text = title,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                )
            }
        }
        if (viewModel.currentTab == 0) {
            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                SimpleProfilePersonalInfo(
                    headLine = "Name",
                    supportingText = viewModel.name.plus(" ").plus(viewModel.surname),
                )
                SimpleProfilePersonalInfo(
                    headLine = "Email",
                    supportingText = viewModel.email,
                )
                SimpleProfilePersonalInfo(
                    headLine = "Fiscal code",
                    supportingText = viewModel.fiscalCode,
                )
                SimpleProfilePersonalInfo(
                    headLine = "Birthday",
                    supportingText = viewModel.birthdayDate,
                )
                SimpleProfilePersonalInfo(
                    headLine = "Gender",
                    supportingText = viewModel.selectedGender,
                )
            }
        } else if (viewModel.currentTab == 1) {
            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                SimpleProfilePersonalInfo(
                    headLine = "Name",
                    supportingText = viewModel.doctor!!.fullName(),
                )
                SimpleProfilePersonalInfo(
                    headLine = "Email",
                    supportingText = viewModel.doctor!!.email,
                )
                SimpleProfilePersonalInfo(
                    headLine = "Fiscal code",
                    supportingText = viewModel.doctor!!.fiscalCode,
                )
                SimpleProfilePersonalInfo(
                    headLine = "Birthday",
                    supportingText = viewModel.doctor!!.formattedBirthday(),
                )
                SimpleProfilePersonalInfo(
                    headLine = "Gender",
                    supportingText = viewModel.doctor!!.gender.toString(),
                )
                SimpleProfilePersonalInfo(
                    headLine = "Regional code",
                    supportingText = viewModel.doctor!!.regionalCode,
                )
                SimpleProfilePersonalInfo(
                    headLine = "ASL",
                    supportingText = viewModel.doctor!!.ASL,
                )
                SimpleProfilePersonalInfo(
                    headLine = "CHANGE DOCTOR",
                    supportingText = viewModel.doctor!!.ASL,
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f))
        Button(
            modifier = Modifier.padding(vertical = 16.dp),
            onClick = {
                viewModel.signUp()
            }) {
            Text(text = "Complete registration")
        }

    }

    if (viewModel.openDialog) {
        SimpleSignUpAlertDialog(
            viewModel = viewModel,
            onSignUpSuccess = onSignUpSuccess
        )
    }
}
