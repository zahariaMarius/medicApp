package com.example.doctorapp.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import androidx.paging.map
import com.example.doctorapp.data.remote.mappers.toVisit
import com.example.doctorapp.domain.use_case.visit.GetPatientVisitsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val getPatientVisitsUseCase: GetPatientVisitsUseCase
): ViewModel() {

    val visitPager = getPatientVisitsUseCase.visitPager
        .map {pagingData ->
            pagingData.map { it.toVisit() }
        }.cachedIn(viewModelScope)
}