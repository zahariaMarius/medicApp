package com.example.doctorapp.common;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/doctorapp/common/Constants;", "", "()V", "AUTHORIZATION_URL", "", "AUTHSTATE_KEY", "CODE_VERIFIER_CHALLENGE_METHOD", "DATE_FORMAT", "FIRST_ACCESS_KEY", "KEYCLOAK_CLIENT_ID", "LOGGED_USER_KEY", "LOGOUT_URL", "MESSAGE_DIGEST_ALGORITHM", "REDIRECT_AUTH_URL", "REDIRECT_LOGOUT_URL", "RETROFIT_BASE_URL", "SHARED_PREFERENCES_KEY", "TOKEN_URL", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RETROFIT_BASE_URL = "http://api-gateway-service.192.168.105.4.nip.io/api/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATE_FORMAT = "dd-MM-yyyy";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SHARED_PREFERENCES_KEY = "SESSION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AUTHSTATE_KEY = "AUTHSTATE";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FIRST_ACCESS_KEY = "FIRSTACCESS";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOGGED_USER_KEY = "LOGGEDUSER";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MESSAGE_DIGEST_ALGORITHM = "SHA-256";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CODE_VERIFIER_CHALLENGE_METHOD = "S256";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AUTHORIZATION_URL = "http://keycloak.192.168.105.4.nip.io/auth/realms/swagmed_oauth/protocol/openid-connect/auth";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TOKEN_URL = "http://keycloak.192.168.105.4.nip.io/auth/realms/swagmed_oauth/protocol/openid-connect/token";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOGOUT_URL = "http://keycloak.192.168.105.4.nip.io/auth/realms/swagmed_oauth/protocol/openid-connect/logout";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEYCLOAK_CLIENT_ID = "swagmed-oauth-client";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REDIRECT_AUTH_URL = "com.example.doctorapp://oauth/callback";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REDIRECT_LOGOUT_URL = "com.example.doctorapp://oauth/logout";
    @org.jetbrains.annotations.NotNull
    public static final com.example.doctorapp.common.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}