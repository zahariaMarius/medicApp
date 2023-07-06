package com.example.doctorapp.domain.use_case.auth

import android.util.Log
import com.example.doctorapp.common.Resource
import com.example.doctorapp.data.remote.dto.request.PatientRequestDto
import com.example.doctorapp.domain.model.Patient
import com.example.doctorapp.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class SignUpUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {

    operator fun invoke(patientRequestDto: PatientRequestDto): Flow<Resource<Any>> = flow {
        try {
            emit(Resource.Loading())
            authRepository.signUp(patientRequestDto)
            emit(Resource.Success())
            Log.d("USECASE", "invoke: success")
        } catch (e: HttpException) {
            Log.d("USECASE", e.toString())
            emit(Resource.Error(null, e.localizedMessage ?: "An unexpected error occurred"))
        }
    }
}