package com.example.doctorapp.data.remote.mappers

import com.example.doctorapp.data.local.entity.PatientEntity
import com.example.doctorapp.data.remote.dto.PatientDto
import com.example.doctorapp.domain.model.Patient
import java.lang.Integer.parseInt

fun PatientDto.toPatientEntity(): PatientEntity {
    return PatientEntity(
        id = id,
        name = name,
        surname = surname,
        email = email,
        fiscalCode = fiscalCode,
        gender = gender,
        birthdayDate = birthdayDate,
        doctorFiscalCode = doctorFiscalCode
    )
}

fun PatientEntity.toPatient(): Patient {
    return Patient(
        name = name,
        surname = surname,
        email = email,
        fiscalCode = fiscalCode,
        gender = gender,
        birthdayDate = birthdayDate!!,
        doctorFiscalCode = doctorFiscalCode
    )
}