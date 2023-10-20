package com.sibsBookStore.warlenMagnoApp.di.module

import com.sibsBookStore.domain.SchedulerProvider
import com.sibsBookStore.domain.gateway.BookListGateWay
import com.sibsBookStore.domain.usecase.GetBookListUseCase
import dagger.Module
import dagger.Provides

@Module
 class DomainModule {

    @Provides
    fun provideGetBookListUseCase(schedulerProvider: SchedulerProvider, bookGateWay: BookListGateWay)
            = GetBookListUseCase(schedulerProvider, bookGateWay)
}