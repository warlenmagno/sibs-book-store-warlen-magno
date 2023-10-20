package com.sibsBookStore.data.gateway;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/sibsBookStore/data/gateway/BookListGateWayImpl;", "Lcom/sibsBookStore/domain/gateway/BookListGateWay;", "bookListRepository", "Lcom/sibsBookStore/data/repository/BookListRepository;", "(Lcom/sibsBookStore/data/repository/BookListRepository;)V", "getBookList", "Lio/reactivex/Flowable;", "Landroidx/paging/PagingData;", "Lcom/sibsBookStore/domain/entity/BookEntity;", "refresh", "", "(Ljava/lang/Boolean;)Lio/reactivex/Flowable;", "data_debug"})
public final class BookListGateWayImpl implements com.sibsBookStore.domain.gateway.BookListGateWay {
    private final com.sibsBookStore.data.repository.BookListRepository bookListRepository = null;
    
    public BookListGateWayImpl(@org.jetbrains.annotations.NotNull()
    com.sibsBookStore.data.repository.BookListRepository bookListRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<androidx.paging.PagingData<com.sibsBookStore.domain.entity.BookEntity>> getBookList(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean refresh) {
        return null;
    }
}