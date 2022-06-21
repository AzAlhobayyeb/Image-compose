package com.example.firstbootcampapp.common

sealed class Response<T>(
    val data: T? = null,
    val msg: String? = null
) {
    class Success<T>(data: T) : Response<T>(data)
    class Error<T>(msg: String, data: T?  = null) : Response<T>(data, msg)
    class Loading<T>(msg: String? = null, data: T?  = null) : Response<T>(data, msg)
}
