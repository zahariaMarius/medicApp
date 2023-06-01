package com.example.doctorapp.domain.model

import java.util.Date

data class Visit(
    val dateTime: Date,
    val status: Status,
    val online: Boolean,
    val urlMeet: String
)