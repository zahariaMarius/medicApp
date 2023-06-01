package com.example.doctorapp.data.remote.dto

import java.util.Date

data class PatientDto(
    val id: String,
    val name: String,
    val surname: String,
    val birthdayDate: Date,
    val gender: String,
    val email: String,
    val fiscalCode: String,
    val homeAddress: AddressDto,
    val residenceAddress: AddressDto,
    val vaccineList: List<Any>
)