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
@QualifierMetadata("com.example.doctorapp.common.AuthRetrofit")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAuthRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public AppModule_ProvideAuthRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideAuthRetrofit(okHttpClientProvider.get());
  }

  public static AppModule_ProvideAuthRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider) {
    return new AppModule_ProvideAuthRetrofitFactory(okHttpClientProvider);
  }

  public static Retrofit provideAuthRetrofit(OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAuthRetrofit(okHttpClient));
  }
}
