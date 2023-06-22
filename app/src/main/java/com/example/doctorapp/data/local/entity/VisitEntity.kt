package com.example.doctorapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.doctorapp.data.remote.dto.DoctorDto
import com.example.doctorapp.domain.model.Status
import java.util.Date

@Entity
data class VisitEntity(
    @PrimaryKey
    val id: String,
    val dateTime: Date,
    val doctor: DoctorEntity,
    val status: Status,
    val online: Boolean,
    val urlMeet: String?
)
