package com.sibsBookStore.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/sibsBookStore/data/remote/model/SaleInfo;", "", "country", "", "saleability", "isEbook", "", "buyLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBuyLink", "()Ljava/lang/String;", "getCountry", "setCountry", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setEbook", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSaleability", "setSaleability", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sibsBookStore/data/remote/model/SaleInfo;", "equals", "other", "hashCode", "", "toString", "data_debug"})
public final class SaleInfo {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String country;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String saleability;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isEbook;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String buyLink = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sibsBookStore.data.remote.model.SaleInfo copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country")
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "saleability")
    java.lang.String saleability, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "isEbook")
    java.lang.Boolean isEbook, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "buyLink")
    java.lang.String buyLink) {
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
    
    public SaleInfo() {
        super();
    }
    
    public SaleInfo(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country")
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "saleability")
    java.lang.String saleability, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "isEbook")
    java.lang.Boolean isEbook, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "buyLink")
    java.lang.String buyLink) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSaleability() {
        return null;
    }
    
    public final void setSaleability(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isEbook() {
        return null;
    }
    
    public final void setEbook(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBuyLink() {
        return null;
    }
}