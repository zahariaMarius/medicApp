package com.example.doctorapp.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import com.example.doctorapp.data.local.entity.PatientEntity
import com.example.doctorapp.domain.model.Patient

@Dao
interface PatientDao {

    @Insert
    suspend fun insert(patient: PatientEntity)

    @Upsert
    suspend fun upsertAll(patient: PatientEntity)

    @Query("DELETE FROM patiententity")
    suspend fun clearAll()

    @Delete
    fun delete(patient: PatientEntity)

    @Query("SELECT * FROM patiententity WHERE email = :email")
    fun get(email: String): PatientEntity

}