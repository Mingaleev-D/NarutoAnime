package com.example.narutoanime

import com.google.gson.annotations.SerializedName

/**
 * @author Mingaleev D. 01.07.2022
 **/
data class TopAnime(
    @SerializedName("request_cache_expiry")
    val requestCacheExpiry: Int,
    @SerializedName("request_cached")
    val requestCached: Boolean,
    @SerializedName("request_hash")
    val requestHash: String,
    @SerializedName("top")
    val top: List<Result>
)
