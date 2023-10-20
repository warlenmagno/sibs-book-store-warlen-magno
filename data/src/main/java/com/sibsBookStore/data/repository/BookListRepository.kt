package com.sibsBookStore.data.repository

import com.sibsBookStore.data.remote.GetBookListRemoteDataSource
import com.sibsBookStore.data.remote.model.BookResponse
import io.reactivex.Single

class BookListRepository(private val getBookListRemoteDataSource: GetBookListRemoteDataSource) {


    fun searchBooks(page: Int): Single<BookResponse> {
        return getBookListRemoteDataSource.searchBooks(page)
    }

    fun getBookDetail(bookId: String) : Single<BookResponse> {
        return getBookListRemoteDataSource.getBookDetails(bookId)
    }
}