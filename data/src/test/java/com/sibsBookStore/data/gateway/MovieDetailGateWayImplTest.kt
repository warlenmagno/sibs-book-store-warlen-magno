package com.sibsBookStore.data.gateway

import com.sibsBookStore.data.repository.BookListRepository
//import com.sibsBookStore.data.utils.TestData
//import com.sibsBookStore.domain.gateway.MovieDetailGateWay
import io.reactivex.Single
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieDetailGateWayImplTest {

    @Mock
    private lateinit var bookListRepository: BookListRepository
//    private lateinit var movieDetailGateWay: MovieDetailGateWay
    val movieId = 100

    @Before
    fun setup() {
//        movieDetailGateWay = MovieDetailGateWayImpl(bookListRepository)
    }

    @Test
    fun `Given movie detail data,when get movie detail response,Should fetch data from repository and then parse to domain`() {
        //Given
//        val domainData = TestData.getTestMovieDetail(movieId)
//        val repositoryData = TestData.getMovieDetailResponse()
//        Mockito.`when`(bookListRepository.getMovieDetail(movieId))
//            .thenReturn(Single.just(repositoryData))

        //when
//        val testObserver = movieDetailGateWay.getMovieDetail(movieId).test().await()

        //then
//        testObserver.assertComplete()
//            .assertNoErrors()
//            .assertValue(domainData)
    }
}