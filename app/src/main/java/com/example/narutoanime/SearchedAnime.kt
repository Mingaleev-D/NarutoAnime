package com.example.narutoanime

import com.google.gson.annotations.SerializedName

/**
 * @author Mingaleev D. 01.07.2022
 **/
data class SearchedAnime(
    @SerializedName("last_page")
    val lastPage: Int,
    @SerializedName("request_cache_expiry")
    val requestCacheExpiry: Int,
    @SerializedName("request_cached")
    val requestCached: Boolean,
    @SerializedName("request_hash")
    val requestHash: String,
    @SerializedName("results")
    val results: List<Result>
)
