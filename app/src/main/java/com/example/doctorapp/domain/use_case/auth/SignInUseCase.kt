package com.example.doctorapp.domain.use_case.auth

import android.util.Log
import androidx.room.withTransaction
import com.example.doctorapp.common.Resource
import com.example.doctorapp.data.local.database.PatientDatabase
import com.example.doctorapp.data.remote.dto.request.AuthRequestDto
import com.example.doctorapp.data.remote.mappers.toPatient
import com.example.doctorapp.data.remote.mappers.toPatientEntity
import com.example.doctorapp.domain.model.Patient
import com.example.doctorapp.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class SignInUseCase @Inject constructor(
    private val authRepository: AuthRepository,
    private val patientDb: PatientDatabase,
) {
    operator fun invoke(authRequestDto: AuthRequestDto): Flow<Resource<Patient>> = flow {
        try {
            emit(Resource.Loading<Patient>())
            val remoteResponseDto = authRepository.signIn(authRequestDto)
            Log.d("SignInUseCase", "invoke: $remoteResponseDto")

            if (remoteResponseDto.result.isEmpty()) {
                emit(
                    Resource.Success(
                        data = null
                    )
                )
            } else {
                patientDb.withTransaction {
                    patientDb.dao.clearAll()
                    patientDb.dao.insert(
                        remoteResponseDto.result.map { it.toPatientEntity() }.first()
                    )
                }

                val patientEntity = patientDb.withTransaction {
                    patientDb.dao.getByEmail(remoteResponseDto.result.first().email)
                }

                emit(
                    Resource.Success(
                        data = patientEntity.toPatient()
                    )
                )
            }

        } catch (e: Exception) {
            Log.d("SignInUseCase", e.toString())
            emit(
                Resource.Error<Patient>(
                    null,
                    e.localizedMessage ?: "An unexpected error occurred"
                )
            )
        }
    }
}