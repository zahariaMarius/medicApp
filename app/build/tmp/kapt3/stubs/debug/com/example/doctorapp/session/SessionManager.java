package com.example.doctorapp.session;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/doctorapp/session/SessionManager;", "", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getAuthState", "Lnet/openid/appauth/AuthState;", "getUserFiscalCode", "", "isFirstAccess", "", "logout", "", "setAuthState", "authState", "setFirstAccess", "setUserFiscalCode", "fiscalCode", "app_debug"})
public final class SessionManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences preferences = null;
    
    @javax.inject.Inject
    public SessionManager(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences preferences) {
        super();
    }
    
    public final void setAuthState(@org.jetbrains.annotations.NotNull
    net.openid.appauth.AuthState authState) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final net.openid.appauth.AuthState getAuthState() {
        return null;
    }
    
    public final void setFirstAccess() {
    }
    
    public final boolean isFirstAccess() {
        return false;
    }
    
    public final void setUserFiscalCode(@org.jetbrains.annotations.NotNull
    java.lang.String fiscalCode) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserFiscalCode() {
        return null;
    }
    
    public final void logout() {
    }
}