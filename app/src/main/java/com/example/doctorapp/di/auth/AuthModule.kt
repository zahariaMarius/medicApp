package com.example.doctorapp.di.auth

import com.example.doctorapp.data.remote.api.AuthApi
import com.example.doctorapp.data.remote.api.DoctorApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
object AuthModule {

    @Provides
    @ViewModelScoped
    fun provideAuthApi(retrofit: Retrofit): AuthApi {
        return retrofit.create(AuthApi::class.java)
    }

    @Provides
    @ViewModelScoped
    fun provideDoctorApi(retrofit: Retrofit): DoctorApi {
        return retrofit.create(DoctorApi::class.java)
    }
}