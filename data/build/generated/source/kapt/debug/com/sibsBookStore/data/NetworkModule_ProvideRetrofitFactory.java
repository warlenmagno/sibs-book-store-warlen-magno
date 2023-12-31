// Generated by Dagger (https://dagger.dev).
package com.sibsBookStore.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<RxJava2CallAdapterFactory> rxJava2CallAdapterFactoryProvider;

  private final Provider<String> baseUrlProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<MoshiConverterFactory> moshiConverterFactoryProvider;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module,
      Provider<RxJava2CallAdapterFactory> rxJava2CallAdapterFactoryProvider,
      Provider<String> baseUrlProvider, Provider<OkHttpClient> okHttpClientProvider,
      Provider<MoshiConverterFactory> moshiConverterFactoryProvider) {
    this.module = module;
    this.rxJava2CallAdapterFactoryProvider = rxJava2CallAdapterFactoryProvider;
    this.baseUrlProvider = baseUrlProvider;
    this.okHttpClientProvider = okHttpClientProvider;
    this.moshiConverterFactoryProvider = moshiConverterFactoryProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, rxJava2CallAdapterFactoryProvider.get(), baseUrlProvider.get(), okHttpClientProvider.get(), moshiConverterFactoryProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(NetworkModule module,
      Provider<RxJava2CallAdapterFactory> rxJava2CallAdapterFactoryProvider,
      Provider<String> baseUrlProvider, Provider<OkHttpClient> okHttpClientProvider,
      Provider<MoshiConverterFactory> moshiConverterFactoryProvider) {
    return new NetworkModule_ProvideRetrofitFactory(module, rxJava2CallAdapterFactoryProvider, baseUrlProvider, okHttpClientProvider, moshiConverterFactoryProvider);
  }

  public static Retrofit provideRetrofit(NetworkModule instance,
      RxJava2CallAdapterFactory rxJava2CallAdapterFactory, String baseUrl,
      OkHttpClient okHttpClient, MoshiConverterFactory moshiConverterFactory) {
    return Preconditions.checkNotNull(instance.provideRetrofit(rxJava2CallAdapterFactory, baseUrl, okHttpClient, moshiConverterFactory), "Cannot return null from a non-@Nullable @Provides method");
  }
}
