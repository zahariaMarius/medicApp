package com.example.doctorapp.domain.use_case.visit;

import com.example.doctorapp.data.local.database.VisitDatabase;
import com.example.doctorapp.domain.repository.VisitRepository;
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
public final class GetPatientVisitsUseCase_Factory implements Factory<GetPatientVisitsUseCase> {
  private final Provider<VisitDatabase> visitDatabaseProvider;

  private final Provider<VisitRepository> visitRepositoryProvider;

  public GetPatientVisitsUseCase_Factory(Provider<VisitDatabase> visitDatabaseProvider,
      Provider<VisitRepository> visitRepositoryProvider) {
    this.visitDatabaseProvider = visitDatabaseProvider;
    this.visitRepositoryProvider = visitRepositoryProvider;
  }

  @Override
  public GetPatientVisitsUseCase get() {
    return newInstance(visitDatabaseProvider.get(), visitRepositoryProvider.get());
  }

  public static GetPatientVisitsUseCase_Factory create(
      Provider<VisitDatabase> visitDatabaseProvider,
      Provider<VisitRepository> visitRepositoryProvider) {
    return new GetPatientVisitsUseCase_Factory(visitDatabaseProvider, visitRepositoryProvider);
  }

  public static GetPatientVisitsUseCase newInstance(VisitDatabase visitDatabase,
      VisitRepository visitRepository) {
    return new GetPatientVisitsUseCase(visitDatabase, visitRepository);
  }
}
