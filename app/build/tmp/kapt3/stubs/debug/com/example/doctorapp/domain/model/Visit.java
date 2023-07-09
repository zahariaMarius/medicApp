package com.example.doctorapp.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\t\u0010!\u001a\u00020\fH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0006\u0010$\u001a\u00020\u0003J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012\u00a8\u0006*"}, d2 = {"Lcom/example/doctorapp/domain/model/Visit;", "", "id", "", "dateTime", "Ljava/util/Date;", "doctorName", "doctorSurname", "doctorFiscalCode", "status", "Lcom/example/doctorapp/domain/model/Status;", "online", "", "urlMeet", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/doctorapp/domain/model/Status;ZLjava/lang/String;)V", "getDateTime", "()Ljava/util/Date;", "getDoctorFiscalCode", "()Ljava/lang/String;", "getDoctorName", "getDoctorSurname", "getId", "getOnline", "()Z", "getStatus", "()Lcom/example/doctorapp/domain/model/Status;", "getUrlMeet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "doctorFullName", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class Visit {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date dateTime = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String doctorName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String doctorSurname = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String doctorFiscalCode = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.model.Status status = null;
    private final boolean online = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String urlMeet = null;
    
    public Visit(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.util.Date dateTime, @org.jetbrains.annotations.NotNull
    java.lang.String doctorName, @org.jetbrains.annotations.NotNull
    java.lang.String doctorSurname, @org.jetbrains.annotations.NotNull
    java.lang.String doctorFiscalCode, @org.jetbrains.annotations.NotNull
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
    public final java.lang.String getDoctorName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDoctorSurname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDoctorFiscalCode() {
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
    public final java.lang.String doctorFullName() {
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
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.domain.model.Status component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.domain.model.Visit copy(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.util.Date dateTime, @org.jetbrains.annotations.NotNull
    java.lang.String doctorName, @org.jetbrains.annotations.NotNull
    java.lang.String doctorSurname, @org.jetbrains.annotations.NotNull
    java.lang.String doctorFiscalCode, @org.jetbrains.annotations.NotNull
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