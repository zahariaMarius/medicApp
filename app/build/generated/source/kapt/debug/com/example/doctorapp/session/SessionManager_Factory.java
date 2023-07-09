package com.example.doctorapp.session;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
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
public final class SessionManager_Factory implements Factory<SessionManager> {
  private final Provider<SharedPreferences> preferencesProvider;

  public SessionManager_Factory(Provider<SharedPreferences> preferencesProvider) {
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public SessionManager get() {
    return newInstance(preferencesProvider.get());
  }

  public static SessionManager_Factory create(Provider<SharedPreferences> preferencesProvider) {
    return new SessionManager_Factory(preferencesProvider);
  }

  public static SessionManager newInstance(SharedPreferences preferences) {
    return new SessionManager(preferences);
  }
}
