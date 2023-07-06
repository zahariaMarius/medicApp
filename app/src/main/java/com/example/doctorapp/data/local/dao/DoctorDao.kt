package com.example.doctorapp.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.doctorapp.data.local.entity.DoctorEntity

@Dao
interface DoctorDao {

    @Insert
    fun insert(doctor: DoctorEntity)

    @Delete
    fun delete(doctor: DoctorEntity)

    @Query("DELETE FROM doctorentity")
    fun clearAll()

    @Query("SELECT * FROM doctorentity")
    fun getAll(): List<DoctorEntity>

    @Query("SELECT * FROM doctorentity WHERE fiscalCode = :fiscalCode")
    fun getDoctorByFiscalCode(fiscalCode: String): DoctorEntity?

}