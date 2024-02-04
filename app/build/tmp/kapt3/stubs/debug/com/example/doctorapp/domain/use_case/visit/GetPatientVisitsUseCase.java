package com.example.doctorapp.domain.use_case.visit;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/doctorapp/domain/use_case/visit/GetPatientVisitsUseCase;", "", "visitDatabase", "Lcom/example/doctorapp/data/local/database/VisitDatabase;", "visitRepository", "Lcom/example/doctorapp/domain/repository/VisitRepository;", "sessionManager", "Lcom/example/doctorapp/session/SessionManager;", "(Lcom/example/doctorapp/data/local/database/VisitDatabase;Lcom/example/doctorapp/domain/repository/VisitRepository;Lcom/example/doctorapp/session/SessionManager;)V", "visitPager", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/doctorapp/data/local/entity/VisitEntity;", "getVisitPager$annotations", "()V", "getVisitPager", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class GetPatientVisitsUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.data.local.database.VisitDatabase visitDatabase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.repository.VisitRepository visitRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.session.SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.doctorapp.data.local.entity.VisitEntity>> visitPager = null;
    
    @javax.inject.Inject
    public GetPatientVisitsUseCase(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.local.database.VisitDatabase visitDatabase, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.repository.VisitRepository visitRepository, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.session.SessionManager sessionManager) {
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