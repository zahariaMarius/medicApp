package com.example.doctorapp.data.remote.dto

import com.example.doctorapp.domain.model.Gender
import java.util.Date

data class PatientDto(
    val id: String,
    val name: String,
    val surname: String,
    val email: String,
    val fiscalCode: String,
    val gender: Gender,
    val birthdayDate: Date,
    val doctorFiscalCode: String
)