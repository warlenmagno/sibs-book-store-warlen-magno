// Generated by Dagger (https://dagger.dev).
package com.sibsBookStore.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_GetUrlFactory implements Factory<String> {
  private final NetworkModule module;

  public NetworkModule_GetUrlFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return getUrl(module);
  }

  public static NetworkModule_GetUrlFactory create(NetworkModule module) {
    return new NetworkModule_GetUrlFactory(module);
  }

  public static String getUrl(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.getUrl(), "Cannot return null from a non-@Nullable @Provides method");
  }
}