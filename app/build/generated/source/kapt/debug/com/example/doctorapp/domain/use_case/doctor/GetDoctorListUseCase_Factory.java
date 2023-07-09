package com.example.doctorapp.domain.use_case.doctor;

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
public final class GetDoctorListUseCase_Factory implements Factory<GetDoctorListUseCase> {
  private final Provider<DoctorRepository> doctorRepositoryProvider;

  public GetDoctorListUseCase_Factory(Provider<DoctorRepository> doctorRepositoryProvider) {
    this.doctorRepositoryProvider = doctorRepositoryProvider;
  }

  @Override
  public GetDoctorListUseCase get() {
    return newInstance(doctorRepositoryProvider.get());
  }

  public static GetDoctorListUseCase_Factory create(
      Provider<DoctorRepository> doctorRepositoryProvider) {
    return new GetDoctorListUseCase_Factory(doctorRepositoryProvider);
  }

  public static GetDoctorListUseCase newInstance(DoctorRepository doctorRepository) {
    return new GetDoctorListUseCase(doctorRepository);
  }
}
