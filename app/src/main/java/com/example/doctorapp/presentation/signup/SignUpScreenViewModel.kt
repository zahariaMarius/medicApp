package com.example.doctorapp.presentation.signup

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doctorapp.common.Resource
import com.example.doctorapp.domain.use_case.auth.SignUpUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class SignUpScreenViewModel @Inject constructor(
    private val signUpUseCase: SignUpUseCase
) : ViewModel() {

    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var repeatPassword by mutableStateOf("")
    var termService by mutableStateOf(false)

    var passwordHidden by mutableStateOf(true)
    var repeatPasswordHidden by mutableStateOf(true)

    val TAG: String = "SIGNUP"

    fun singUp() {
        Log.d(TAG, "sono in funzione signUp")
        signUpUseCase().onEach { result ->
            when(result) {
                is Resource.Loading -> {
                    Log.d(TAG, "singUp: sono in loading")
                }
                is Resource.Success -> {
                    Log.d(TAG, "singUp: sono in success")
                    Log.d(TAG, "singUp: ${result.data}")
                }
                is Resource.Error -> {
                    Log.d(TAG, "singUp: sono in error")
                    Log.d(TAG, "singUp: ${result.message}")
                }
            }
        }.launchIn(viewModelScope)
    }
}