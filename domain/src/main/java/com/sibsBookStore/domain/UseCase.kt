package com.sibsBookStore.domain

import io.reactivex.Flowable

abstract class UseCase<in Params,T> protected constructor(private val schedulers:SchedulerProvider) {

     abstract fun buildUseCaseObservable(params: Params): Flowable<T>

    fun execute(params: Params) : Flowable<T> {
        val observable = this.buildUseCaseObservable(params)
            .subscribeOn(schedulers.subscribeOn)
            .observeOn(schedulers.observeOn)
        return observable
    }

}