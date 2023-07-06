package com.example.doctorapp.presentation.signup

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doctorapp.common.Resource
import com.example.doctorapp.data.remote.dto.request.PatientRequestDto
import com.example.doctorapp.domain.model.Doctor
import com.example.doctorapp.domain.use_case.auth.SignUpUseCase
import com.example.doctorapp.domain.use_case.doctor.GetDoctorListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class SignUpScreenViewModel @Inject constructor(
    private val signUpUseCase: SignUpUseCase,
    private val getDoctorListUseCase: GetDoctorListUseCase,
) : ViewModel() {
    val TAG: String = "SIGNUP"

    // SignUpScreen
    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var repeatPassword by mutableStateOf("")
    var termService by mutableStateOf(false)

    var passwordHidden by mutableStateOf(true)
    var repeatPasswordHidden by mutableStateOf(true)

    // PatientInformationScreen
    var name by mutableStateOf("")
    var surname by mutableStateOf("")
    var fiscalCode by mutableStateOf("")

    // ChooseDoctorScreen
    val doctorPager = getDoctorListUseCase.doctorPager
    var doctor: Doctor? = null

    fun signUp(onSuccessCallback: () -> Unit) {
        Log.d(TAG, "sono in funzione signUp")

        val patientRequestDto = PatientRequestDto(
            name,
            surname,
            email,
            fiscalCode
        )
        signUpUseCase(patientRequestDto).onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    Log.d(TAG, "singUp: sono in loading")
                }

                is Resource.Success -> {
                    Log.d(TAG, "singUp: sono in success")
                    Log.d(TAG, "singUp: ${result.data}")
                    onSuccessCallback.invoke()
                }

                is Resource.Error -> {
                    Log.d(TAG, "singUp: sono in error")
                    Log.d(TAG, "singUp: ${result.message}")
                }
            }
        }.launchIn(viewModelScope)
    }
}