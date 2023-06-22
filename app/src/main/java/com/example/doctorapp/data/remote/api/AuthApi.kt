package com.example.doctorapp.data.remote.api

import androidx.paging.PagingSource
import com.example.doctorapp.data.remote.dto.DoctorDto
import com.example.doctorapp.data.remote.dto.PatientDto
import com.example.doctorapp.data.remote.dto.request.AuthRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthApi {

    @POST("signin")
    suspend fun signIn(@Body authRequestDto: AuthRequestDto): RemoteResponseDto<PatientDto>

    // TODO: possibile errore api/patient/patient
    @GET("patient")
    suspend fun signup(
        @Query("email") email: String
    ): RemoteResponseDto<PatientDto>

    companion object {
        const val BASE_URL = "http://10.0.2.2:8090/api/patient/"
    }
}