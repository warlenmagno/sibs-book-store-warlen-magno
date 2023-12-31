package com.sibsBookStore.domain.utils

import com.sibsBookStore.domain.SchedulerProvider
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

class TestSchedulers : SchedulerProvider{

    override val observeOn: Scheduler
        get() = Schedulers.trampoline()

    override val subscribeOn: Scheduler
        get() = Schedulers.trampoline()

    override val newThread: Scheduler
        get() = Schedulers.trampoline()
}