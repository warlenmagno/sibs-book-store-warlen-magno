package com.sibsBookStore.data.remote

import com.google.gson.Gson
import com.sibsBookStore.data.jni.SibsAPI
import com.sibsBookStore.data.remote.api.BookService
import com.sibsBookStore.data.remote.model.BookResponse
import io.reactivex.Single

class GetBookListRemoteDataSource (private val bookService: BookService) {
    fun searchBooks(page: Int) : Single<BookResponse> {
        return Single.create {
            val result = SibsAPI.searchBooks(page)
            val obj = Gson().fromJson(result, BookResponse::class.java)
            it.onSuccess(obj)
        }
    }

    fun getBookDetails(bookId: String): Single<BookResponse>
    = bookService.getBookDetails(bookId)
}