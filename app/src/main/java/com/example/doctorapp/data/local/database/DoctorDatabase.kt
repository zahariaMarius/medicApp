package com.example.doctorapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.doctorapp.data.local.dao.DoctorDao
import com.example.doctorapp.data.local.entity.DoctorEntity

@Database(
    entities = [DoctorEntity::class],
    version = 1
)
abstract class DoctorDatabase: RoomDatabase() {
    abstract val dao: DoctorDao
}