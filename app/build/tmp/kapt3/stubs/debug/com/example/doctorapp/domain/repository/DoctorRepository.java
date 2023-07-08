package com.example.doctorapp.domain.repository;

import androidx.paging.PagingData;
import com.example.doctorapp.data.remote.dto.DoctorDto;
import com.example.doctorapp.data.remote.dto.request.DoctorRequestDto;
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto;
import com.example.doctorapp.domain.model.Doctor;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/doctorapp/domain/repository/DoctorRepository;", "", "getDoctors", "Lcom/example/doctorapp/data/remote/dto/response/RemoteResponseDto;", "Lcom/example/doctorapp/data/remote/dto/DoctorDto;", "doctorRequestDto", "Lcom/example/doctorapp/data/remote/dto/request/DoctorRequestDto;", "(Lcom/example/doctorapp/data/remote/dto/request/DoctorRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DoctorRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDoctors(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.dto.request.DoctorRequestDto doctorRequestDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.doctorapp.data.remote.dto.response.RemoteResponseDto<com.example.doctorapp.data.remote.dto.DoctorDto>> $completion);
}