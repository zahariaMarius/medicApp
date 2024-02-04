package com.example.doctorapp.domain.use_case.visit;

import com.example.doctorapp.data.local.database.VisitDatabase;
import com.example.doctorapp.domain.repository.VisitRepository;
import com.example.doctorapp.session.SessionManager;
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
public final class GetPatientVisitsUseCase_Factory implements Factory<GetPatientVisitsUseCase> {
  private final Provider<VisitDatabase> visitDatabaseProvider;

  private final Provider<VisitRepository> visitRepositoryProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public GetPatientVisitsUseCase_Factory(Provider<VisitDatabase> visitDatabaseProvider,
      Provider<VisitRepository> visitRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.visitDatabaseProvider = visitDatabaseProvider;
    this.visitRepositoryProvider = visitRepositoryProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public GetPatientVisitsUseCase get() {
    return newInstance(visitDatabaseProvider.get(), visitRepositoryProvider.get(), sessionManagerProvider.get());
  }

  public static GetPatientVisitsUseCase_Factory create(
      Provider<VisitDatabase> visitDatabaseProvider,
      Provider<VisitRepository> visitRepositoryProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new GetPatientVisitsUseCase_Factory(visitDatabaseProvider, visitRepositoryProvider, sessionManagerProvider);
  }

  public static GetPatientVisitsUseCase newInstance(VisitDatabase visitDatabase,
      VisitRepository visitRepository, SessionManager sessionManager) {
    return new GetPatientVisitsUseCase(visitDatabase, visitRepository, sessionManager);
  }
}
