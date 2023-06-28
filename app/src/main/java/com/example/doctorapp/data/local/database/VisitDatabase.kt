package com.example.doctorapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.doctorapp.data.local.dao.RemoteKeyDao
import com.example.doctorapp.data.local.dao.VisitDao
import com.example.doctorapp.data.local.entity.RemoteKeyEntity
import com.example.doctorapp.data.local.entity.VisitEntity


@Database(
    entities = [VisitEntity::class, RemoteKeyEntity::class],
    version = 1
)
abstract class VisitDatabase : RoomDatabase() {
    abstract val visitDao: VisitDao
    abstract val remoteKeyDao: RemoteKeyDao
}