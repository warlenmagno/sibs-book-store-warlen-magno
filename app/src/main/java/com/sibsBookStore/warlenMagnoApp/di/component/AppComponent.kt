package com.sibsBookStore.warlenMagnoApp.di.component

import android.app.Application
import android.content.Context
import com.sibsBookStore.data.NetworkModule
import com.sibsBookStore.warlenMagnoApp.BookApp
import com.sibsBookStore.warlenMagnoApp.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
    AppModule::class,
    AndroidInjectionModule::class,
    ViewModelFactoryModule::class,
    FragmentModule::class,
    NetworkModule::class,
    DomainModule::class,
    DataModule::class
))
interface AppComponent {

    fun inject( application : BookApp)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application : Application): Builder

        @BindsInstance
        fun context(context: Context) : Builder

        fun build(): AppComponent
    }
}