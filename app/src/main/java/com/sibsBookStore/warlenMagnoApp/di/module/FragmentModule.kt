package com.sibsBookStore.warlenMagnoApp.di.module

import com.sibsBookStore.warlenMagnoApp.ui.detail.BookDetailFragment
import com.sibsBookStore.warlenMagnoApp.ui.list.BookListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun bookListFragment() : BookListFragment

    @ContributesAndroidInjector
    abstract fun bookDetailFragment(): BookDetailFragment
}