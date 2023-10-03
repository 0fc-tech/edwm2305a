package com.eniecole.cadox.dao

import com.eniecole.cadox.bo.Article

interface ArticleDao {
    fun selectById(id: Long) : Article?
    //EXEMPLE
    fun selectAll() : List<Article>
    fun removeById(id : Long) : Long
    fun removeAll() : List<Long>
    fun insert(article: Article) :Long
}