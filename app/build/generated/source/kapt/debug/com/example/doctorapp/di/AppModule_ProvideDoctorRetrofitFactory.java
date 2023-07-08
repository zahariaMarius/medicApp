package com.example.doctorapp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.example.doctorapp.common.DoctorRetrofit")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideDoctorRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public AppModule_ProvideDoctorRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideDoctorRetrofit(okHttpClientProvider.get());
  }

  public static AppModule_ProvideDoctorRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider) {
    return new AppModule_ProvideDoctorRetrofitFactory(okHttpClientProvider);
  }

  public static Retrofit provideDoctorRetrofit(OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDoctorRetrofit(okHttpClient));
  }
}
