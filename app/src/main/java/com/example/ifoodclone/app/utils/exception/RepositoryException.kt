package com.example.ifoodclone.app.utils.exception

open class RepositoryException(message: String? = null, cause: Throwable? = null) :
    Exception(message ?: cause?.message, cause)