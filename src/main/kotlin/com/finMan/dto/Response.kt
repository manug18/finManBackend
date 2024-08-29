package com.finMan.dto

data class Response<T>(
    val message: String,
    val data: T? = null,
    val error: Boolean? = false
)