package com.example.doctorapp.domain.use_case.doctor;

import android.util.Log;
import com.example.doctorapp.common.Resource;
import com.example.doctorapp.data.local.database.DoctorDatabase;
import com.example.doctorapp.data.remote.dto.request.DoctorRequestDto;
import com.example.doctorapp.domain.model.Doctor;
import com.example.doctorapp.domain.repository.DoctorRepository;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/doctorapp/domain/use_case/doctor/GetDoctorProfileUseCase;", "", "doctorRepository", "Lcom/example/doctorapp/domain/repository/DoctorRepository;", "doctorDatabase", "Lcom/example/doctorapp/data/local/database/DoctorDatabase;", "(Lcom/example/doctorapp/domain/repository/DoctorRepository;Lcom/example/doctorapp/data/local/database/DoctorDatabase;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/doctorapp/common/Resource;", "Lcom/example/doctorapp/domain/model/Doctor;", "doctorFiscalCode", "", "app_debug"})
public final class GetDoctorProfileUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.repository.DoctorRepository doctorRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.data.local.database.DoctorDatabase doctorDatabase = null;
    
    @javax.inject.Inject
    public GetDoctorProfileUseCase(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.repository.DoctorRepository doctorRepository, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.local.database.DoctorDatabase doctorDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.doctorapp.common.Resource<com.example.doctorapp.domain.model.Doctor>> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String doctorFiscalCode) {
        return null;
    }
}