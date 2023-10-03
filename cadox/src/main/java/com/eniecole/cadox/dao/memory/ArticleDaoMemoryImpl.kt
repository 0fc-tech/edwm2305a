package com.eniecole.cadox.dao.memory

import com.eniecole.cadox.bo.Article
import com.eniecole.cadox.dao.ArticleDao

class ArticleDaoMemoryImpl : ArticleDao {
    private val articlesInMemory = arrayListOf<Article>(
        Article(1,"Ecran 27 pouces","Ecran informatique pour afficher des choses",250.0,4,""),
        Article(2,"Ecran 28 pouces","Ecran informatique pour afficher des choses",270.0,4,""),
        Article(3,"Ecran 24 pouces","Ecran informatique pour afficher des choses",200.0,4,""),
        Article(4,"Ecran 22 pouces","Ecran informatique pour afficher des choses",130.0,4,""),
        Article(5,"Ecran 34 pouces","Ecran informatique pour afficher des choses",600.0,4,""),
    )

    override fun selectById(id: Long): Article? = articlesInMemory.find { it.id == id }

    override fun selectAll(): List<Article> {
        TODO("Not yet implemented")
    }
    override fun removeById(id: Long): Long {
        TODO("Not yet implemented")
    }
    override fun removeAll(): List<Long> {
        TODO("Not yet implemented")
    }
    override fun insert(article: Article): Long {
        TODO("Not yet implemented")
    }

}