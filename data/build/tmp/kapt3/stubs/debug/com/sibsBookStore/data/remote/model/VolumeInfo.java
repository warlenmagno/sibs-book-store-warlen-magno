package com.sibsBookStore.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bT\b\u0086\b\u0018\u00002\u00020\u0001B\u00f1\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010S\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J\u00fa\u0001\u0010d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010eJ\u0013\u0010f\u001a\u00020\u00132\b\u0010g\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010h\u001a\u00020\u000bH\u00d6\u0001J\t\u0010i\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010+\"\u0004\b;\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010+\"\u0004\b=\u0010-R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010+\"\u0004\bD\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010+\"\u0004\bF\u0010-R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010+\"\u0004\bH\u0010-R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010+\"\u0004\bJ\u0010-R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bK\u0010?\"\u0004\bL\u0010AR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010+\"\u0004\bN\u0010-R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010+\"\u0004\bP\u0010-\u00a8\u0006j"}, d2 = {"Lcom/sibsBookStore/data/remote/model/VolumeInfo;", "", "title", "", "subtitle", "authors", "", "publisher", "publishedDate", "description", "pageCount", "", "printType", "categories", "averageRating", "", "ratingsCount", "maturityRating", "allowAnonLogging", "", "contentVersion", "imageLinks", "Lcom/sibsBookStore/data/remote/model/ImageLinks;", "language", "previewLink", "infoLink", "canonicalVolumeLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/sibsBookStore/data/remote/model/ImageLinks;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAllowAnonLogging", "()Ljava/lang/Boolean;", "setAllowAnonLogging", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAuthors", "()Ljava/util/List;", "setAuthors", "(Ljava/util/List;)V", "getAverageRating", "()Ljava/lang/Double;", "setAverageRating", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCanonicalVolumeLink", "()Ljava/lang/String;", "setCanonicalVolumeLink", "(Ljava/lang/String;)V", "getCategories", "setCategories", "getContentVersion", "setContentVersion", "getDescription", "setDescription", "getImageLinks", "()Lcom/sibsBookStore/data/remote/model/ImageLinks;", "setImageLinks", "(Lcom/sibsBookStore/data/remote/model/ImageLinks;)V", "getInfoLink", "setInfoLink", "getLanguage", "setLanguage", "getMaturityRating", "setMaturityRating", "getPageCount", "()Ljava/lang/Integer;", "setPageCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPreviewLink", "setPreviewLink", "getPrintType", "setPrintType", "getPublishedDate", "setPublishedDate", "getPublisher", "setPublisher", "getRatingsCount", "setRatingsCount", "getSubtitle", "setSubtitle", "getTitle", "setTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/sibsBookStore/data/remote/model/ImageLinks;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sibsBookStore/data/remote/model/VolumeInfo;", "equals", "other", "hashCode", "toString", "data_debug"})
public final class VolumeInfo {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subtitle;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> authors;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String publisher;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String publishedDate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer pageCount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String printType;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> categories;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double averageRating;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer ratingsCount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String maturityRating;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean allowAnonLogging;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String contentVersion;
    @org.jetbrains.annotations.Nullable()
    private com.sibsBookStore.data.remote.model.ImageLinks imageLinks;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String language;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String previewLink;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String infoLink;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String canonicalVolumeLink;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sibsBookStore.data.remote.model.VolumeInfo copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subtitle")
    java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "authors")
    java.util.List<java.lang.String> authors, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "publisher")
    java.lang.String publisher, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "publishedDate")
    java.lang.String publishedDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pageCount")
    java.lang.Integer pageCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "printType")
    java.lang.String printType, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "categories")
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "averageRating")
    java.lang.Double averageRating, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ratingsCount")
    java.lang.Integer ratingsCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "maturityRating")
    java.lang.String maturityRating, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "allowAnonLogging")
    java.lang.Boolean allowAnonLogging, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "contentVersion")
    java.lang.String contentVersion, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "imageLinks")
    com.sibsBookStore.data.remote.model.ImageLinks imageLinks, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "language")
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "previewLink")
    java.lang.String previewLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "infoLink")
    java.lang.String infoLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "canonicalVolumeLink")
    java.lang.String canonicalVolumeLink) {
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
    
    public VolumeInfo() {
        super();
    }
    
    public VolumeInfo(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subtitle")
    java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "authors")
    java.util.List<java.lang.String> authors, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "publisher")
    java.lang.String publisher, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "publishedDate")
    java.lang.String publishedDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pageCount")
    java.lang.Integer pageCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "printType")
    java.lang.String printType, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "categories")
    java.util.List<java.lang.String> categories, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "averageRating")
    java.lang.Double averageRating, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "ratingsCount")
    java.lang.Integer ratingsCount, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "maturityRating")
    java.lang.String maturityRating, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "allowAnonLogging")
    java.lang.Boolean allowAnonLogging, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "contentVersion")
    java.lang.String contentVersion, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "imageLinks")
    com.sibsBookStore.data.remote.model.ImageLinks imageLinks, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "language")
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "previewLink")
    java.lang.String previewLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "infoLink")
    java.lang.String infoLink, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "canonicalVolumeLink")
    java.lang.String canonicalVolumeLink) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubtitle() {
        return null;
    }
    
    public final void setSubtitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAuthors() {
        return null;
    }
    
    public final void setAuthors(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPublisher() {
        return null;
    }
    
    public final void setPublisher(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPublishedDate() {
        return null;
    }
    
    public final void setPublishedDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPageCount() {
        return null;
    }
    
    public final void setPageCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrintType() {
        return null;
    }
    
    public final void setPrintType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAverageRating() {
        return null;
    }
    
    public final void setAverageRating(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingsCount() {
        return null;
    }
    
    public final void setRatingsCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMaturityRating() {
        return null;
    }
    
    public final void setMaturityRating(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAllowAnonLogging() {
        return null;
    }
    
    public final void setAllowAnonLogging(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContentVersion() {
        return null;
    }
    
    public final void setContentVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sibsBookStore.data.remote.model.ImageLinks component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sibsBookStore.data.remote.model.ImageLinks getImageLinks() {
        return null;
    }
    
    public final void setImageLinks(@org.jetbrains.annotations.Nullable()
    com.sibsBookStore.data.remote.model.ImageLinks p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPreviewLink() {
        return null;
    }
    
    public final void setPreviewLink(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInfoLink() {
        return null;
    }
    
    public final void setInfoLink(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCanonicalVolumeLink() {
        return null;
    }
    
    public final void setCanonicalVolumeLink(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}