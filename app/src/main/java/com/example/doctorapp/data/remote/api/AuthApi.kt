package com.example.doctorapp.data.remote.api

import androidx.paging.PagingSource
import com.example.doctorapp.data.remote.dto.DoctorDto
import com.example.doctorapp.data.remote.dto.PatientDto
import com.example.doctorapp.data.remote.dto.request.AuthRequestDto
import com.example.doctorapp.data.remote.dto.request.PatientRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthApi {

    @POST("patient/search")
    suspend fun signIn(@Body authRequestDto: AuthRequestDto): RemoteResponseDto<PatientDto>

    // TODO: possibile errore api/patient/patient
    @POST("patient")
    suspend fun signup(@Body patientRequestDto: PatientRequestDto): RemoteResponseDto<PatientDto>
}