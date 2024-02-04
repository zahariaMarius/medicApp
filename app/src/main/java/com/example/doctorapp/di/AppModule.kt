package com.example.doctorapp.di

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.example.doctorapp.common.Constants
import com.example.doctorapp.data.local.database.DoctorDatabase
import com.example.doctorapp.data.local.database.PatientDatabase
import com.example.doctorapp.data.local.database.VisitDatabase
import com.example.doctorapp.data.remote.interceptors.AuthInterceptor
import com.example.doctorapp.session.AuthServiceHelper
import com.example.doctorapp.session.SessionManager
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.openid.appauth.AppAuthConfiguration
import net.openid.appauth.AuthorizationService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.HttpURLConnection
import java.net.URL
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
    fun provideAuthorizationService(@ApplicationContext applicationContext: Context): AuthorizationService {
        val appAuthConfiguration = AppAuthConfiguration
            .Builder()
            .setConnectionBuilder { uri ->
                URL(uri.toString()).openConnection() as HttpURLConnection
            }
            .setSkipIssuerHttpsCheck(true)
            .build()
        return AuthorizationService(applicationContext, appAuthConfiguration)
    }

    @Provides
    @Singleton
    fun provideSessionManager(sharedPreferences: SharedPreferences): SessionManager {
        return SessionManager(sharedPreferences)
    }

    @Provides
    @Singleton
    fun provideAuthServiceHelper(authorizationService: AuthorizationService, sessionManager: SessionManager): AuthServiceHelper {
        return AuthServiceHelper(authorizationService, sessionManager)
    }

    @Provides
    @Singleton
    fun provideAuthInterceptor(sessionManager: SessionManager): AuthInterceptor {
        return AuthInterceptor(sessionManager)
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        authInterceptor: AuthInterceptor
    ): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .addInterceptor(httpLoggingInterceptor)
            .addInterceptor(authInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.RETROFIT_BASE_URL)
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
