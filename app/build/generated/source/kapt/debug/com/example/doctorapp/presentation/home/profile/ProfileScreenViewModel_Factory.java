package com.example.doctorapp.presentation.home.profile;

import com.example.doctorapp.domain.use_case.doctor.GetDoctorProfileUseCase;
import com.example.doctorapp.domain.use_case.patient.GetPatientProfileUseCase;
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
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ProfileScreenViewModel_Factory implements Factory<ProfileScreenViewModel> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<GetPatientProfileUseCase> getPatientProfileUseCaseProvider;

  private final Provider<GetDoctorProfileUseCase> getDoctorProfileUseCaseProvider;

  public ProfileScreenViewModel_Factory(Provider<SessionManager> sessionManagerProvider,
      Provider<GetPatientProfileUseCase> getPatientProfileUseCaseProvider,
      Provider<GetDoctorProfileUseCase> getDoctorProfileUseCaseProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
    this.getPatientProfileUseCaseProvider = getPatientProfileUseCaseProvider;
    this.getDoctorProfileUseCaseProvider = getDoctorProfileUseCaseProvider;
  }

  @Override
  public ProfileScreenViewModel get() {
    return newInstance(sessionManagerProvider.get(), getPatientProfileUseCaseProvider.get(), getDoctorProfileUseCaseProvider.get());
  }

  public static ProfileScreenViewModel_Factory create(
      Provider<SessionManager> sessionManagerProvider,
      Provider<GetPatientProfileUseCase> getPatientProfileUseCaseProvider,
      Provider<GetDoctorProfileUseCase> getDoctorProfileUseCaseProvider) {
    return new ProfileScreenViewModel_Factory(sessionManagerProvider, getPatientProfileUseCaseProvider, getDoctorProfileUseCaseProvider);
  }

  public static ProfileScreenViewModel newInstance(SessionManager sessionManager,
      GetPatientProfileUseCase getPatientProfileUseCase,
      GetDoctorProfileUseCase getDoctorProfileUseCase) {
    return new ProfileScreenViewModel(sessionManager, getPatientProfileUseCase, getDoctorProfileUseCase);
  }
}
