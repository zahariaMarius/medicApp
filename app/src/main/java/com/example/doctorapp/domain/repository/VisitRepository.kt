package com.example.doctorapp.domain.repository

import com.example.doctorapp.data.remote.dto.VisitDto
import com.example.doctorapp.data.remote.dto.request.VisitsRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto

interface VisitRepository {
    suspend fun getVisits(visitsRequestDto: VisitsRequestDto): RemoteResponseDto<VisitDto>
}