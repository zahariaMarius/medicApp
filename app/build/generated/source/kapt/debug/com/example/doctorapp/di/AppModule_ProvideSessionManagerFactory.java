package com.example.doctorapp.di;

import android.content.SharedPreferences;
import com.example.doctorapp.session.SessionManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSessionManagerFactory implements Factory<SessionManager> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public AppModule_ProvideSessionManagerFactory(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SessionManager get() {
    return provideSessionManager(sharedPreferencesProvider.get());
  }

  public static AppModule_ProvideSessionManagerFactory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new AppModule_ProvideSessionManagerFactory(sharedPreferencesProvider);
  }

  public static SessionManager provideSessionManager(SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSessionManager(sharedPreferences));
  }
}
