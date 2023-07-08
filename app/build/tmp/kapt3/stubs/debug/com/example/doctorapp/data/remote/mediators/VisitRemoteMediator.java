package com.example.doctorapp.data.remote.mediators;

import android.util.Log;
import androidx.paging.ExperimentalPagingApi;
import androidx.paging.LoadType;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.paging.RemoteMediator;
import com.example.doctorapp.data.local.database.DoctorDatabase;
import com.example.doctorapp.data.local.database.VisitDatabase;
import com.example.doctorapp.data.local.entity.RemoteKeyEntity;
import com.example.doctorapp.data.local.entity.VisitEntity;
import com.example.doctorapp.data.remote.api.VisitApi;
import com.example.doctorapp.data.remote.dto.request.VisitsRequestDto;
import com.example.doctorapp.domain.model.Patient;
import com.example.doctorapp.domain.repository.VisitRepository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\'\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\'\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ-\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/doctorapp/data/remote/mediators/VisitRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lcom/example/doctorapp/data/local/entity/VisitEntity;", "visitDatabase", "Lcom/example/doctorapp/data/local/database/VisitDatabase;", "visitRepository", "Lcom/example/doctorapp/domain/repository/VisitRepository;", "patientFiscalCode", "", "(Lcom/example/doctorapp/data/local/database/VisitDatabase;Lcom/example/doctorapp/domain/repository/VisitRepository;Ljava/lang/String;)V", "getRemoteKeyClosestToCurrentPosition", "Lcom/example/doctorapp/data/local/entity/RemoteKeyEntity;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteKeyForFirstItem", "getRemoteKeyForLastItem", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
public final class VisitRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, com.example.doctorapp.data.local.entity.VisitEntity> {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.data.local.database.VisitDatabase visitDatabase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.repository.VisitRepository visitRepository = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String patientFiscalCode = null;
    
    public VisitRemoteMediator(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.local.database.VisitDatabase visitDatabase, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.repository.VisitRepository visitRepository, @org.jetbrains.annotations.NotNull
    java.lang.String patientFiscalCode) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, com.example.doctorapp.data.local.entity.VisitEntity> state, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> $completion) {
        return null;
    }
    
    private final java.lang.Object getRemoteKeyClosestToCurrentPosition(androidx.paging.PagingState<java.lang.Integer, com.example.doctorapp.data.local.entity.VisitEntity> state, kotlin.coroutines.Continuation<? super com.example.doctorapp.data.local.entity.RemoteKeyEntity> $completion) {
        return null;
    }
    
    private final java.lang.Object getRemoteKeyForFirstItem(androidx.paging.PagingState<java.lang.Integer, com.example.doctorapp.data.local.entity.VisitEntity> state, kotlin.coroutines.Continuation<? super com.example.doctorapp.data.local.entity.RemoteKeyEntity> $completion) {
        return null;
    }
    
    private final java.lang.Object getRemoteKeyForLastItem(androidx.paging.PagingState<java.lang.Integer, com.example.doctorapp.data.local.entity.VisitEntity> state, kotlin.coroutines.Continuation<? super com.example.doctorapp.data.local.entity.RemoteKeyEntity> $completion) {
        return null;
    }
}