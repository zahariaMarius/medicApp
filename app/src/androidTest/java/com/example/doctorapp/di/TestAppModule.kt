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
import com.example.doctorapp.session.SessionManager
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule{

//    @Provides
//    @Singleton
//    fun provideSharedPreferencesTest(@ApplicationContext applicationContext: Context) =
//        applicationContext.getSharedPreferences(Constants.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)


//    @Provides
//    @Singleton
//    fun provideFakeSessionManager(): SessionManager {
//        // Return a fake implementation of SessionManager for testing
//        return SessionManagerTest()
//    }
//
//    @Provides
//    @Singleton
//    fun provideOkHttpClientTest(): OkHttpClient {
//        val httpLoggingInterceptor = HttpLoggingInterceptor()
//        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
//        return OkHttpClient.Builder()
//            .connectTimeout(10, TimeUnit.SECONDS)
//            .addInterceptor(httpLoggingInterceptor)
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    @DoctorRetrofit
//    fun provideDoctorRetrofitTest(okHttpClient: OkHttpClient): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl(Constants.DOCTOR_BASE_URL)
//            .client(okHttpClient)
//            .addConverterFactory(
//                GsonConverterFactory.create(
//                    GsonBuilder()
//                        .setDateFormat(Constants.DATE_FORMAT)
//                        .create()
//                )
//            )
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    @AuthRetrofit
//    fun provideAuthRetrofitTest(okHttpClient: OkHttpClient): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl(Constants.AUTH_BASE_URL)
//            .client(okHttpClient)
//            .addConverterFactory(
//                GsonConverterFactory.create(
//                    GsonBuilder()
//                        .setDateFormat(Constants.DATE_FORMAT)
//                        .create()
//                )
//            )
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    @VisitRetrofit
//    fun provideVisitRetrofitTest(okHttpClient: OkHttpClient): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl(Constants.VISIT_BASE_URL)
//            .client(okHttpClient)
//            .addConverterFactory(
//                GsonConverterFactory.create(
//                    GsonBuilder()
//                        .setDateFormat(Constants.DATE_FORMAT)
//                        .create()
//                )
//            )
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    @Named("test_patient_db")
//    fun providePatientDatabaseTest(@ApplicationContext applicationContext: Context)=
//        Room.inMemoryDatabaseBuilder(
//            context = applicationContext,
//            PatientDatabase::class.java,
//        ).allowMainThreadQueries()
//         .build()

    @Provides
    @Singleton
    @Named("test_doctor_db")
    fun provideDoctorDatabaseTest(@ApplicationContext applicationContext: Context) =
        Room.inMemoryDatabaseBuilder(
            context = applicationContext,
            DoctorDatabase::class.java,
        ).allowMainThreadQueries()
         .build()

//    @Provides
//    @Singleton
//    fun provideVisitDatabase(@ApplicationContext applicationContext: Context): VisitDatabase {
//        return Room.databaseBuilder(
//            context = applicationContext,
//            VisitDatabase::class.java,
//            "visit.db"
//        ).build()
//    }
}