package com.example.doctorapp.domain.repository

import com.example.doctorapp.data.local.entity.PatientEntity
import com.example.doctorapp.data.remote.dto.PatientDto
import com.example.doctorapp.data.remote.dto.request.AuthRequestDto
import com.example.doctorapp.data.remote.dto.request.PatientRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto

interface AuthRepository {
    suspend fun signIn(authRequestDto: AuthRequestDto): RemoteResponseDto<PatientDto>
    suspend fun signUp(patientRequestDto: PatientRequestDto): RemoteResponseDto<PatientDto>
}