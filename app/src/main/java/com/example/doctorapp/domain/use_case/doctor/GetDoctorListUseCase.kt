package com.example.doctorapp.domain.use_case.doctor

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.doctorapp.data.remote.paging.DoctorPagingSource
import com.example.doctorapp.domain.repository.DoctorRepository
import javax.inject.Inject

class GetDoctorListUseCase @Inject constructor(
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