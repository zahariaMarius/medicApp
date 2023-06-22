package com.example.doctorapp.domain.model

import java.util.Date

data class Visit(
    val id: String,
    val dateTime: Date,
    val doctor: Doctor,
    val status: Status,
    val online: Boolean,
    val urlMeet: String?
)