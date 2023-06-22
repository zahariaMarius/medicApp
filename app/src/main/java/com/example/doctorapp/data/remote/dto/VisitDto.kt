package com.example.doctorapp.data.remote.dto

import com.example.doctorapp.domain.model.Status
import java.util.Date

data class VisitDto(
    val id: String,
    val dateTime: Date,
    val doctor: DoctorDto,
    val status: Status,
    val online: Boolean,
    val urlMeet: String?
)