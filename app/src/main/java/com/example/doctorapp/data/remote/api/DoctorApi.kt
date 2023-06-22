package com.example.doctorapp.data.remote.api

import com.example.doctorapp.data.remote.dto.DoctorDto
import com.example.doctorapp.data.remote.dto.request.DoctorRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


interface DoctorApi {

    @POST("search")
    suspend fun getDoctor(
        @Body doctorRequestDto: DoctorRequestDto
    ): RemoteResponseDto<DoctorDto>

    companion object {
        const val BASE_URL = "http://10.0.2.2:8092/api/doctor/"
    }
}