package com.example.doctorapp.data.remote.api

import com.example.doctorapp.data.remote.dto.VisitDto
import com.example.doctorapp.data.remote.dto.request.VisitsRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import retrofit2.http.Body
import retrofit2.http.POST

interface VisitApi {

    @POST("patient")
    suspend fun getVisits(
        @Body visitsRequestDto: VisitsRequestDto
    ): RemoteResponseDto<VisitDto>
}