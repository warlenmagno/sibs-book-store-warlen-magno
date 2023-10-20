package com.sibsBookStore.warlenMagnoApp.di.module

import com.sibsBookStore.data.gateway.BookListGateWayImpl
import com.sibsBookStore.data.remote.GetBookListRemoteDataSource
import com.sibsBookStore.data.remote.api.BookService
import com.sibsBookStore.data.repository.BookListRepository
import com.sibsBookStore.domain.gateway.BookListGateWay
import dagger.Module
import dagger.Provides


@Module
class DataModule {

    @Provides
    fun provideBookListRemoteDataSource(bookService: BookService)
            = GetBookListRemoteDataSource(bookService)

    @Provides
    fun provideBookRepository(bookRemoteDataSource: GetBookListRemoteDataSource)
            = BookListRepository(bookRemoteDataSource)

    @Provides
    fun provideBookGateWay(bookListRepository: BookListRepository): BookListGateWay
            = BookListGateWayImpl(bookListRepository)

}