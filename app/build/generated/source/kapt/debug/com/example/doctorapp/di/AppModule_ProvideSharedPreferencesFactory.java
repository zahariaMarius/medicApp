package com.example.doctorapp.di;

import android.content.Context;
import android.content.SharedPreferences;
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
public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final Provider<Context> applicationContextProvider;

  public AppModule_ProvideSharedPreferencesFactory(Provider<Context> applicationContextProvider) {
    this.applicationContextProvider = applicationContextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(applicationContextProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesFactory create(
      Provider<Context> applicationContextProvider) {
    return new AppModule_ProvideSharedPreferencesFactory(applicationContextProvider);
  }

  public static SharedPreferences provideSharedPreferences(Context applicationContext) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSharedPreferences(applicationContext));
  }
}
