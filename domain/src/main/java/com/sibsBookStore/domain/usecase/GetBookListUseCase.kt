package com.sibsBookStore.domain.usecase

import androidx.paging.PagingData
import com.sibsBookStore.domain.FlowableUseCase
import com.sibsBookStore.domain.SchedulerProvider
import com.sibsBookStore.domain.entity.BookEntity
import com.sibsBookStore.domain.gateway.BookListGateWay
import io.reactivex.Flowable

class GetBookListUseCase(schedulers: SchedulerProvider,
                         private val getBookListGateWay: BookListGateWay)
    : FlowableUseCase<Boolean, PagingData<BookEntity>>(schedulers){


    override fun buildUseCaseObservable(refresh: Boolean): Flowable<PagingData<BookEntity>> {

        return getBookListGateWay.getBookList(refresh)
    }
}