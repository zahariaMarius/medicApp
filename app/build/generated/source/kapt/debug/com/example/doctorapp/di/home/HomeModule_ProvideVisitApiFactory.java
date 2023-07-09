package com.example.doctorapp.di.home;

import com.example.doctorapp.data.remote.api.VisitApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
@QualifierMetadata("com.example.doctorapp.common.VisitRetrofit")
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
public final class HomeModule_ProvideVisitApiFactory implements Factory<VisitApi> {
  private final Provider<Retrofit> retrofitProvider;

  public HomeModule_ProvideVisitApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public VisitApi get() {
    return provideVisitApi(retrofitProvider.get());
  }

  public static HomeModule_ProvideVisitApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new HomeModule_ProvideVisitApiFactory(retrofitProvider);
  }

  public static VisitApi provideVisitApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(HomeModule.INSTANCE.provideVisitApi(retrofit));
  }
}
