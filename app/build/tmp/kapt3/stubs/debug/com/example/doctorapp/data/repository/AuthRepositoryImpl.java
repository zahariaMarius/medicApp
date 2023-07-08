package com.example.doctorapp.data.repository;

import com.example.doctorapp.data.local.database.PatientDatabase;
import com.example.doctorapp.data.local.entity.PatientEntity;
import com.example.doctorapp.data.remote.api.AuthApi;
import com.example.doctorapp.data.remote.dto.PatientDto;
import com.example.doctorapp.data.remote.dto.request.AuthRequestDto;
import com.example.doctorapp.data.remote.dto.request.PatientRequestDto;
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto;
import com.example.doctorapp.domain.repository.AuthRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/doctorapp/data/repository/AuthRepositoryImpl;", "Lcom/example/doctorapp/domain/repository/AuthRepository;", "api", "Lcom/example/doctorapp/data/remote/api/AuthApi;", "(Lcom/example/doctorapp/data/remote/api/AuthApi;)V", "signIn", "Lcom/example/doctorapp/data/remote/dto/response/RemoteResponseDto;", "Lcom/example/doctorapp/data/remote/dto/PatientDto;", "authRequestDto", "Lcom/example/doctorapp/data/remote/dto/request/AuthRequestDto;", "(Lcom/example/doctorapp/data/remote/dto/request/AuthRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "", "patientRequestDto", "Lcom/example/doctorapp/data/remote/dto/request/PatientRequestDto;", "(Lcom/example/doctorapp/data/remote/dto/request/PatientRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AuthRepositoryImpl implements com.example.doctorapp.domain.repository.AuthRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.data.remote.api.AuthApi api = null;
    
    @javax.inject.Inject
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.api.AuthApi api) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object signIn(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.dto.request.AuthRequestDto authRequestDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.doctorapp.data.remote.dto.response.RemoteResponseDto<com.example.doctorapp.data.remote.dto.PatientDto>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object signUp(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.dto.request.PatientRequestDto patientRequestDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}