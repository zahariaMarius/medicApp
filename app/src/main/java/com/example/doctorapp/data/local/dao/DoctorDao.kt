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
    fun insertAll(vararg doctor: DoctorEntity)

    @Delete
    fun delete(doctor: DoctorEntity)

    @Query("SELECT * FROM doctorentity")
    fun getAll(): List<DoctorEntity>

}