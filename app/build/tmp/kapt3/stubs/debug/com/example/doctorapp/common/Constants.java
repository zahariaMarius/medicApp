package com.example.doctorapp.common;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/doctorapp/common/Constants;", "", "()V", "AUTH_BASE_URL", "", "DATE_FORMAT", "DOCTOR_BASE_URL", "LOGGED_USER_KEY", "SHARED_PREFERENCES_KEY", "VISIT_BASE_URL", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DOCTOR_BASE_URL = "http://10.0.2.2:8092/api/doctor/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AUTH_BASE_URL = "http://10.0.2.2:8090/api/patient/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VISIT_BASE_URL = "http://10.0.2.2:8091/api/visit/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATE_FORMAT = "dd-MM-yyyy";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SHARED_PREFERENCES_KEY = "SESSION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOGGED_USER_KEY = "LOGGEDUSER";
    @org.jetbrains.annotations.NotNull
    public static final com.example.doctorapp.common.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}