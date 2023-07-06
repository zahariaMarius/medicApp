package com.example.doctorapp.domain.repository

import androidx.paging.PagingData
import com.example.doctorapp.data.remote.dto.DoctorDto
import com.example.doctorapp.data.remote.dto.request.DoctorRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import com.example.doctorapp.domain.model.Doctor
import kotlinx.coroutines.flow.Flow

interface DoctorRepository {

    suspend fun getDoctors(
        doctorRequestDto: DoctorRequestDto
    ): RemoteResponseDto<DoctorDto>

}