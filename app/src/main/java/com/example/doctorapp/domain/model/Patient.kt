package com.example.doctorapp.domain.model

import java.util.Date

data class Patient(
    val name: String,
    val surname: String,
    val email: String,
    val fiscalCode: String,
    val gender: Gender,
    val birthdayDate: Date,
    val residenceAddress: Address,
    val homeAddress: Address,
    val doctorFiscalCode: String
)