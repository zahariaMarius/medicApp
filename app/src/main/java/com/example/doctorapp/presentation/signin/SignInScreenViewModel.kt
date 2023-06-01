package com.example.doctorapp.presentation.signin

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.doctorapp.domain.use_case.auth.SignInUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import org.json.JSONObject
import javax.inject.Inject


@HiltViewModel
class SignInScreenViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase
) : ViewModel() {

    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var passwordHidden by mutableStateOf(true)

    fun signIn() {
        signInUseCase
    }


}