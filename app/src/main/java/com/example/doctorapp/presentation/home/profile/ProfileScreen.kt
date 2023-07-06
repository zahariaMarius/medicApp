package com.example.doctorapp.presentation.home.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.doctorapp.components.SimpleProfilePersonalInfo
import com.example.doctorapp.components.SimpleSummaryCard

@Composable
fun ProfileScreen(
    viewModel: ProfileScreenViewModel = hiltViewModel(),
) {
    if (!viewModel.isPatientLoaded) {
        CircularProgressIndicator()
    } else {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .padding(16.dp)
                            .size(75.dp)
                            .background(Color.Black, shape = CircleShape),
                        contentAlignment = Alignment.Center,
                    ) {}
                }
                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = viewModel.patient.fullName(), fontWeight = FontWeight.Bold)
                    Text(text = viewModel.patient.email)
                }
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
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(horizontal = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    SimpleProfilePersonalInfo(
                        headLine = "Email",
                        supportingText = viewModel.patient.email
                    )
                    SimpleProfilePersonalInfo(
                        headLine = "Fiscal code",
                        supportingText = viewModel.patient.fiscalCode
                    )
                    SimpleProfilePersonalInfo(
                        headLine = "Birthday",
                        supportingText = viewModel.patient.formattedBirthday()
                    )
                    SimpleProfilePersonalInfo(
                        headLine = "Gender",
                        supportingText = viewModel.patient.gender.toString()
                    )
                    SimpleProfilePersonalInfo(
                        headLine = "Blood group",
                        supportingText = "A+"
                    )
                    SimpleProfilePersonalInfo(
                        headLine = "Weight",
                        supportingText = "68 Kg"
                    )
                    SimpleProfilePersonalInfo(
                        headLine = "Height",
                        supportingText = "169 cm"
                    )
                }
            } else if (viewModel.currentTab == 1) {
                if (!viewModel.isDoctorLoaded) {
                    CircularProgressIndicator()
                } else {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(horizontal = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {

                        SimpleProfilePersonalInfo(
                            headLine = "Name",
                            supportingText = viewModel.doctor.fullName()
                        )
                        SimpleProfilePersonalInfo(
                            headLine = "Email",
                            supportingText = viewModel.doctor.email
                        )
                        SimpleProfilePersonalInfo(
                            headLine = "Fiscal code",
                            supportingText = viewModel.doctor.fiscalCode
                        )
                        SimpleProfilePersonalInfo(
                            headLine = "Birthday",
                            supportingText = viewModel.doctor.formattedBirthday()
                        )
                        SimpleProfilePersonalInfo(
                            headLine = "Gender",
                            supportingText = viewModel.doctor.gender.toString()
                        )
                        SimpleProfilePersonalInfo(
                            headLine = "Regional code",
                            supportingText = viewModel.doctor.regionalCode
                        )
                        SimpleProfilePersonalInfo(
                            headLine = "ASL",
                            supportingText = viewModel.doctor.ASL
                        )
                    }
                }
            }
        }
    }
}