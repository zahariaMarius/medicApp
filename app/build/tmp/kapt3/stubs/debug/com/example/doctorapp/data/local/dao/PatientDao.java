package com.example.doctorapp.data.local.dao;

import androidx.paging.PagingSource;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Upsert;
import com.example.doctorapp.data.local.entity.PatientEntity;
import com.example.doctorapp.domain.model.Patient;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\nH\'J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/doctorapp/data/local/dao/PatientDao;", "", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "patient", "Lcom/example/doctorapp/data/local/entity/PatientEntity;", "getByEmail", "email", "", "getByFiscalCode", "fiscalCode", "insert", "(Lcom/example/doctorapp/data/local/entity/PatientEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertAll", "app_debug"})
@androidx.room.Dao
public abstract interface PatientDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.local.entity.PatientEntity patient, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Upsert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsertAll(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.local.entity.PatientEntity patient, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM patiententity")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.local.entity.PatientEntity patient);
    
    @androidx.room.Query(value = "SELECT * FROM patiententity WHERE fiscalCode = :fiscalCode")
    @org.jetbrains.annotations.NotNull
    public abstract com.example.doctorapp.data.local.entity.PatientEntity getByFiscalCode(@org.jetbrains.annotations.NotNull
    java.lang.String fiscalCode);
    
    @androidx.room.Query(value = "SELECT * FROM patiententity WHERE email = :email")
    @org.jetbrains.annotations.NotNull
    public abstract com.example.doctorapp.data.local.entity.PatientEntity getByEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email);
}