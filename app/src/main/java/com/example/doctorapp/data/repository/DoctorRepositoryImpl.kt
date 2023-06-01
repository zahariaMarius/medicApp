package com.example.doctorapp.data.repository

import android.util.Log
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.doctorapp.data.remote.api.DoctorApi
import com.example.doctorapp.data.remote.dto.DoctorDto
import com.example.doctorapp.data.remote.dto.request.DoctorRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import com.example.doctorapp.data.remote.paging.DoctorPagingSource
import com.example.doctorapp.domain.model.Doctor
import com.example.doctorapp.domain.repository.DoctorRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DoctorRepositoryImpl @Inject constructor(
    private val doctorApi: DoctorApi
) : DoctorRepository {

    override suspend fun getDoctors(
        doctorRequestDto: DoctorRequestDto
    ): RemoteResponseDto<DoctorDto> {
        return doctorApi.getDoctor(doctorRequestDto)
    }

    override fun getDoc(): Flow<PagingData<Doctor>> {
        TODO("Not yet implemented")
    }
}