package com.example.doctorapp.data.remote.api

import com.example.doctorapp.common.Constants
import com.example.doctorapp.data.remote.dto.DoctorDto
import com.example.doctorapp.data.remote.dto.request.DoctorRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import retrofit2.http.Url


interface DoctorApi {

    @POST("search")
    suspend fun getDoctor(
        @Body doctorRequestDto: DoctorRequestDto
    ): RemoteResponseDto<DoctorDto>
}