package com.example.doctorapp.data.remote.dto;

import com.example.doctorapp.domain.model.Status;
import java.util.Date;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013\u00a8\u0006%"}, d2 = {"Lcom/example/doctorapp/data/remote/dto/VisitDto;", "", "id", "", "dateTime", "Ljava/util/Date;", "doctor", "Lcom/example/doctorapp/data/remote/dto/DoctorDto;", "status", "Lcom/example/doctorapp/domain/model/Status;", "online", "", "urlMeet", "(Ljava/lang/String;Ljava/util/Date;Lcom/example/doctorapp/data/remote/dto/DoctorDto;Lcom/example/doctorapp/domain/model/Status;ZLjava/lang/String;)V", "getDateTime", "()Ljava/util/Date;", "getDoctor", "()Lcom/example/doctorapp/data/remote/dto/DoctorDto;", "getId", "()Ljava/lang/String;", "getOnline", "()Z", "getStatus", "()Lcom/example/doctorapp/domain/model/Status;", "getUrlMeet", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class VisitDto {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date dateTime = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.data.remote.dto.DoctorDto doctor = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.model.Status status = null;
    private final boolean online = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String urlMeet = null;
    
    public VisitDto(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.util.Date dateTime, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.dto.DoctorDto doctor, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.model.Status status, boolean online, @org.jetbrains.annotations.Nullable
    java.lang.String urlMeet) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.remote.dto.DoctorDto getDoctor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.domain.model.Status getStatus() {
        return null;
    }
    
    public final boolean getOnline() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrlMeet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.remote.dto.DoctorDto component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.domain.model.Status component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.remote.dto.VisitDto copy(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.util.Date dateTime, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.dto.DoctorDto doctor, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.model.Status status, boolean online, @org.jetbrains.annotations.Nullable
    java.lang.String urlMeet) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}