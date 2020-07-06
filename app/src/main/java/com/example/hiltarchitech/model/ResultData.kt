package com.example.hiltarchitech.model

/**
 * Created by Rahul on 01/07/20.
 */
sealed class ResultData<out T> {
    data class success<out T>(val data:T?=null):ResultData<T>()
    data class loading(val nothing: Nothing?=null):ResultData<Nothing>()
    data class Failed(val message:String?=null):ResultData<Nothing>()
    data class Exception(val message: String?=null):ResultData<Nothing>()
}