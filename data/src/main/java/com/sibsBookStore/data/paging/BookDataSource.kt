package com.sibsBookStore.data.paging

import androidx.paging.rxjava2.RxPagingSource
import com.sibsBookStore.data.mapper.BookListToDomainMapper
import com.sibsBookStore.data.repository.BookListRepository
import com.sibsBookStore.domain.entity.BookEntity
import com.sibsBookStore.domain.entity.BookListEntity
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import retrofit2.HttpException
import java.io.IOException
import java.io.InvalidObjectException

class BookDataSource (val bookListRepository: BookListRepository): RxPagingSource<Int, BookEntity>()  {

    override fun loadSingle(params: LoadParams<Int>): Single<LoadResult<Int, BookEntity>> {
        val page = params.key ?: 1
        return try {
            val response = bookListRepository.searchBooks(page)
                .subscribeOn(Schedulers.io())
            response.map {
                val mapResponse =  BookListToDomainMapper.transformFrom(it)
                toLoadResult(mapResponse,page)
            }.onErrorReturn {
                LoadResult.Error(it)
            }

        } catch (exception: IOException) {
            Single.just(LoadResult.Error(exception))
        } catch (exception: HttpException) {
            Single.just(LoadResult.Error(exception))
        } catch (exception: InvalidObjectException) {
            Single.just(LoadResult.Error(exception))
        } catch (exception: Exception) {
            Single.just(LoadResult.Error(exception))
        }

    }

    private fun toLoadResult(data: BookListEntity, position: Int): LoadResult<Int, BookEntity> {

        return LoadResult.Page(
            data = data.bookList,
            prevKey = if (position == 1) null else position - 1,
            nextKey = if (position == data.totalPages) null else position + 1
        )
    }


}