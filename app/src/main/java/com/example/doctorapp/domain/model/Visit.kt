package com.example.doctorapp.domain.model

import java.text.SimpleDateFormat
import java.util.Date

data class Visit(
    val id: String,
    val dateTime: Date,
    val doctorName: String,
    val doctorSurname: String,
    val doctorFiscalCode: String,
    val status: Status,
    val online: Boolean,
    val urlMeet: String?
) {
    fun doctorFullName(): String {
        return doctorSurname.plus(" ").plus(doctorName)
    }

    fun formattedDate(): String {
        return SimpleDateFormat("dd-MM-yyyy").format(dateTime)
    }
}