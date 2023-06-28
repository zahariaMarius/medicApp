package com.example.doctorapp.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Upsert
import com.example.doctorapp.data.local.entity.VisitEntity

@Dao
interface VisitDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(users: List<VisitEntity>)

    @Query("SELECT * FROM visitentity")
    fun pagingSource(): PagingSource<Int, VisitEntity>

    @Query("DELETE FROM visitentity")
    suspend fun clearAll()

}