package com.example.doctorapp.domain.use_case.patient;

import com.example.doctorapp.data.local.database.PatientDatabase;
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
public final class GetPatientProfileUseCase_Factory implements Factory<GetPatientProfileUseCase> {
  private final Provider<PatientDatabase> patientDatabaseProvider;

  public GetPatientProfileUseCase_Factory(Provider<PatientDatabase> patientDatabaseProvider) {
    this.patientDatabaseProvider = patientDatabaseProvider;
  }

  @Override
  public GetPatientProfileUseCase get() {
    return newInstance(patientDatabaseProvider.get());
  }

  public static GetPatientProfileUseCase_Factory create(
      Provider<PatientDatabase> patientDatabaseProvider) {
    return new GetPatientProfileUseCase_Factory(patientDatabaseProvider);
  }

  public static GetPatientProfileUseCase newInstance(PatientDatabase patientDatabase) {
    return new GetPatientProfileUseCase(patientDatabase);
  }
}
