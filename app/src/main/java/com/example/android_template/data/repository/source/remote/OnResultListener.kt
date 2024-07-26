package com.example.android_template.data.repository.source.remote

import java.lang.Exception

interface OnResultListener<T> {
    fun onSuccess(data: T)
    fun onError(exception: Exception?)
}
