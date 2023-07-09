package com.example.doctorapp.domain.use_case.auth;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/doctorapp/domain/use_case/auth/SignUpUseCase;", "", "authRepository", "Lcom/example/doctorapp/domain/repository/AuthRepository;", "(Lcom/example/doctorapp/domain/repository/AuthRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/doctorapp/common/Resource;", "patientRequestDto", "Lcom/example/doctorapp/data/remote/dto/request/PatientRequestDto;", "app_debug"})
public final class SignUpUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.repository.AuthRepository authRepository = null;
    
    @javax.inject.Inject
    public SignUpUseCase(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.doctorapp.common.Resource<java.lang.Object>> invoke(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.dto.request.PatientRequestDto patientRequestDto) {
        return null;
    }
}