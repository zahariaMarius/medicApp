package com.example.doctorapp.presentation.home.profile

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doctorapp.common.Resource
import com.example.doctorapp.domain.model.Doctor
import com.example.doctorapp.domain.model.Patient
import com.example.doctorapp.domain.use_case.doctor.GetDoctorProfileUseCase
import com.example.doctorapp.domain.use_case.patient.GetPatientProfileUseCase
import com.example.doctorapp.session.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ProfileScreenViewModel @Inject constructor(
    private val sessionManager: SessionManager,
    private val getPatientProfileUseCase: GetPatientProfileUseCase,
    private val getDoctorProfileUseCase: GetDoctorProfileUseCase
) : ViewModel() {

    var currentTab by mutableStateOf(0)
    val tabTitles = listOf("Personal", "Your doctor")

    var isPatientLoaded by mutableStateOf(false)
    var isDoctorLoaded by mutableStateOf(false)

    lateinit var patient: Patient
    lateinit var doctor: Doctor

    private fun getDoctorProfile() {
        getDoctorProfileUseCase(doctorFiscalCode = patient.doctorFiscalCode).onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    Log.d("DOCTOR_PROFILE", "sono in loading")
                }

                is Resource.Success -> {
                    isDoctorLoaded = true
                    Log.d("DOCTOR_PROFILE", result.data.toString())
                    doctor = result.data!!
                }

                is Resource.Error -> {
                    Log.d("DOCTOR_PROFILE", result.message.toString())
                }
            }
        }.launchIn(viewModelScope)
    }

    init {
        getPatientProfileUseCase(sessionManager.getUserFiscalCode()!!).onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    Log.d("USER_PROFILE", "sono in loading")
                }

                is Resource.Success -> {
                    isPatientLoaded = true
                    Log.d("USER_PROFILE", result.data.toString())
                    patient = result.data!!
                    getDoctorProfile()
                }

                is Resource.Error -> {
                    Log.d("USER_PROFILE", result.toString())
                }
            }
        }.launchIn(viewModelScope)
    }

}