package com.example.doctorapp.di;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.Room;
import com.example.doctorapp.common.AuthRetrofit;
import com.example.doctorapp.common.Constants;
import com.example.doctorapp.common.DoctorRetrofit;
import com.example.doctorapp.common.VisitRetrofit;
import com.example.doctorapp.data.local.database.DoctorDatabase;
import com.example.doctorapp.data.local.database.PatientDatabase;
import com.example.doctorapp.data.local.database.VisitDatabase;
import com.example.doctorapp.data.remote.api.AuthApi;
import com.example.doctorapp.data.remote.api.DoctorApi;
import com.example.doctorapp.data.remote.api.VisitApi;
import com.example.doctorapp.session.SessionManager;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/example/doctorapp/di/AppModule;", "", "()V", "provideAuthRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideDoctorDatabase", "Lcom/example/doctorapp/data/local/database/DoctorDatabase;", "applicationContext", "Landroid/content/Context;", "provideDoctorRetrofit", "provideOkHttpClient", "providePatientDatabase", "Lcom/example/doctorapp/data/local/database/PatientDatabase;", "provideSessionManager", "Lcom/example/doctorapp/session/SessionManager;", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPreferences", "provideVisitDatabase", "Lcom/example/doctorapp/data/local/database/VisitDatabase;", "provideVisitRetrofit", "app_debug"})
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
    public final com.example.doctorapp.session.SessionManager provideSessionManager(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @com.example.doctorapp.common.DoctorRetrofit
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideDoctorRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @com.example.doctorapp.common.AuthRetrofit
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideAuthRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @com.example.doctorapp.common.VisitRetrofit
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideVisitRetrofit(@org.jetbrains.annotations.NotNull
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