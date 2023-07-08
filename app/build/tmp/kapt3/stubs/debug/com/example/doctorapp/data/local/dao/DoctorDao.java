package com.example.doctorapp.data.local.dao;

import androidx.paging.PagingSource;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.doctorapp.data.local.entity.DoctorEntity;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/doctorapp/data/local/dao/DoctorDao;", "", "clearAll", "", "delete", "doctor", "Lcom/example/doctorapp/data/local/entity/DoctorEntity;", "getAll", "", "getDoctorByFiscalCode", "fiscalCode", "", "insert", "app_debug"})
@androidx.room.Dao
public abstract interface DoctorDao {
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.local.entity.DoctorEntity doctor);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.local.entity.DoctorEntity doctor);
    
    @androidx.room.Query(value = "DELETE FROM doctorentity")
    public abstract void clearAll();
    
    @androidx.room.Query(value = "SELECT * FROM doctorentity")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.doctorapp.data.local.entity.DoctorEntity> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM doctorentity WHERE fiscalCode = :fiscalCode")
    @org.jetbrains.annotations.Nullable
    public abstract com.example.doctorapp.data.local.entity.DoctorEntity getDoctorByFiscalCode(@org.jetbrains.annotations.NotNull
    java.lang.String fiscalCode);
}