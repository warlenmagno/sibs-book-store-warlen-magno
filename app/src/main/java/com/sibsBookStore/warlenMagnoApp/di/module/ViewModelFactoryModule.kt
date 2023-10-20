package com.sibsBookStore.warlenMagnoApp.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sibsBookStore.warlenMagnoApp.ui.detail.BookDetailViewModel
import com.sibsBookStore.warlenMagnoApp.ui.list.BookListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(BookListViewModel::class)
    abstract fun provideBookListViewModel(viewModel: BookListViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(BookDetailViewModel::class)
    abstract fun provideBookDetailViewModel(viewModel: BookDetailViewModel) : ViewModel
}