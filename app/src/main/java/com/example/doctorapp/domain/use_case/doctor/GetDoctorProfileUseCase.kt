package com.example.doctorapp.domain.use_case.doctor

import android.util.Log
import androidx.room.withTransaction
import com.example.doctorapp.common.Resource
import com.example.doctorapp.data.local.database.DoctorDatabase
import com.example.doctorapp.data.remote.dto.request.DoctorRequestDto
import com.example.doctorapp.data.remote.mappers.toDoctor
import com.example.doctorapp.data.remote.mappers.toDoctorEntity
import com.example.doctorapp.domain.model.Doctor
import com.example.doctorapp.domain.repository.DoctorRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetDoctorProfileUseCase @Inject constructor(
    private val doctorRepository: DoctorRepository,
    private val doctorDatabase: DoctorDatabase
) {
    operator fun invoke(doctorFiscalCode: String): Flow<Resource<Doctor>> = flow {
        try {
            emit(Resource.Loading())

            var doctorEntity = doctorDatabase.withTransaction {
                doctorDatabase.dao.getDoctorByFiscalCode(doctorFiscalCode)
            }
            Log.d("DOCTOR_PROFILE_USECASE_BEFORE", doctorEntity.toString())


            if (doctorEntity == null) {
                val remoteResponseDto = doctorRepository.getDoctors(
                    DoctorRequestDto(fiscalCode = doctorFiscalCode)
                )

                doctorDatabase.withTransaction {
                    doctorDatabase.dao.clearAll()
                    doctorDatabase.dao.insert(
                        remoteResponseDto.resultDto.items.first().toDoctorEntity()
                    )
                    doctorEntity = doctorDatabase.dao.getDoctorByFiscalCode(doctorFiscalCode)
                }
            }

            Log.d("DOCTOR_PROFILE_USECASE_AFTER", doctorEntity.toString())

            emit(Resource.Success(data = doctorEntity!!.toDoctor()))

        } catch (e: Exception) {
            emit(Resource.Error(message = e.toString()))
        }
    }
}