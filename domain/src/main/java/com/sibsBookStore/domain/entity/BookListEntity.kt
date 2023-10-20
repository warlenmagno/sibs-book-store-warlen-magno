package com.sibsBookStore.domain.entity


data class BookListEntity(
    var page: Int? = null,
    var totalResults: Int? = null,
    var totalPages: Int? = null,
    val bookList: List<BookEntity> = emptyList()
)

