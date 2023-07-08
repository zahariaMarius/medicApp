package com.example.doctorapp.data.remote.api;

import androidx.paging.PagingSource;
import com.example.doctorapp.data.remote.dto.DoctorDto;
import com.example.doctorapp.data.remote.dto.PatientDto;
import com.example.doctorapp.data.remote.dto.request.AuthRequestDto;
import com.example.doctorapp.data.remote.dto.request.PatientRequestDto;
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/doctorapp/data/remote/api/AuthApi;", "", "signIn", "Lcom/example/doctorapp/data/remote/dto/response/RemoteResponseDto;", "Lcom/example/doctorapp/data/remote/dto/PatientDto;", "authRequestDto", "Lcom/example/doctorapp/data/remote/dto/request/AuthRequestDto;", "(Lcom/example/doctorapp/data/remote/dto/request/AuthRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signup", "", "patientRequestDto", "Lcom/example/doctorapp/data/remote/dto/request/PatientRequestDto;", "(Lcom/example/doctorapp/data/remote/dto/request/PatientRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AuthApi {
    
    @retrofit2.http.POST(value = "signin")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object signIn(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.dto.request.AuthRequestDto authRequestDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.doctorapp.data.remote.dto.response.RemoteResponseDto<com.example.doctorapp.data.remote.dto.PatientDto>> $completion);
    
    @retrofit2.http.POST(value = "signup")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object signup(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.dto.request.PatientRequestDto patientRequestDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}