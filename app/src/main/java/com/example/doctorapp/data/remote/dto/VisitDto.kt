package com.example.doctorapp.data.remote.dto

data class VisitDto(
    val id: String,
    val dateTime: String,
    val doctor: DoctorDto,
    val status: String,
    val online: Boolean,
    val urlMeet: String?
)