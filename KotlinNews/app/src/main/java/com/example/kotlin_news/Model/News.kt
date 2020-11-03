package com.example.kotlin_news.Model

data class News(
    val articles: List<Articles>,
    val status: String,
    val totalResults: Int
)