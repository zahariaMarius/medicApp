package com.example.doctorapp.di.auth

import com.example.doctorapp.data.repository.DoctorRepositoryImpl
import com.example.doctorapp.domain.repository.DoctorRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
abstract class DoctorRepositoryBinding {

    @Binds
    @ViewModelScoped
    abstract fun bindDoctorRepository(
        doctorRepositoryImpl: DoctorRepositoryImpl
    ): DoctorRepository

}