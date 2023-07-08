package com.example.doctorapp.data.remote.dto.request;

import com.example.doctorapp.domain.model.Gender;
import java.util.Date;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Ji\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/example/doctorapp/data/remote/dto/request/PatientRequestDto;", "", "name", "", "surname", "email", "fiscalCode", "gender", "Lcom/example/doctorapp/domain/model/Gender;", "birthdayDate", "Ljava/util/Date;", "doctorFiscalCode", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/doctorapp/domain/model/Gender;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "getBirthdayDate", "()Ljava/util/Date;", "getDoctorFiscalCode", "()Ljava/lang/String;", "getEmail", "getFiscalCode", "getGender", "()Lcom/example/doctorapp/domain/model/Gender;", "getName", "getPassword", "getSurname", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class PatientRequestDto {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String surname = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String fiscalCode = null;
    @org.jetbrains.annotations.Nullable
    private final com.example.doctorapp.domain.model.Gender gender = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.Date birthdayDate = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String doctorFiscalCode = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String password = null;
    
    public PatientRequestDto(@org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String surname, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String fiscalCode, @org.jetbrains.annotations.Nullable
    com.example.doctorapp.domain.model.Gender gender, @org.jetbrains.annotations.Nullable
    java.util.Date birthdayDate, @org.jetbrains.annotations.Nullable
    java.lang.String doctorFiscalCode, @org.jetbrains.annotations.Nullable
    java.lang.String password) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSurname() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFiscalCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.doctorapp.domain.model.Gender getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getBirthdayDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDoctorFiscalCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPassword() {
        return null;
    }
    
    public PatientRequestDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.doctorapp.domain.model.Gender component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.remote.dto.request.PatientRequestDto copy(@org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String surname, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String fiscalCode, @org.jetbrains.annotations.Nullable
    com.example.doctorapp.domain.model.Gender gender, @org.jetbrains.annotations.Nullable
    java.util.Date birthdayDate, @org.jetbrains.annotations.Nullable
    java.lang.String doctorFiscalCode, @org.jetbrains.annotations.Nullable
    java.lang.String password) {
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