package com.example.doctorapp.domain.use_case.patient

import androidx.room.withTransaction
import com.example.doctorapp.common.Resource
import com.example.doctorapp.data.local.database.PatientDatabase
import com.example.doctorapp.data.remote.mappers.toPatient
import com.example.doctorapp.domain.model.Patient
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetPatientProfileUseCase @Inject constructor(
    private val patientDatabase: PatientDatabase
) {

    operator fun invoke(patientFiscalCode: String): Flow<Resource<Patient>> = flow {
        try {
            emit(Resource.Loading())

            val patient = patientDatabase.withTransaction {
                patientDatabase.dao.getByFiscalCode(fiscalCode = patientFiscalCode).toPatient()
            }

            emit(Resource.Success(data = patient))
        } catch (e: Exception) {
            emit(Resource.Error(message = e.toString()))
        }
    }

}