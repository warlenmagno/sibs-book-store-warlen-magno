package com.sibsBookStore.warlenMagnoApp.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sibsBookStore.warlenMagnoApp.base.BaseViewModel
import com.sibsBookStore.warlenMagnoApp.model.Book
import javax.inject.Inject

class BookDetailViewModel @Inject constructor(): BaseViewModel() {

    val bookId = MutableLiveData("")
    private var _movieDetail = MutableLiveData<BookDetailModel>()
    val movieDetail: LiveData<BookDetailModel> = _movieDetail

    fun bookDetail(book: Book) {
        _loading.postValue(true)
        _movieDetail.postValue(
            BookDetailModel(
                posterPath = book.posterPath,
                title = book.title,
                author = book.author,
                voteAverage = book.voteAverage,
                overview = book.overview
            )
        )
    }
}