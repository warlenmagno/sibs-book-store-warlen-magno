package com.sibsBookStore.data.mapper

import com.sibsBookStore.data.utils.TestData
import com.nhaarman.mockito_kotlin.eq
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class BookDetailMapperTest {

    @Test
    fun `data model with full data maps to MovieDetailDomainModel`() {
        //given
        val dataResponse = TestData.getBookDetail()
        val domainModel = TestData.getTestBookDetail()

        //when
        val result = BookListToDomainMapper.transformFrom(dataResponse)

        //Then
        assertEquals(result.bookList[0].id, domainModel.bookList[0].id)
    }

    //TODO same like for other classes


}