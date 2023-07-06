package com.example.doctorapp.domain.use_case.visit

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.doctorapp.data.local.database.VisitDatabase
import com.example.doctorapp.data.remote.mediators.VisitRemoteMediator
import com.example.doctorapp.domain.repository.VisitRepository
import javax.inject.Inject

class GetPatientVisitsUseCase @Inject constructor(
    private val visitDatabase: VisitDatabase,
    private val visitRepository: VisitRepository
) {

    @OptIn(ExperimentalPagingApi::class)
    val visitPager = Pager(
        config = PagingConfig(pageSize = 5),
        remoteMediator = VisitRemoteMediator(
            visitDatabase = visitDatabase,
            visitRepository = visitRepository,
            patientFiscalCode = "DMNDMN80A01L219B"
        )
    ) {
        visitDatabase.visitDao.pagingSource()
    }.flow

}