package com.example.simple.wechatmoments.model

import java.io.Serializable
import com.google.gson.annotations.SerializedName

/**
 * Created by jiessie on 2020/9/5.
 */
data class Friend(
        @SerializedName("content") val content : String,
        @SerializedName("images") val images : List<ImagesContent>,
        @SerializedName("sender") val sender : Sender,
        @SerializedName("comments") val comments : List<Comments>
): Serializable