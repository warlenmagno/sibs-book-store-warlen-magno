package com.sibsBookStore.domain.entity

data class BookEntity(
    var id: String,
    var voteAverage: Double? = null,
    var title: String? = null,
    var author: String? = null,
    var originalTitle: String? = null,
    var genreIds: List<Int>? = null,
    var buyPath: String? = null,
    var adult: Boolean? = null,
    var overview: String? = null,
    var posterPath: String? = null
)