package com.example.doctorapp.data.remote.dto.request;

import com.example.doctorapp.domain.model.Gender;
import java.util.Date;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010$\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0092\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u000fH\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013\u00a8\u00064"}, d2 = {"Lcom/example/doctorapp/data/remote/dto/request/DoctorRequestDto;", "", "id", "", "name", "surname", "email", "fiscalCode", "gender", "Lcom/example/doctorapp/domain/model/Gender;", "birthdayDate", "Ljava/util/Date;", "regionalCode", "ASL", "size", "", "page", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/doctorapp/domain/model/Gender;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getASL", "()Ljava/lang/String;", "getBirthdayDate", "()Ljava/util/Date;", "getEmail", "getFiscalCode", "getGender", "()Lcom/example/doctorapp/domain/model/Gender;", "getId", "getName", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegionalCode", "getSize", "getSurname", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/doctorapp/domain/model/Gender;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/example/doctorapp/data/remote/dto/request/DoctorRequestDto;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class DoctorRequestDto {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String id = null;
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
    private final java.lang.String regionalCode = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ASL = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer size = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer page = null;
    
    public DoctorRequestDto(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String surname, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String fiscalCode, @org.jetbrains.annotations.Nullable
    com.example.doctorapp.domain.model.Gender gender, @org.jetbrains.annotations.Nullable
    java.util.Date birthdayDate, @org.jetbrains.annotations.Nullable
    java.lang.String regionalCode, @org.jetbrains.annotations.Nullable
    java.lang.String ASL, @org.jetbrains.annotations.Nullable
    java.lang.Integer size, @org.jetbrains.annotations.Nullable
    java.lang.Integer page) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return null;
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
    public final java.lang.String getRegionalCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getASL() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPage() {
        return null;
    }
    
    public DoctorRequestDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component11() {
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
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.doctorapp.domain.model.Gender component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.remote.dto.request.DoctorRequestDto copy(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String surname, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String fiscalCode, @org.jetbrains.annotations.Nullable
    com.example.doctorapp.domain.model.Gender gender, @org.jetbrains.annotations.Nullable
    java.util.Date birthdayDate, @org.jetbrains.annotations.Nullable
    java.lang.String regionalCode, @org.jetbrains.annotations.Nullable
    java.lang.String ASL, @org.jetbrains.annotations.Nullable
    java.lang.Integer size, @org.jetbrains.annotations.Nullable
    java.lang.Integer page) {
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