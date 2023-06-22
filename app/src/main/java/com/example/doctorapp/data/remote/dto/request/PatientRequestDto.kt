package com.example.doctorapp.data.remote.dto.request

import com.example.doctorapp.domain.model.Address
import com.example.doctorapp.domain.model.Gender
import java.util.Date

data class PatientRequestDto(
    val name: String? = null,
    val surname: String? = null,
    val email: String? = null,
    val fiscalCode: String? = null,
    val gender: Gender? = null,
    val birthdayDate: Date? = null,
    val residenceAddress: Address? = null,
    val homeAddress: Address? = null,
    val doctorFiscalCode: String? = null
)