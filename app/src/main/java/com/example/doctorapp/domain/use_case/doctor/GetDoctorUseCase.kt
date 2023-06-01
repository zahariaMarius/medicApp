package com.example.doctorapp.domain.use_case.doctor

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.doctorapp.data.remote.api.DoctorApi
import com.example.doctorapp.data.remote.paging.DoctorPagingSource
import com.example.doctorapp.domain.model.Doctor
import com.example.doctorapp.domain.repository.DoctorRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetDoctorUseCase @Inject constructor(
    private val doctorRepository: DoctorRepository
) {

    val doctorPager = Pager(
        PagingConfig(
            pageSize = 5
        )
    ) {
        DoctorPagingSource(doctorRepository)
    }.flow


}