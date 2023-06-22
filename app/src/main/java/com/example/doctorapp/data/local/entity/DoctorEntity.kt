package com.example.doctorapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.doctorapp.domain.model.Gender
import java.util.Date

@Entity
@TypeConverters(DateTypeConverter::class)
data class DoctorEntity(
    @PrimaryKey
    val id: String,
    val name: String,
    val surname: String,
    val email: String,
    val fiscalCode: String,
    val gender: Gender?= null,
    val birthdayDate: Date? = null,
    val regionalCode: String,
    val ASL: String
)
