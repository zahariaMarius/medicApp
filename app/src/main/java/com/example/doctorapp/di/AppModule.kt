package com.example.doctorapp.di

import android.content.Context
import androidx.room.Room
import com.example.doctorapp.common.Constants
import com.example.doctorapp.data.local.database.DoctorDatabase
import com.example.doctorapp.data.local.database.PatientDatabase
import com.example.doctorapp.data.local.database.VisitDatabase
import com.example.doctorapp.data.remote.api.AuthApi
import com.example.doctorapp.data.remote.api.DoctorApi
import com.example.doctorapp.data.remote.api.VisitApi
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(VisitApi.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder()
                        .setDateFormat(Constants.DATE_FORMAT)
                        .create()
                )
            )
            .build()
    }

    @Provides
    @Singleton
    fun providePatientDatabase(@ApplicationContext applicationContext: Context): PatientDatabase {
        return Room.databaseBuilder(
            context = applicationContext,
            PatientDatabase::class.java,
            "patient.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideDoctorDatabase(@ApplicationContext applicationContext: Context): DoctorDatabase {
        return Room.databaseBuilder(
            context = applicationContext,
            DoctorDatabase::class.java,
            "doctor.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideVisitDatabase(@ApplicationContext applicationContext: Context): VisitDatabase {
        return Room.databaseBuilder(
            context = applicationContext,
            VisitDatabase::class.java,
            "visit.db"
        ).build()
    }


}
