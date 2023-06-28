package com.example.doctorapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.doctorapp.data.local.entity.RemoteKeyEntity

@Dao
interface RemoteKeyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrReplace(remoteKey: List<RemoteKeyEntity>)

    @Query("SELECT * FROM remotekeyentity WHERE id = :id")
    suspend fun remoteKeyByQuery(id: String): RemoteKeyEntity

    @Query("DELETE FROM remotekeyentity")
    suspend fun clearAll()
}