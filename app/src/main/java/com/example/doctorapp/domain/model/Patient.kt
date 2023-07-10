package com.example.doctorapp.domain.model

import androidx.compose.ui.text.capitalize
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date

data class Patient(
    val name: String,
    val surname: String,
    val email: String,
    val fiscalCode: String,
    val gender: Gender,
    val birthdayDate: Date,
    val doctorFiscalCode: String
) {
    fun fullName(): String {
        return surname.plus(" ").plus(name)
    }

    fun formattedBirthday(): String {
        return SimpleDateFormat("dd-MM-yyyy").format(birthdayDate)
    }
}