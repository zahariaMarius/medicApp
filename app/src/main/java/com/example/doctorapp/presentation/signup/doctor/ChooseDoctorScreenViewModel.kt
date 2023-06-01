package com.example.doctorapp.presentation.signup.doctor

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.doctorapp.data.remote.paging.DoctorPagingSource
import com.example.doctorapp.domain.model.Doctor
import com.example.doctorapp.domain.repository.DoctorRepository
import com.example.doctorapp.domain.use_case.doctor.GetDoctorUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class ChooseDoctorScreenViewModel @Inject constructor(
    private val getDoctorUseCase: GetDoctorUseCase,
) : ViewModel() {

    val doctorPager = getDoctorUseCase.doctorPager

    var search by mutableStateOf("")

}