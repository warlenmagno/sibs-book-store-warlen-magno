package com.sibsBookStore.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/sibsBookStore/data/remote/GetBookListRemoteDataSource;", "", "bookService", "Lcom/sibsBookStore/data/remote/api/BookService;", "(Lcom/sibsBookStore/data/remote/api/BookService;)V", "getBookDetails", "Lio/reactivex/Single;", "Lcom/sibsBookStore/data/remote/model/BookResponse;", "bookId", "", "searchBooks", "page", "", "data_debug"})
public final class GetBookListRemoteDataSource {
    private final com.sibsBookStore.data.remote.api.BookService bookService = null;
    
    public GetBookListRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.sibsBookStore.data.remote.api.BookService bookService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.sibsBookStore.data.remote.model.BookResponse> searchBooks(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.sibsBookStore.data.remote.model.BookResponse> getBookDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String bookId) {
        return null;
    }
}