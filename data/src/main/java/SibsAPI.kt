package com.sibsBookStore.data.jni

object SibsAPI {

    private const val SIBS_API_NATIVE_LIB = "sibs-native-lib"

    init {
        System.loadLibrary(SIBS_API_NATIVE_LIB)
    }

    external fun searchBooks(page: Int): String

}