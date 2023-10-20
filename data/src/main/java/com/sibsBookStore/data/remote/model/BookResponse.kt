package com.sibsBookStore.data.remote.model

import com.squareup.moshi.Json

data class BookResponse(
    @Json(name = "totalItems" ) val totalItems: Int = 0,
    @Json(name = "items") val items: List<BookItem>
)


data class BookItem(
    @Json(name = "id") val id: String,
    @Json(name = "volumeInfo") val volumeInfo: VolumeInfo?,
    @Json(name = "saleInfo") val saleInfo: SaleInfo?
)


data class VolumeInfo(
    @Json(name = "title") var title: String? = null,
    @Json(name = "subtitle") var subtitle: String? = null,
    @Json(name = "authors") var authors: List<String> = listOf(),
    @Json(name = "publisher") var publisher: String? = null,
    @Json(name = "publishedDate") var publishedDate: String? = null,
    @Json(name = "description") var description: String? = null,
    @Json(name = "pageCount") var pageCount: Int? = null,
    @Json(name = "printType") var printType: String? = null,
    @Json(name = "categories") var categories: List<String> = listOf(),
    @Json(name = "averageRating") var averageRating: Double? = null,
    @Json(name = "ratingsCount") var ratingsCount: Int? = null,
    @Json(name = "maturityRating") var maturityRating: String?= null,
    @Json(name = "allowAnonLogging") var allowAnonLogging: Boolean? = null,
    @Json(name = "contentVersion") var contentVersion: String? = null,
    @Json(name = "imageLinks") var imageLinks: ImageLinks? = ImageLinks(),
    @Json(name = "language") var language: String? = null,
    @Json(name = "previewLink") var previewLink: String? = null,
    @Json(name = "infoLink") var infoLink: String? = null,
    @Json(name = "canonicalVolumeLink") var canonicalVolumeLink : String? = null
)

data class SaleInfo (
    @Json(name = "country") var country: String? = null,
    @Json(name = "saleability") var saleability: String? = null,
    @Json(name = "isEbook") var isEbook: Boolean? = null,
    @Json(name = "buyLink") val buyLink: String? = null
)

data class ImageLinks (
    @Json(name = "smallThumbnail") val smallThumbnail: String? = null,
    @Json(name = "thumbnail") val thumbnail: String? = null
)