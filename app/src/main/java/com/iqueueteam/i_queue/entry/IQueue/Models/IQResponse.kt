package com.iqueueteam.i_queue.entry.IQueue.Models

import androidx.annotation.Keep

@Keep
data class IQResponse<T,S>(
    val code: Int,
    val message:String,
    var data:T? = null,
    var errors:S? = null,
    ) {

}