package com.example.doctorapp.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010\"\u001a\u00020\u0003J\u0006\u0010#\u001a\u00020\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\'"}, d2 = {"Lcom/example/doctorapp/domain/model/Patient;", "", "name", "", "surname", "email", "fiscalCode", "gender", "Lcom/example/doctorapp/domain/model/Gender;", "birthdayDate", "Ljava/util/Date;", "doctorFiscalCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/doctorapp/domain/model/Gender;Ljava/util/Date;Ljava/lang/String;)V", "getBirthdayDate", "()Ljava/util/Date;", "getDoctorFiscalCode", "()Ljava/lang/String;", "getEmail", "getFiscalCode", "getGender", "()Lcom/example/doctorapp/domain/model/Gender;", "getName", "getSurname", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "formattedBirthday", "fullName", "hashCode", "", "toString", "app_debug"})
public final class Patient {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String surname = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String fiscalCode = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.model.Gender gender = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date birthdayDate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String doctorFiscalCode = null;
    
    public Patient(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String surname, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String fiscalCode, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    java.util.Date birthdayDate, @org.jetbrains.annotations.NotNull
    java.lang.String doctorFiscalCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSurname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFiscalCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.domain.model.Gender getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getBirthdayDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDoctorFiscalCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String fullName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formattedBirthday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.domain.model.Gender component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.domain.model.Patient copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String surname, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String fiscalCode, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    java.util.Date birthdayDate, @org.jetbrains.annotations.NotNull
    java.lang.String doctorFiscalCode) {
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