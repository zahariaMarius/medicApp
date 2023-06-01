package com.example.doctorapp.data.repository

import com.example.doctorapp.data.remote.api.AuthApi
import com.example.doctorapp.data.remote.dto.PatientDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import com.example.doctorapp.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val api: AuthApi
) : AuthRepository {

    override suspend fun signIn() {
        TODO("Not yet implemented")
    }

    override suspend fun signUp(): RemoteResponseDto<PatientDto> {
        return api.signup("rossetti@gmail.com")
    }

}