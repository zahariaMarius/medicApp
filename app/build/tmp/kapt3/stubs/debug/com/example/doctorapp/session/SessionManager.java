package com.example.doctorapp.session;

import android.content.SharedPreferences;
import android.util.Log;
import com.example.doctorapp.common.Constants;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/doctorapp/session/SessionManager;", "", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getUserFiscalCode", "", "isLogged", "", "logout", "", "setLoggedUser", "fiscalCode", "app_debug"})
public final class SessionManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences preferences = null;
    
    @javax.inject.Inject
    public SessionManager(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences preferences) {
        super();
    }
    
    public final boolean isLogged() {
        return false;
    }
    
    public final void setLoggedUser(@org.jetbrains.annotations.NotNull
    java.lang.String fiscalCode) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserFiscalCode() {
        return null;
    }
    
    public final void logout() {
    }
}