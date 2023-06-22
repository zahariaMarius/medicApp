package com.example.doctorapp.domain.use_case.auth

import android.util.Log
import com.example.doctorapp.common.Resource
import com.example.doctorapp.data.local.database.PatientDatabase
import com.example.doctorapp.data.remote.dto.request.AuthRequestDto
import com.example.doctorapp.domain.model.Patient
import com.example.doctorapp.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class SignInUseCase @Inject constructor(
    private val authRepository: AuthRepository,
    private val patientDb: PatientDatabase,
    private val authRequestDto: AuthRequestDto
) {
    operator fun invoke(): Flow<Resource<Patient>> = flow {
        try{
            emit(Resource.Loading<Patient>())
            val remoteResponseDto = authRepository.signIn(authRequestDto)
            Log.d("USECASE", "invoke: $remoteResponseDto")
        }catch (e: HttpException) {
            Log.d("USECASE", e.toString())
            emit(Resource.Error<Patient>(null, e.localizedMessage ?: "An unexpected error occurred"))
        }

    }
}