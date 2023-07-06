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
import com.example.doctorapp.domain.model.Gender
import com.example.doctorapp.domain.use_case.auth.SignUpUseCase
import com.example.doctorapp.domain.use_case.doctor.GetDoctorListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale
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

    var passwordHidden by mutableStateOf(true)
    var repeatPasswordHidden by mutableStateOf(true)

    // PatientInformationScreen
    var name by mutableStateOf("")
    var surname by mutableStateOf("")
    var fiscalCode by mutableStateOf("")
    var genders = Gender.values()
    var genderMenuIsExpanded by mutableStateOf(false)
    var selectedGender by mutableStateOf("")
    var birthdayDate by mutableStateOf("")

    // ChooseDoctorScreen
    val doctorPager = getDoctorListUseCase.doctorPager
    var doctor: Doctor? = null

    //SummaryScreen
    var currentTab by mutableStateOf(0)
    val tabTitles = listOf("Your info", "Selected doctor")

    fun signUp(onSuccessCallback: () -> Unit) {
        Log.d(TAG, "sono in funzione signUp")
        Log.d(TAG, "DATA --> $birthdayDate")
        birthdayDate = "15/09/1996"
        val x = SimpleDateFormat("dd/MM/yyyy", Locale.ITALIAN).parse(birthdayDate)
        Log.d(TAG, "DATAFORMATTED --> $x")

        val patientRequestDto = PatientRequestDto(
            name = name,
            surname = surname,
            email = email,
            password = password,
            fiscalCode = fiscalCode,
            gender = Gender.valueOf(selectedGender),
            //birthdayDate = SimpleDateFormat("dd/MMM/yyyy", Locale.ITALIAN).parse(birthdayDate),
            doctorFiscalCode = doctor!!.fiscalCode
        )
        Log.d(TAG, "DATAPAZIENTE --> ${patientRequestDto.birthdayDate}")


        /*signUpUseCase(patientRequestDto).onEach { result ->
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
        }.launchIn(viewModelScope)*/
    }
}