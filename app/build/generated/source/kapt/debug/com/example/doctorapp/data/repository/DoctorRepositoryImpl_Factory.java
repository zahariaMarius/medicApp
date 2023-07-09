package com.example.doctorapp.data.repository;

import com.example.doctorapp.data.remote.api.DoctorApi;
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
public final class DoctorRepositoryImpl_Factory implements Factory<DoctorRepositoryImpl> {
  private final Provider<DoctorApi> doctorApiProvider;

  public DoctorRepositoryImpl_Factory(Provider<DoctorApi> doctorApiProvider) {
    this.doctorApiProvider = doctorApiProvider;
  }

  @Override
  public DoctorRepositoryImpl get() {
    return newInstance(doctorApiProvider.get());
  }

  public static DoctorRepositoryImpl_Factory create(Provider<DoctorApi> doctorApiProvider) {
    return new DoctorRepositoryImpl_Factory(doctorApiProvider);
  }

  public static DoctorRepositoryImpl newInstance(DoctorApi doctorApi) {
    return new DoctorRepositoryImpl(doctorApi);
  }
}
