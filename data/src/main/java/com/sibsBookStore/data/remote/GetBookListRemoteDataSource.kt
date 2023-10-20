package com.sibsBookStore.data.remote

import com.sibsBookStore.data.remote.api.BookService
import com.sibsBookStore.data.remote.model.BookResponse
import io.reactivex.Single

class GetBookListRemoteDataSource (private val bookService: BookService) {

    fun searchBooks(page: Int) : Single<BookResponse>
    = bookService.searchBooks(20, page)

    fun getBookDetails(bookId: String): Single<BookResponse>
    = bookService.getBookDetails(bookId)
}