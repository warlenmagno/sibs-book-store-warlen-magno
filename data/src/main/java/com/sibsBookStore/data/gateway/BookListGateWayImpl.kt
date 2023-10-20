package com.sibsBookStore.data.gateway

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.rxjava2.flowable
import com.sibsBookStore.data.paging.BookDataSource

import com.sibsBookStore.data.repository.BookListRepository
import com.sibsBookStore.domain.entity.BookEntity
import com.sibsBookStore.domain.gateway.BookListGateWay
import io.reactivex.Flowable

class BookListGateWayImpl (private val bookListRepository: BookListRepository): BookListGateWay {


    override fun getBookList(refresh: Boolean?): Flowable<PagingData<BookEntity>> {
        val pager =  Pager(
            config = PagingConfig(
                pageSize = 10,
                enablePlaceholders = true,
                maxSize = 30,
                prefetchDistance = 5,
                initialLoadSize = 20)){
             BookDataSource(bookListRepository)
        }.flowable

      return pager

    }

}