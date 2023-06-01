package com.example.doctorapp.domain.model

import java.util.Date

data class Doctor(
    val name: String,
    val surname: String,
    val email: String,
    val gender: Gender,
    val fiscalCode: String,
    val birthdayDate: Date,
    val regionalCode: String,
    val ASL: String
) {
    fun fullName(): String {
        return surname.plus(" ").plus(name)
    }
}
