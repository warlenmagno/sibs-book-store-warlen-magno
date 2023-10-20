package com.sibsBookStore.data.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0015\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006J\u0015\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a8\u0006\r"}, d2 = {"Lcom/sibsBookStore/data/util/BaseMapper;", "T", "K", "", "()V", "toList", "", "source", "transformFrom", "(Ljava/lang/Object;)Ljava/lang/Object;", "transformFromList", "transformTo", "transformToList", "data_debug"})
public abstract class BaseMapper<T extends java.lang.Object, K extends java.lang.Object> {
    
    public BaseMapper() {
        super();
    }
    
    public abstract T transformFrom(K source);
    
    public abstract K transformTo(T source);
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> transformFromList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends K> source) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<K> transformToList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> source) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<K> toList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> source) {
        return null;
    }
}