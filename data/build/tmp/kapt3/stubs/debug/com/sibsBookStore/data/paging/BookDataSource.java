package com.sibsBookStore.data.paging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/sibsBookStore/data/paging/BookDataSource;", "Landroidx/paging/rxjava2/RxPagingSource;", "", "Lcom/sibsBookStore/domain/entity/BookEntity;", "bookListRepository", "Lcom/sibsBookStore/data/repository/BookListRepository;", "(Lcom/sibsBookStore/data/repository/BookListRepository;)V", "getBookListRepository", "()Lcom/sibsBookStore/data/repository/BookListRepository;", "loadSingle", "Lio/reactivex/Single;", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "toLoadResult", "data", "Lcom/sibsBookStore/domain/entity/BookListEntity;", "position", "data_debug"})
public final class BookDataSource extends androidx.paging.rxjava2.RxPagingSource<java.lang.Integer, com.sibsBookStore.domain.entity.BookEntity> {
    @org.jetbrains.annotations.NotNull()
    private final com.sibsBookStore.data.repository.BookListRepository bookListRepository = null;
    
    public BookDataSource(@org.jetbrains.annotations.NotNull()
    com.sibsBookStore.data.repository.BookListRepository bookListRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sibsBookStore.data.repository.BookListRepository getBookListRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.sibsBookStore.domain.entity.BookEntity>> loadSingle(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params) {
        return null;
    }
    
    private final androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.sibsBookStore.domain.entity.BookEntity> toLoadResult(com.sibsBookStore.domain.entity.BookListEntity data, int position) {
        return null;
    }
}