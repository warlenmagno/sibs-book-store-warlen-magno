package com.sibsBookStore.warlenMagnoApp.model

import android.os.Parcelable
import com.sibsBookStore.domain.entity.BookEntity
import com.sibsBookStore.domain.entity.BookListEntity
import kotlinx.android.parcel.Parcelize


data class BookListModel(
    val bookList: List<Book>? = emptyList()
)

@Parcelize
data class Book(
    var id: String,
    var voteAverage: Double? = null,
    var title: String? = null,
    var author: String? = null,
    var buyPath: String? = null,
    var overview: String? = null,
    var posterPath: String? = null
): Parcelable

fun BookEntity.mapToPresentation(): Book
        = Book(id, voteAverage, title, author, buyPath, overview, posterPath)

fun List<BookEntity>.mapToPresentation(): List<Book>
        = map { it.mapToPresentation() }

fun BookListEntity.mapToPresentation() : BookListModel
        = BookListModel(bookList = bookList.mapToPresentation())