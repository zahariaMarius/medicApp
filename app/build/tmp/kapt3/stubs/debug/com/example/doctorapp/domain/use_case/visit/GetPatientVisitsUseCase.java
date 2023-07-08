package com.example.doctorapp.domain.use_case.visit;

import androidx.paging.ExperimentalPagingApi;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.example.doctorapp.data.local.database.VisitDatabase;
import com.example.doctorapp.data.remote.mediators.VisitRemoteMediator;
import com.example.doctorapp.domain.repository.VisitRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/doctorapp/domain/use_case/visit/GetPatientVisitsUseCase;", "", "visitDatabase", "Lcom/example/doctorapp/data/local/database/VisitDatabase;", "visitRepository", "Lcom/example/doctorapp/domain/repository/VisitRepository;", "(Lcom/example/doctorapp/data/local/database/VisitDatabase;Lcom/example/doctorapp/domain/repository/VisitRepository;)V", "visitPager", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/doctorapp/data/local/entity/VisitEntity;", "getVisitPager$annotations", "()V", "getVisitPager", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class GetPatientVisitsUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.data.local.database.VisitDatabase visitDatabase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.repository.VisitRepository visitRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.doctorapp.data.local.entity.VisitEntity>> visitPager = null;
    
    @javax.inject.Inject
    public GetPatientVisitsUseCase(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.local.database.VisitDatabase visitDatabase, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.repository.VisitRepository visitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.doctorapp.data.local.entity.VisitEntity>> getVisitPager() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    @java.lang.Deprecated
    public static void getVisitPager$annotations() {
    }
}