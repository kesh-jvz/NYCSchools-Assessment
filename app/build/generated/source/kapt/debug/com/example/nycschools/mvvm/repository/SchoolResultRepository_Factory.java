// Generated by Dagger (https://dagger.dev).
package com.example.nycschools.mvvm.repository;

import com.example.nycschools.interfaces.SchoolResultInterface;
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
public final class SchoolResultRepository_Factory implements Factory<SchoolResultRepository> {
  private final Provider<SchoolResultInterface> schoolResultInterfaceProvider;

  public SchoolResultRepository_Factory(
      Provider<SchoolResultInterface> schoolResultInterfaceProvider) {
    this.schoolResultInterfaceProvider = schoolResultInterfaceProvider;
  }

  @Override
  public SchoolResultRepository get() {
    return newInstance(schoolResultInterfaceProvider.get());
  }

  public static SchoolResultRepository_Factory create(
      Provider<SchoolResultInterface> schoolResultInterfaceProvider) {
    return new SchoolResultRepository_Factory(schoolResultInterfaceProvider);
  }

  public static SchoolResultRepository newInstance(SchoolResultInterface schoolResultInterface) {
    return new SchoolResultRepository(schoolResultInterface);
  }
}
