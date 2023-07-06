package com.example.doctorapp.presentation.signin

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doctorapp.common.Resource
import com.example.doctorapp.data.remote.dto.request.AuthRequestDto
import com.example.doctorapp.domain.use_case.auth.SignInUseCase
import com.example.doctorapp.session.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject


@HiltViewModel
class SignInScreenViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase,
    private val sessionManager: SessionManager
) : ViewModel() {

    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var passwordHidden by mutableStateOf(true)
    var inLoading by mutableStateOf(false)

    fun signIn(onSuccessCallback: () -> Unit) {

        val authRequestDto = AuthRequestDto(email, password)

        signInUseCase(authRequestDto).onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    Log.d("SIGNINMODEL", "sono in loading")
                    inLoading = !inLoading
                }

                is Resource.Success -> {
                    Log.d("SIGNINMODEL", result.toString())
                    sessionManager.setLoggedUser(result.data!!.fiscalCode)
                    onSuccessCallback.invoke()
                }

                is Resource.Error -> {
                    inLoading = !inLoading
                    Log.d("SIGNINMODEL", result.toString())
                }
            }
        }.launchIn(viewModelScope)
    }


}