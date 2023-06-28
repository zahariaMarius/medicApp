package com.example.doctorapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.doctorapp.data.local.entity.converter.DateTypeConverter
import com.example.doctorapp.domain.model.Status
import java.util.Date

@Entity
@TypeConverters(DateTypeConverter::class)
data class VisitEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val dateTime: Date,
    val doctorName: String,
    val doctorSurname: String,
    val doctorFiscalCode: String,
    val status: Status,
    val online: Boolean,
    val urlMeet: String?
)
