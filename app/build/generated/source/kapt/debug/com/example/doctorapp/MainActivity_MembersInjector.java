package com.example.doctorapp;

import com.example.doctorapp.session.AuthServiceHelper;
import com.example.doctorapp.session.SessionManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<AuthServiceHelper> authServiceHelperProvider;

  public MainActivity_MembersInjector(Provider<SessionManager> sessionManagerProvider,
      Provider<AuthServiceHelper> authServiceHelperProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
    this.authServiceHelperProvider = authServiceHelperProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<SessionManager> sessionManagerProvider,
      Provider<AuthServiceHelper> authServiceHelperProvider) {
    return new MainActivity_MembersInjector(sessionManagerProvider, authServiceHelperProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectSessionManager(instance, sessionManagerProvider.get());
    injectAuthServiceHelper(instance, authServiceHelperProvider.get());
  }

  @InjectedFieldSignature("com.example.doctorapp.MainActivity.sessionManager")
  public static void injectSessionManager(MainActivity instance, SessionManager sessionManager) {
    instance.sessionManager = sessionManager;
  }

  @InjectedFieldSignature("com.example.doctorapp.MainActivity.authServiceHelper")
  public static void injectAuthServiceHelper(MainActivity instance,
      AuthServiceHelper authServiceHelper) {
    instance.authServiceHelper = authServiceHelper;
  }
}
