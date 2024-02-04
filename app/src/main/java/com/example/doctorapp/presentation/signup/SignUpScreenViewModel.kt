package com.example.doctorapp.presentation.signup

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.auth0.android.jwt.JWT
import com.example.doctorapp.common.Resource
import com.example.doctorapp.data.remote.dto.request.PatientRequestDto
import com.example.doctorapp.domain.model.Doctor
import com.example.doctorapp.domain.model.Gender
import com.example.doctorapp.domain.use_case.auth.SignUpUseCase
import com.example.doctorapp.domain.use_case.doctor.GetDoctorListUseCase
import com.example.doctorapp.session.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

@HiltViewModel
class SignUpScreenViewModel @Inject constructor(
    private val signUpUseCase: SignUpUseCase,
    private val getDoctorListUseCase: GetDoctorListUseCase,
    private val sessionManager: SessionManager
) : ViewModel() {
    val TAG: String = "SignUpScreenViewModel"

    var authState = sessionManager.getAuthState()

    var openDialog by mutableStateOf(false)

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
    val tabTitles = listOf("Your information", "Selected doctor")


    init {
        Log.d(TAG, "AuthState: " + authState.jsonSerializeString())
        if (authState.isAuthorized) {
            val jwt = JWT(authState.idToken!!)
            name = jwt.getClaim("given_name").asString()!!
            surname = jwt.getClaim("family_name").asString()!!
            email = jwt.getClaim("email").asString()!!
        }
    }

    fun signUp() {
        val patientRequestDto = PatientRequestDto(
            name = name,
            surname = surname,
            email = email,
            password = password,
            fiscalCode = fiscalCode.uppercase(),
            gender = Gender.valueOf(selectedGender),
            birthdayDate = parseBirthdayDate(),
            doctorFiscalCode = doctor!!.fiscalCode
        )

        Log.d(TAG, patientRequestDto.toString())

        signUpUseCase(patientRequestDto).onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    Log.d(TAG, "singUp: sono in loading")
                }

                is Resource.Success -> {
                    Log.d(TAG, "singUp: sono in success")
                    Log.d(TAG, "singUp: ${result.data}")
                    sessionManager.setUserFiscalCode(result.data!!.fiscalCode)
                    openDialog = !openDialog
                }

                is Resource.Error -> {
                    Log.d(TAG, "singUp: sono in error")
                    Log.d(TAG, "singUp: ${result.message}")
                }
            }
        }.launchIn(viewModelScope)
    }


    fun formattedBirthdayDateString() {
        birthdayDate = birthdayDate
            .substring(0, 2)
            .plus("-")
            .plus(birthdayDate.substring(2, 4))
            .plus("-")
            .plus(birthdayDate.substring(4, 8))
    }

    private fun parseBirthdayDate(): Date? {
        return SimpleDateFormat("dd-MM-yyyy", Locale.ITALIAN).parse(birthdayDate)
    }
}