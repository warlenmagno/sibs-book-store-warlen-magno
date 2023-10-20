package com.sibsBookStore.data.utils

import com.sibsBookStore.data.remote.model.BookItem
import com.sibsBookStore.data.remote.model.BookResponse
import com.sibsBookStore.domain.entity.BookEntity
import com.sibsBookStore.domain.entity.BookListEntity

object TestData {

    internal fun getBookDetailResponse() =
        BookResponse(
            totalItems = 1,
            items = listOf(
                BookItem(
                    id = "100",
                    volumeInfo = null,
                    saleInfo = null
                )
            )
        )

   internal fun getTestBookDetail(): BookListEntity {
        return BookListEntity(
            bookList = listOf(BookEntity(id = "100"))
        )
    }

}
