package com.sibsBookStore.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J(\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0007J\b\u0010\u0018\u001a\u00020\u0014H\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/sibsBookStore/data/NetworkModule;", "", "()V", "getHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getUrl", "", "provideAudioBookServiceApi", "Lcom/sibsBookStore/data/remote/api/BookService;", "retrofit", "Lretrofit2/Retrofit;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideMoshiConverterFactory", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "moshi", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "rxJava2CallAdapterFactory", "Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "baseUrl", "okHttpClient", "moshiConverterFactory", "provideRxJava2CallAdapter", "data_debug"})
@dagger.Module()
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "retrofitDefault")
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory rxJava2CallAdapterFactory, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.moshi.MoshiConverterFactory moshiConverterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.sibsBookStore.data.remote.api.BookService provideAudioBookServiceApi(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "retrofitDefault")
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor getHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory provideRxJava2CallAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.converter.moshi.MoshiConverterFactory provideMoshiConverterFactory(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.lang.String getUrl() {
        return null;
    }
}