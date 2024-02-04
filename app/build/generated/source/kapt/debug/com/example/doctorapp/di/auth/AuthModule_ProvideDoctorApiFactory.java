package com.example.doctorapp.di.auth;

import com.example.doctorapp.data.remote.api.DoctorApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
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
public final class AuthModule_ProvideDoctorApiFactory implements Factory<DoctorApi> {
  private final Provider<Retrofit> retrofitProvider;

  public AuthModule_ProvideDoctorApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public DoctorApi get() {
    return provideDoctorApi(retrofitProvider.get());
  }

  public static AuthModule_ProvideDoctorApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AuthModule_ProvideDoctorApiFactory(retrofitProvider);
  }

  public static DoctorApi provideDoctorApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AuthModule.INSTANCE.provideDoctorApi(retrofit));
  }
}
