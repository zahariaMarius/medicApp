package com.example.doctorapp.di.auth;

import com.example.doctorapp.data.repository.AuthRepositoryImpl;
import com.example.doctorapp.domain.repository.AuthRepository;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/doctorapp/di/auth/AuthRepositoryBinding;", "", "()V", "bindAuthRepository", "Lcom/example/doctorapp/domain/repository/AuthRepository;", "authRepositoryImpl", "Lcom/example/doctorapp/data/repository/AuthRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public abstract class AuthRepositoryBinding {
    
    public AuthRepositoryBinding() {
        super();
    }
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.example.doctorapp.domain.repository.AuthRepository bindAuthRepository(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.repository.AuthRepositoryImpl authRepositoryImpl);
}