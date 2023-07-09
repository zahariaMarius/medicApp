package com.example.doctorapp.presentation.home;

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
public final class HomeScreenViewModel_Factory implements Factory<HomeScreenViewModel> {
  private final Provider<GetPatientVisitsUseCase> getPatientVisitsUseCaseProvider;

  public HomeScreenViewModel_Factory(
      Provider<GetPatientVisitsUseCase> getPatientVisitsUseCaseProvider) {
    this.getPatientVisitsUseCaseProvider = getPatientVisitsUseCaseProvider;
  }

  @Override
  public HomeScreenViewModel get() {
    return newInstance(getPatientVisitsUseCaseProvider.get());
  }

  public static HomeScreenViewModel_Factory create(
      Provider<GetPatientVisitsUseCase> getPatientVisitsUseCaseProvider) {
    return new HomeScreenViewModel_Factory(getPatientVisitsUseCaseProvider);
  }

  public static HomeScreenViewModel newInstance(GetPatientVisitsUseCase getPatientVisitsUseCase) {
    return new HomeScreenViewModel(getPatientVisitsUseCase);
  }
}
