// Generated by Dagger (https://dagger.dev).
package com.example.nycschools.mvvm.repository;

import com.example.nycschools.interfaces.SchoolNameInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SchoolNameRepository_Factory implements Factory<SchoolNameRepository> {
  private final Provider<SchoolNameInterface> schoolNameInterfaceProvider;

  public SchoolNameRepository_Factory(Provider<SchoolNameInterface> schoolNameInterfaceProvider) {
    this.schoolNameInterfaceProvider = schoolNameInterfaceProvider;
  }

  @Override
  public SchoolNameRepository get() {
    return newInstance(schoolNameInterfaceProvider.get());
  }

  public static SchoolNameRepository_Factory create(
      Provider<SchoolNameInterface> schoolNameInterfaceProvider) {
    return new SchoolNameRepository_Factory(schoolNameInterfaceProvider);
  }

  public static SchoolNameRepository newInstance(SchoolNameInterface schoolNameInterface) {
    return new SchoolNameRepository(schoolNameInterface);
  }
}
