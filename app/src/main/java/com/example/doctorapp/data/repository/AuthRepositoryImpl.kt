package com.example.doctorapp.data.repository

import androidx.room.withTransaction
import com.example.doctorapp.data.local.database.PatientDatabase
import com.example.doctorapp.data.local.entity.PatientEntity
import com.example.doctorapp.data.remote.api.AuthApi
import com.example.doctorapp.data.remote.dto.PatientDto
import com.example.doctorapp.data.remote.dto.request.AuthRequestDto
import com.example.doctorapp.data.remote.dto.request.PatientRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import com.example.doctorapp.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val api: AuthApi,
) : AuthRepository {

    override suspend fun signIn(authRequestDto: AuthRequestDto): RemoteResponseDto<PatientDto> {
        return api.signIn(authRequestDto)
    }

    override suspend fun signUp(patientRequestDto: PatientRequestDto): RemoteResponseDto<PatientDto> {
        return api.signup(patientRequestDto)
    }

}