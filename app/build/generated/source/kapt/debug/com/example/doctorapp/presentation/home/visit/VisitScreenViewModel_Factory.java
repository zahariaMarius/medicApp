package com.example.doctorapp.presentation.home.visit;

import com.example.doctorapp.domain.use_case.visit.GetPatientVisitsUseCase;
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
public final class VisitScreenViewModel_Factory implements Factory<VisitScreenViewModel> {
  private final Provider<GetPatientVisitsUseCase> getPatientVisitsUseCaseProvider;

  public VisitScreenViewModel_Factory(
      Provider<GetPatientVisitsUseCase> getPatientVisitsUseCaseProvider) {
    this.getPatientVisitsUseCaseProvider = getPatientVisitsUseCaseProvider;
  }

  @Override
  public VisitScreenViewModel get() {
    return newInstance(getPatientVisitsUseCaseProvider.get());
  }

  public static VisitScreenViewModel_Factory create(
      Provider<GetPatientVisitsUseCase> getPatientVisitsUseCaseProvider) {
    return new VisitScreenViewModel_Factory(getPatientVisitsUseCaseProvider);
  }

  public static VisitScreenViewModel newInstance(GetPatientVisitsUseCase getPatientVisitsUseCase) {
    return new VisitScreenViewModel(getPatientVisitsUseCase);
  }
}
