package com.example.doctorapp.presentation.signup.doctor


import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowCircleRight
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material.icons.outlined.ArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey
import com.example.doctorapp.presentation.signup.SignUpScreenViewModel
import androidx.compose.material3.FloatingActionButton
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ChooseDoctorScreen(
    viewModel: SignUpScreenViewModel,
    onContinueClick: () -> Unit
) {

    val doctors = viewModel.doctorPager.collectAsLazyPagingItems()

    Column(
        modifier = Modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Doctor",
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = "Choose your doctor",
            )
        }

        when (val state = doctors.loadState.refresh) {
            LoadState.Loading -> {
                Log.d("DOC", "sono in loading")
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CircularProgressIndicator()
                }
            }

            is LoadState.Error -> {
                Log.d("DOC", "sono in error ${state.error}")
                //TODO implement error state
            }

            else -> {
                Log.d("DOC", "sono in column")
                LazyColumn(
                    modifier = Modifier
                ) {
                    items(
                        count = doctors.itemCount,
                        key = doctors.itemKey(),
                        contentType = doctors.itemContentType()
                    ) { index ->
                        val doctor = doctors[index]
                        doctor?.let {
                            ListItem(
                                headlineContent = {
                                    Text(text = "Dott. ${doctor.fullName()}")
                                },
                                supportingContent = { Text(text = doctor.ASL) },
                                trailingContent = {
                                    TextButton(
                                        onClick = {
                                            viewModel.doctor = doctor
                                            onContinueClick()
                                        }) {
                                        Text(text = "Choose doctor")
                                        Spacer(modifier = Modifier.padding(4.dp))
                                        Icon(
                                            imageVector = Icons.Default.ArrowCircleRight,
                                            contentDescription = "Choose doctor"
                                        )
                                    }
                                }
                            )
                            Divider()
                        }
                    }
                }
            }
        }
    }
}