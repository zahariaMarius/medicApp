package com.example.doctorapp.data.remote.dto

import com.example.doctorapp.domain.model.Gender
import com.google.gson.annotations.SerializedName
import java.util.Date

data class DoctorDto(
    val id: String,
    val name: String,
    val surname: String,
    val email: String,
    val fiscalCode: String,
    val gender: Gender,
    val birthdayDate: Date,
    val regionalCode: String,
    @SerializedName("asl")
    val ASL: String
)