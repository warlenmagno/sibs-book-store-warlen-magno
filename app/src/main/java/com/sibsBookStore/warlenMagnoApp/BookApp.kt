package com.sibsBookStore.warlenMagnoApp

import android.app.Application
import com.github.ajalt.timberkt.Timber
import com.sibsBookStore.warlenMagnoApp.di.component.AppComponent
import com.sibsBookStore.warlenMagnoApp.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class BookApp : Application(), HasAndroidInjector {


    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = activityDispatchingAndroidInjector

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        component = DaggerAppComponent
            .builder()
            .application(this)
            .context(this)
            .build()
        component.inject(this)
    }

}