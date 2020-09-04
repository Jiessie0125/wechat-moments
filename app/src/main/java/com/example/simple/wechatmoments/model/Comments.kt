package com.example.simple.wechatmoments.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by jiessie on 2020/9/5.
 */
data class Comments(
        @SerializedName("content") val content : String,
        @SerializedName("sender") val sender : Sender
): Serializable