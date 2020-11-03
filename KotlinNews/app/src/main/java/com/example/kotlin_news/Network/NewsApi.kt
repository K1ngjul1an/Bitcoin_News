package com.example.kotlin_news.Network

import com.example.kotlin_news.Model.News
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    //https://newsapi.org/v2/everything?q=bitcoin&from=2020-10-02&sortBy=publishedAt&apiKey=fad5c8299ba144f5b5b523913e8acd0d
    @GET("everything/")
    fun getNews(@Query("q")q:String,
                @Query("apiKey")
                apiKey:String,
                @Query("from")  from:String,
                @Query("sortBy") publishedAt:String

    ): Call<News>
}