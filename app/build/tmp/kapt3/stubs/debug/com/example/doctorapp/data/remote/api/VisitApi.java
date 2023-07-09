package com.example.doctorapp.data.remote.api;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/doctorapp/data/remote/api/VisitApi;", "", "getVisits", "Lcom/example/doctorapp/data/remote/dto/response/RemoteResponseDto;", "Lcom/example/doctorapp/data/remote/dto/VisitDto;", "visitsRequestDto", "Lcom/example/doctorapp/data/remote/dto/request/VisitsRequestDto;", "(Lcom/example/doctorapp/data/remote/dto/request/VisitsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface VisitApi {
    
    @retrofit2.http.POST(value = "patient")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getVisits(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.dto.request.VisitsRequestDto visitsRequestDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.doctorapp.data.remote.dto.response.RemoteResponseDto<com.example.doctorapp.data.remote.dto.VisitDto>> $completion);
}