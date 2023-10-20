//package com.sibsBookStore.data.repository
//
//import com.sibsBookStore.data.remote.GetBookListRemoteDataSource
//import com.sibsBookStore.data.utils.TestData
//import io.reactivex.Single
//import org.junit.Assert.*
//import org.junit.Before
//import org.junit.Test
//import org.junit.runner.RunWith
//import org.mockito.Mock
//import org.mockito.Mockito
//import org.mockito.junit.MockitoJUnitRunner
//
//@Suppress("IllegalIdentifier")
//@RunWith(MockitoJUnitRunner::class)
//class BookListRepositoryTest{
//
//    @Mock
//    private lateinit var remoteDataSource: GetBookListRemoteDataSource
//    private lateinit var bookListRepository: BookListRepository
//    val movieId =100
//    @Before
//    fun setup(){
//        bookListRepository = BookListRepository(remoteDataSource)
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun `get detail of the movie response success will return the details`(){
//
//        //Given
////        Mockito.`when`(remoteDataSource.getMovieDetail(movieId)).thenReturn(Single.just(TestData.getMovieDetailResponse()))
////
////        //When
////        val testObserver = bookListRepository.getMovieDetail(movieId).test().await()
////
////        //should
////        testObserver.assertComplete()
////            .assertNoErrors()
////            .assertValue(TestData.getMovieDetailResponse())
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun `getMovieDetail returns null if response is null`(){
//
//        //Given
//        val response =TestData.getMovieDetailResponse()
////        Mockito.`when`(remoteDataSource.getMovieDetail(movieId)).thenReturn(null)
////
////        //when
////        val testObserver = bookListRepository.getMovieDetail(movieId)
////
////        //should
////       assertEquals(testObserver,null)
//    }
//}