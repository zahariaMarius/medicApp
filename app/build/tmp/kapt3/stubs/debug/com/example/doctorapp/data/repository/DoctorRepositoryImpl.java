package com.example.doctorapp.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/doctorapp/data/repository/DoctorRepositoryImpl;", "Lcom/example/doctorapp/domain/repository/DoctorRepository;", "doctorApi", "Lcom/example/doctorapp/data/remote/api/DoctorApi;", "(Lcom/example/doctorapp/data/remote/api/DoctorApi;)V", "getDoctors", "Lcom/example/doctorapp/data/remote/dto/response/RemoteResponseDto;", "Lcom/example/doctorapp/data/remote/dto/DoctorDto;", "doctorRequestDto", "Lcom/example/doctorapp/data/remote/dto/request/DoctorRequestDto;", "(Lcom/example/doctorapp/data/remote/dto/request/DoctorRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DoctorRepositoryImpl implements com.example.doctorapp.domain.repository.DoctorRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.data.remote.api.DoctorApi doctorApi = null;
    
    @javax.inject.Inject
    public DoctorRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.api.DoctorApi doctorApi) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getDoctors(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.dto.request.DoctorRequestDto doctorRequestDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.doctorapp.data.remote.dto.response.RemoteResponseDto<com.example.doctorapp.data.remote.dto.DoctorDto>> $completion) {
        return null;
    }
}