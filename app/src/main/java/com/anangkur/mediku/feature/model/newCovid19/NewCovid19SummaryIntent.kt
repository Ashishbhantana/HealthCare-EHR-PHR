package com.anangkur.mediku.feature.model.newCovid19

data class NewCovid19SummaryIntent(
    val country: String = "",
    val newConfirmed: Int? = 0,
    val newDeaths: Int? = 0,
    val newRecovered: Int? = 0,
    val slug: String? = "",
    val totalConfirmed: Int? = 0,
    val totalDeaths: Int? = 0,
    val totalRecovered: Int? = 0,
    var date: String? = ""
)