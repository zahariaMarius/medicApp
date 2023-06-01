package com.example.doctorapp.presentation.signup.information

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PatientInformationScreenViewModel @Inject constructor(
): ViewModel()  {

    var name by mutableStateOf("")
    var surname by mutableStateOf("")
    var fiscalCode by mutableStateOf("")


}