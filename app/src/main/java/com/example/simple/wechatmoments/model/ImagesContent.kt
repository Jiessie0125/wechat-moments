package com.example.simple.wechatmoments.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by jiessie on 2020/9/5.
 */
data class ImagesContent(
        @SerializedName("url") val url : String
): Serializable