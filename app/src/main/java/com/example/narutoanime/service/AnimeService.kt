package com.example.narutoanime.service

import com.example.narutoanime.SearchedAnime
import com.example.narutoanime.TopAnime
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Mingaleev D. 01.07.2022
 **/
interface AnimeService {

    @GET("top/anime")
    fun getTopAnimes(): Call<TopAnime>

    @GET("search/anime")
    fun getSearchedAnime(@Query("q")queryString: String): Call<SearchedAnime>

    companion object {
        val BASE_URL = "https://api.jikan.moe/v3/"

        fun create(): AnimeService {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(AnimeService::class.java)
        }
    }
}