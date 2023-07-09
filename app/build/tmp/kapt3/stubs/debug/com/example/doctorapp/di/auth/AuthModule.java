package com.example.doctorapp.di.auth;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/doctorapp/di/auth/AuthModule;", "", "()V", "provideAuthApi", "Lcom/example/doctorapp/data/remote/api/AuthApi;", "retrofit", "Lretrofit2/Retrofit;", "provideDoctorApi", "Lcom/example/doctorapp/data/remote/api/DoctorApi;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public final class AuthModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.doctorapp.di.auth.AuthModule INSTANCE = null;
    
    private AuthModule() {
        super();
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.remote.api.AuthApi provideAuthApi(@com.example.doctorapp.common.AuthRetrofit
    @org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.remote.api.DoctorApi provideDoctorApi(@com.example.doctorapp.common.DoctorRetrofit
    @org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}