package com.example.doctorapp.di

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.example.doctorapp.common.AuthRetrofit
import com.example.doctorapp.common.Constants
import com.example.doctorapp.common.DoctorRetrofit
import com.example.doctorapp.common.VisitRetrofit
import com.example.doctorapp.data.local.database.DoctorDatabase
import com.example.doctorapp.data.local.database.PatientDatabase
import com.example.doctorapp.data.local.database.VisitDatabase
import com.example.doctorapp.data.remote.api.AuthApi
import com.example.doctorapp.data.remote.api.DoctorApi
import com.example.doctorapp.data.remote.api.VisitApi
import com.example.doctorapp.session.SessionManager
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
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext applicationContext: Context): SharedPreferences {
        return applicationContext.getSharedPreferences(Constants.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun provideSessionManager(sharedPreferences: SharedPreferences): SessionManager {
        return SessionManager(sharedPreferences)
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    @DoctorRetrofit
    fun provideDoctorRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.DOCTOR_BASE_URL)
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
    @AuthRetrofit
    fun provideAuthRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.AUTH_BASE_URL)
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
    @VisitRetrofit
    fun provideVisitRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.VISIT_BASE_URL)
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
