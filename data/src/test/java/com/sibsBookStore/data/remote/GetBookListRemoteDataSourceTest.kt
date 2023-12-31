package com.sibsBookStore.data.remote

import com.sibsBookStore.data.remote.api.BookService
import com.sibsBookStore.data.utils.TestData
import io.reactivex.Single
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetBookListRemoteDataSourceTest{

    @Mock
    private lateinit var bookService: BookService
    private lateinit var remoteDataSource: GetBookListRemoteDataSource
    val bookId = "100"

    @Before
    fun setup(){
        remoteDataSource = GetBookListRemoteDataSource(bookService)
    }

    @Test
    fun `get book detail and check the id value that it matches the response value`(){
        //Given
        val result = Single.just(TestData.getBookDetailResponse())
        //when
        Mockito.`when`(remoteDataSource.getBookDetails(bookId)).thenReturn(result)

        val response = bookService.getBookDetails(bookId)
        //should
         assertNotNull(response)
         assertEquals(result.blockingGet(),response.blockingGet())
       //also check the size of the list will be 1
        assertEquals("100", response.blockingGet().items[0].id)
    }


}