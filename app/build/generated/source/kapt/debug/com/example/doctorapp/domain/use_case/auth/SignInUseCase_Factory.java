package com.example.doctorapp.domain.use_case.auth;

import com.example.doctorapp.data.local.database.PatientDatabase;
import com.example.doctorapp.domain.repository.AuthRepository;
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
public final class SignInUseCase_Factory implements Factory<SignInUseCase> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<PatientDatabase> patientDbProvider;

  public SignInUseCase_Factory(Provider<AuthRepository> authRepositoryProvider,
      Provider<PatientDatabase> patientDbProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.patientDbProvider = patientDbProvider;
  }

  @Override
  public SignInUseCase get() {
    return newInstance(authRepositoryProvider.get(), patientDbProvider.get());
  }

  public static SignInUseCase_Factory create(Provider<AuthRepository> authRepositoryProvider,
      Provider<PatientDatabase> patientDbProvider) {
    return new SignInUseCase_Factory(authRepositoryProvider, patientDbProvider);
  }

  public static SignInUseCase newInstance(AuthRepository authRepository,
      PatientDatabase patientDb) {
    return new SignInUseCase(authRepository, patientDb);
  }
}
