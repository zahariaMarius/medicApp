package com.example.doctorapp.di.home

import com.example.doctorapp.data.remote.api.VisitApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
object HomeModule {

    @Provides
    @ViewModelScoped
    fun provideVisitApi(retrofit: Retrofit): VisitApi {
        return retrofit.create(VisitApi::class.java)
    }
}