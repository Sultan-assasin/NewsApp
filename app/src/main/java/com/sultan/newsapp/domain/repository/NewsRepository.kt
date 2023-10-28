package com.sultan.newsapp.domain.repository

import com.sultan.newsapp.domain.model.Article
import com.sultan.newsapp.util.Resource

interface NewsRepository {

    suspend fun getTopHeadlines(
        category : String
    ) : Resource<List<Article>>

    suspend fun searchNews(
        query : String
    ) : Resource<List<Article>>
}