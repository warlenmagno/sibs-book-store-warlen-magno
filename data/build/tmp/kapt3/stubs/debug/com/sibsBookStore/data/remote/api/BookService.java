package com.sibsBookStore.data.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\tH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/sibsBookStore/data/remote/api/BookService;", "", "getBookDetails", "Lio/reactivex/Single;", "Lcom/sibsBookStore/data/remote/model/BookResponse;", "bookId", "", "searchBooks", "maxResults", "", "startIndex", "data_debug"})
public abstract interface BookService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "volumes?q=ios")
    public abstract io.reactivex.Single<com.sibsBookStore.data.remote.model.BookResponse> searchBooks(@retrofit2.http.Query(value = "maxResults")
    int maxResults, @retrofit2.http.Query(value = "startIndex")
    int startIndex);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "volumes/{book_id}")
    public abstract io.reactivex.Single<com.sibsBookStore.data.remote.model.BookResponse> getBookDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "book_id")
    java.lang.String bookId);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}