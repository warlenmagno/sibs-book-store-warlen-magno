package com.sibsBookStore.data.remote.api

import com.sibsBookStore.data.remote.model.BookResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BookService {

    @GET("volumes?q=ios")
    fun searchBooks(
        @Query("maxResults") maxResults: Int,
        @Query("startIndex") startIndex: Int = 0
    ): Single<BookResponse>

    @GET("volumes/{book_id}")
    fun getBookDetails(@Path("book_id") bookId: String) : Single<BookResponse>
}