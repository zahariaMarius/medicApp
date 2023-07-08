package com.example.doctorapp.presentation.signin;

import com.example.doctorapp.domain.use_case.auth.SignInUseCase;
import com.example.doctorapp.session.SessionManager;
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
    "rawtypes"
})
public final class SignInScreenViewModel_Factory implements Factory<SignInScreenViewModel> {
  private final Provider<SignInUseCase> signInUseCaseProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public SignInScreenViewModel_Factory(Provider<SignInUseCase> signInUseCaseProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.signInUseCaseProvider = signInUseCaseProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public SignInScreenViewModel get() {
    return newInstance(signInUseCaseProvider.get(), sessionManagerProvider.get());
  }

  public static SignInScreenViewModel_Factory create(Provider<SignInUseCase> signInUseCaseProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new SignInScreenViewModel_Factory(signInUseCaseProvider, sessionManagerProvider);
  }

  public static SignInScreenViewModel newInstance(SignInUseCase signInUseCase,
      SessionManager sessionManager) {
    return new SignInScreenViewModel(signInUseCase, sessionManager);
  }
}
