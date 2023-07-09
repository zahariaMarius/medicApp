package com.example.doctorapp.domain.use_case.doctor;

import com.example.doctorapp.data.local.database.DoctorDatabase;
import com.example.doctorapp.domain.repository.DoctorRepository;
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
public final class GetDoctorProfileUseCase_Factory implements Factory<GetDoctorProfileUseCase> {
  private final Provider<DoctorRepository> doctorRepositoryProvider;

  private final Provider<DoctorDatabase> doctorDatabaseProvider;

  public GetDoctorProfileUseCase_Factory(Provider<DoctorRepository> doctorRepositoryProvider,
      Provider<DoctorDatabase> doctorDatabaseProvider) {
    this.doctorRepositoryProvider = doctorRepositoryProvider;
    this.doctorDatabaseProvider = doctorDatabaseProvider;
  }

  @Override
  public GetDoctorProfileUseCase get() {
    return newInstance(doctorRepositoryProvider.get(), doctorDatabaseProvider.get());
  }

  public static GetDoctorProfileUseCase_Factory create(
      Provider<DoctorRepository> doctorRepositoryProvider,
      Provider<DoctorDatabase> doctorDatabaseProvider) {
    return new GetDoctorProfileUseCase_Factory(doctorRepositoryProvider, doctorDatabaseProvider);
  }

  public static GetDoctorProfileUseCase newInstance(DoctorRepository doctorRepository,
      DoctorDatabase doctorDatabase) {
    return new GetDoctorProfileUseCase(doctorRepository, doctorDatabase);
  }
}
