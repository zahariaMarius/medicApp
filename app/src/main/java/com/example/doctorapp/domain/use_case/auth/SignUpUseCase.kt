package com.example.doctorapp.domain.use_case.auth

import android.util.Log
import androidx.room.withTransaction
import com.example.doctorapp.common.Resource
import com.example.doctorapp.data.local.database.PatientDatabase
import com.example.doctorapp.data.remote.dto.request.PatientRequestDto
import com.example.doctorapp.data.remote.mappers.toPatient
import com.example.doctorapp.data.remote.mappers.toPatientEntity
import com.example.doctorapp.domain.model.Patient
import com.example.doctorapp.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class SignUpUseCase @Inject constructor(
    private val authRepository: AuthRepository,
    private val patientDb: PatientDatabase
) {

    operator fun invoke(patientRequestDto: PatientRequestDto): Flow<Resource<Patient>> = flow {
        try {
            emit(Resource.Loading())
            val remoteResponseDto = authRepository.signUp(patientRequestDto)

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
        } catch (e: HttpException) {
            Log.d("USECASE", e.toString())
            emit(Resource.Error(null, e.localizedMessage ?: "An unexpected error occurred"))
        }
    }
}