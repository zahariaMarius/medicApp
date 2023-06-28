package com.example.doctorapp.di.home

import com.example.doctorapp.data.repository.VisitRepositoryImpl
import com.example.doctorapp.domain.repository.VisitRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class VisitRepositoryBinding {

    @Binds
    @ViewModelScoped
    abstract fun bindVisitRepository(
        visitRepositoryImpl: VisitRepositoryImpl
    ): VisitRepository

}