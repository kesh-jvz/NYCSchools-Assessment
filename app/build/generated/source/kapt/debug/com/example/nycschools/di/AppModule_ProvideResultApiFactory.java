// Generated by Dagger (https://dagger.dev).
package com.example.nycschools.di;

import com.example.nycschools.interfaces.SchoolResultInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideResultApiFactory implements Factory<SchoolResultInterface> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideResultApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public SchoolResultInterface get() {
    return provideResultApi(retrofitProvider.get());
  }

  public static AppModule_ProvideResultApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideResultApiFactory(retrofitProvider);
  }

  public static SchoolResultInterface provideResultApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideResultApi(retrofit));
  }
}
