package com.example.ifoodclone.app.utils.exception

open class CacheException(message: String? = null, cause: Throwable? = null) :
    Exception(message ?: cause?.message, cause)