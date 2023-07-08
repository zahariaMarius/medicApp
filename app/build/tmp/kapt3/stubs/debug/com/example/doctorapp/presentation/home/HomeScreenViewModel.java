package com.example.doctorapp.presentation.home;

import androidx.lifecycle.ViewModel;
import com.example.doctorapp.domain.use_case.visit.GetPatientVisitsUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/doctorapp/presentation/home/HomeScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "getPatientVisitsUseCase", "Lcom/example/doctorapp/domain/use_case/visit/GetPatientVisitsUseCase;", "(Lcom/example/doctorapp/domain/use_case/visit/GetPatientVisitsUseCase;)V", "patientFiscalCode", "", "visitPager", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/doctorapp/domain/model/Visit;", "getVisitPager", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeScreenViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.use_case.visit.GetPatientVisitsUseCase getPatientVisitsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String patientFiscalCode = "DMNDMN80A01L219B";
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.doctorapp.domain.model.Visit>> visitPager = null;
    
    @javax.inject.Inject
    public HomeScreenViewModel(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.use_case.visit.GetPatientVisitsUseCase getPatientVisitsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.doctorapp.domain.model.Visit>> getVisitPager() {
        return null;
    }
}