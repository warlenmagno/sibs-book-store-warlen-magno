package com.sibsBookStore.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/sibsBookStore/data/remote/model/BookItem;", "", "id", "", "volumeInfo", "Lcom/sibsBookStore/data/remote/model/VolumeInfo;", "saleInfo", "Lcom/sibsBookStore/data/remote/model/SaleInfo;", "(Ljava/lang/String;Lcom/sibsBookStore/data/remote/model/VolumeInfo;Lcom/sibsBookStore/data/remote/model/SaleInfo;)V", "getId", "()Ljava/lang/String;", "getSaleInfo", "()Lcom/sibsBookStore/data/remote/model/SaleInfo;", "getVolumeInfo", "()Lcom/sibsBookStore/data/remote/model/VolumeInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_debug"})
public final class BookItem {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final com.sibsBookStore.data.remote.model.VolumeInfo volumeInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final com.sibsBookStore.data.remote.model.SaleInfo saleInfo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sibsBookStore.data.remote.model.BookItem copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "volumeInfo")
    com.sibsBookStore.data.remote.model.VolumeInfo volumeInfo, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "saleInfo")
    com.sibsBookStore.data.remote.model.SaleInfo saleInfo) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public BookItem(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "volumeInfo")
    com.sibsBookStore.data.remote.model.VolumeInfo volumeInfo, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "saleInfo")
    com.sibsBookStore.data.remote.model.SaleInfo saleInfo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sibsBookStore.data.remote.model.VolumeInfo component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sibsBookStore.data.remote.model.VolumeInfo getVolumeInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sibsBookStore.data.remote.model.SaleInfo component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sibsBookStore.data.remote.model.SaleInfo getSaleInfo() {
        return null;
    }
}