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
    fun insertAll(vararg patient: PatientEntity)

    @Delete
    fun delete(patient: PatientEntity)

    @Query("SELECT * FROM patiententity")
    fun getAll(): List<PatientEntity>


}