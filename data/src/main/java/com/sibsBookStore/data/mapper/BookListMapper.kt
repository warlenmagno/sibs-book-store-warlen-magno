package com.sibsBookStore.data.mapper

import com.sibsBookStore.data.remote.model.BookItem
import com.sibsBookStore.data.remote.model.BookResponse
import com.sibsBookStore.data.remote.model.ImageLinks
import com.sibsBookStore.data.remote.model.SaleInfo
import com.sibsBookStore.data.remote.model.VolumeInfo
import com.sibsBookStore.data.util.BaseMapper
import com.sibsBookStore.domain.entity.BookEntity
import com.sibsBookStore.domain.entity.BookListEntity

object BookListToDomainMapper: BaseMapper<BookListEntity, BookResponse>() {

    override fun transformFrom(source: BookResponse): BookListEntity {

        return BookListEntity(bookList = BookModelToDomainMapper.transformToList(source.items))
    }
    override fun transformTo(source: BookListEntity): BookResponse
            = BookResponse(items = source.bookList.let {
        BookModelToDomainMapper.transformFromList(it)
    })
}

object BookModelToDomainMapper: BaseMapper<BookItem, BookEntity>() {

    override fun transformFrom(source: BookEntity): BookItem
    = BookItem(
        id = source.id,
        volumeInfo = VolumeInfo(
            title = source.title.orEmpty(),
            description = source.overview.orEmpty(),
            authors = source.author?.split(",")?.map { it.trim() } ?: listOf(),
            imageLinks = ImageLinks(
                smallThumbnail = source.posterPath,
                thumbnail = source.posterPath
            )
        ),
        saleInfo = SaleInfo(
            buyLink = source.posterPath
        )
    )

    override fun transformTo(source: BookItem): BookEntity
    = BookEntity(
        id = source.id,
        title = source.volumeInfo?.title,
        posterPath = source.volumeInfo?.imageLinks?.thumbnail,
        overview = source.volumeInfo?.description,
        author = source.volumeInfo?.authors.toString()
            .removePrefix("[")
            .removeSuffix("]"),
        buyPath = source.saleInfo?.buyLink,
        voteAverage = source.volumeInfo?.averageRating
    )
}