package com.sibsBookStore.warlenMagnoApp.di.module

import android.app.Application
import android.content.Context
import com.sibsBookStore.domain.SchedulerProvider
import com.sibsBookStore.warlenMagnoApp.di.module.scheduler.AppSchedulers
import com.sibsBookStore.warlenMagnoApp.ui.list.adapter.BookListAdapter
import com.sibsBookStore.warlenMagnoApp.util.IResourceProvider
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    @Named("application.Context")
    fun provideContext(application: Application) : Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun provideSchedulers() : SchedulerProvider = AppSchedulers()

    @Provides
    @Singleton
    fun provideResource(context: Context) = IResourceProvider(context)


    @Provides
    @Singleton
    fun provideBookAdapter() = BookListAdapter()
}