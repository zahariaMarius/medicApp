package com.example.doctorapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.doctorapp.data.local.dao.PatientDao
import com.example.doctorapp.data.local.entity.PatientEntity

@Database(
    entities = [PatientEntity::class],
    version = 1
)
abstract class PatientDatabase: RoomDatabase() {
    abstract val dao: PatientDao
}