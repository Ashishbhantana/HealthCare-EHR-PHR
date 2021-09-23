package com.anangkur.mediku.data.remote.model.news

import com.google.gson.annotations.SerializedName

data class GetNewsResponse(
    @SerializedName("status")
    val status: String = "",
    @SerializedName("totalResults")
    val totalResults: Int = 0,
    @SerializedName("articles")
    val articles: List<ArticleRemoteModel> = listOf()
)