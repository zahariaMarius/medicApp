package com.example.doctorapp.presentation.home.visit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import androidx.paging.map
import com.example.doctorapp.data.remote.mappers.toVisit
import com.example.doctorapp.domain.use_case.visit.GetVisitsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class VisitScreenViewModel @Inject constructor(
    private val getVisitsUseCase: GetVisitsUseCase
): ViewModel() {

    private val patientFiscalCode = "DMNDMN80A01L219B"

    val visitPager = getVisitsUseCase.visitPager
        .map {pagingData ->
            pagingData.map { it.toVisit() }
        }.cachedIn(viewModelScope)

}