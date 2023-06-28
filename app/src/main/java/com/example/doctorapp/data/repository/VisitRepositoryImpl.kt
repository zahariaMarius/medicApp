package com.example.doctorapp.data.repository

import com.example.doctorapp.data.remote.api.VisitApi
import com.example.doctorapp.data.remote.dto.DoctorDto
import com.example.doctorapp.data.remote.dto.VisitDto
import com.example.doctorapp.data.remote.dto.request.VisitsRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import com.example.doctorapp.domain.repository.VisitRepository
import javax.inject.Inject

class VisitRepositoryImpl @Inject constructor(
    private val visitApi: VisitApi
) : VisitRepository {

    override suspend fun getVisits(visitsRequestDto: VisitsRequestDto): RemoteResponseDto<VisitDto> {
        return visitApi.getVisits(visitsRequestDto)
    }
}