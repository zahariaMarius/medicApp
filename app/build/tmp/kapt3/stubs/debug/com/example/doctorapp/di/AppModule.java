package com.example.doctorapp.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011H\u0007J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0012\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/example/doctorapp/di/AppModule;", "", "()V", "provideAuthInterceptor", "Lcom/example/doctorapp/data/remote/interceptors/AuthInterceptor;", "sessionManager", "Lcom/example/doctorapp/session/SessionManager;", "provideAuthServiceHelper", "Lcom/example/doctorapp/session/AuthServiceHelper;", "authorizationService", "Lnet/openid/appauth/AuthorizationService;", "provideAuthorizationService", "applicationContext", "Landroid/content/Context;", "provideDoctorDatabase", "Lcom/example/doctorapp/data/local/database/DoctorDatabase;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "authInterceptor", "providePatientDatabase", "Lcom/example/doctorapp/data/local/database/PatientDatabase;", "provideRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "provideSessionManager", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPreferences", "provideVisitDatabase", "Lcom/example/doctorapp/data/local/database/VisitDatabase;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.doctorapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences provideSharedPreferences(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context applicationContext) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final net.openid.appauth.AuthorizationService provideAuthorizationService(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context applicationContext) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.session.SessionManager provideSessionManager(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.session.AuthServiceHelper provideAuthServiceHelper(@org.jetbrains.annotations.NotNull
    net.openid.appauth.AuthorizationService authorizationService, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.session.SessionManager sessionManager) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.remote.interceptors.AuthInterceptor provideAuthInterceptor(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.session.SessionManager sessionManager) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.remote.interceptors.AuthInterceptor authInterceptor) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.local.database.PatientDatabase providePatientDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context applicationContext) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.local.database.DoctorDatabase provideDoctorDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context applicationContext) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.local.database.VisitDatabase provideVisitDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context applicationContext) {
        return null;
    }
}