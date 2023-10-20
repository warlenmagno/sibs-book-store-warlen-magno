package com.sibsBookStore.warlenMagnoApp.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.map
import androidx.paging.rxjava2.cachedIn
import com.github.ajalt.timberkt.Timber
import com.sibsBookStore.domain.usecase.GetBookListUseCase
import com.sibsBookStore.warlenMagnoApp.base.BaseViewModel
import com.sibsBookStore.warlenMagnoApp.model.Book
import com.sibsBookStore.warlenMagnoApp.model.mapToPresentation
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class BookListViewModel @Inject constructor(private val getBookListUseCase: GetBookListUseCase) :
    BaseViewModel() {

    private val _bookList = MutableLiveData<PagingData<Book>>()
    var bookList: LiveData<PagingData<Book>> = _bookList


    fun getBookList(isRefresh: Boolean = true) {
        _loading.postValue(true)
        val result = getBookListUseCase.execute(isRefresh)
            .map { it.map { it.mapToPresentation() } }
            .cachedIn(viewModelScope)
        result.subscribeBy(onNext = {
            _loading.postValue(false)
            _bookList.postValue(it)
            Timber.d { "book list api response $it" }
        }, onError = { e ->
            _loading.postValue(false)
            _error.postValue(e.localizedMessage ?: e.message ?: "Unknown error")
            Timber.e { "error on book list api ${e.printStackTrace()}" }
        }, onComplete = {
            _loading.postValue(false)
        }).addTo(compositeDisposable)
    }

    /**
     * refresh the list
     */
    fun refresh() = getBookList(true)
}