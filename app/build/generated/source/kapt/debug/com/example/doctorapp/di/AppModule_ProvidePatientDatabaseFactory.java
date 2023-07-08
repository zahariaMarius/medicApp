package com.example.doctorapp.di;

import android.content.Context;
import com.example.doctorapp.data.local.database.PatientDatabase;
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
    "rawtypes"
})
public final class AppModule_ProvidePatientDatabaseFactory implements Factory<PatientDatabase> {
  private final Provider<Context> applicationContextProvider;

  public AppModule_ProvidePatientDatabaseFactory(Provider<Context> applicationContextProvider) {
    this.applicationContextProvider = applicationContextProvider;
  }

  @Override
  public PatientDatabase get() {
    return providePatientDatabase(applicationContextProvider.get());
  }

  public static AppModule_ProvidePatientDatabaseFactory create(
      Provider<Context> applicationContextProvider) {
    return new AppModule_ProvidePatientDatabaseFactory(applicationContextProvider);
  }

  public static PatientDatabase providePatientDatabase(Context applicationContext) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePatientDatabase(applicationContext));
  }
}
