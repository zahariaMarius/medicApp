package com.example.doctorapp.di;

import android.content.Context;
import com.example.doctorapp.data.local.database.VisitDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideVisitDatabaseFactory implements Factory<VisitDatabase> {
  private final Provider<Context> applicationContextProvider;

  public AppModule_ProvideVisitDatabaseFactory(Provider<Context> applicationContextProvider) {
    this.applicationContextProvider = applicationContextProvider;
  }

  @Override
  public VisitDatabase get() {
    return provideVisitDatabase(applicationContextProvider.get());
  }

  public static AppModule_ProvideVisitDatabaseFactory create(
      Provider<Context> applicationContextProvider) {
    return new AppModule_ProvideVisitDatabaseFactory(applicationContextProvider);
  }

  public static VisitDatabase provideVisitDatabase(Context applicationContext) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideVisitDatabase(applicationContext));
  }
}
