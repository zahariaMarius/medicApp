package com.example.doctorapp.data.repository;

import com.example.doctorapp.data.remote.api.VisitApi;
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
    "rawtypes"
})
public final class VisitRepositoryImpl_Factory implements Factory<VisitRepositoryImpl> {
  private final Provider<VisitApi> visitApiProvider;

  public VisitRepositoryImpl_Factory(Provider<VisitApi> visitApiProvider) {
    this.visitApiProvider = visitApiProvider;
  }

  @Override
  public VisitRepositoryImpl get() {
    return newInstance(visitApiProvider.get());
  }

  public static VisitRepositoryImpl_Factory create(Provider<VisitApi> visitApiProvider) {
    return new VisitRepositoryImpl_Factory(visitApiProvider);
  }

  public static VisitRepositoryImpl newInstance(VisitApi visitApi) {
    return new VisitRepositoryImpl(visitApi);
  }
}
