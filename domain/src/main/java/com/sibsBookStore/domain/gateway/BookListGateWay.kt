package com.sibsBookStore.domain.gateway

import androidx.paging.PagingData
import com.sibsBookStore.domain.entity.BookEntity
import io.reactivex.Flowable

interface BookListGateWay {

    fun getBookList(refresh: Boolean? = false): Flowable<PagingData<BookEntity>>
}