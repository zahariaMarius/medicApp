package com.example.doctorapp.di;

import android.content.Context;
import com.example.doctorapp.data.local.database.DoctorDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideDoctorDatabaseFactory implements Factory<DoctorDatabase> {
  private final Provider<Context> applicationContextProvider;

  public AppModule_ProvideDoctorDatabaseFactory(Provider<Context> applicationContextProvider) {
    this.applicationContextProvider = applicationContextProvider;
  }

  @Override
  public DoctorDatabase get() {
    return provideDoctorDatabase(applicationContextProvider.get());
  }

  public static AppModule_ProvideDoctorDatabaseFactory create(
      Provider<Context> applicationContextProvider) {
    return new AppModule_ProvideDoctorDatabaseFactory(applicationContextProvider);
  }

  public static DoctorDatabase provideDoctorDatabase(Context applicationContext) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDoctorDatabase(applicationContext));
  }
}
