package com.example.doctorapp.presentation.signup;

import com.example.doctorapp.domain.use_case.auth.SignUpUseCase;
import com.example.doctorapp.domain.use_case.doctor.GetDoctorListUseCase;
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
public final class SignUpScreenViewModel_Factory implements Factory<SignUpScreenViewModel> {
  private final Provider<SignUpUseCase> signUpUseCaseProvider;

  private final Provider<GetDoctorListUseCase> getDoctorListUseCaseProvider;

  public SignUpScreenViewModel_Factory(Provider<SignUpUseCase> signUpUseCaseProvider,
      Provider<GetDoctorListUseCase> getDoctorListUseCaseProvider) {
    this.signUpUseCaseProvider = signUpUseCaseProvider;
    this.getDoctorListUseCaseProvider = getDoctorListUseCaseProvider;
  }

  @Override
  public SignUpScreenViewModel get() {
    return newInstance(signUpUseCaseProvider.get(), getDoctorListUseCaseProvider.get());
  }

  public static SignUpScreenViewModel_Factory create(Provider<SignUpUseCase> signUpUseCaseProvider,
      Provider<GetDoctorListUseCase> getDoctorListUseCaseProvider) {
    return new SignUpScreenViewModel_Factory(signUpUseCaseProvider, getDoctorListUseCaseProvider);
  }

  public static SignUpScreenViewModel newInstance(SignUpUseCase signUpUseCase,
      GetDoctorListUseCase getDoctorListUseCase) {
    return new SignUpScreenViewModel(signUpUseCase, getDoctorListUseCase);
  }
}
