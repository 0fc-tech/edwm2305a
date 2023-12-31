package com.eniecole.cadox.dao.memory

import com.eniecole.cadox.bo.Article
import com.eniecole.cadox.dao.ArticleDao

class ArticleDaoMemoryImpl : ArticleDao {
    private val articlesInMemory = arrayListOf<Article>(
        Article(1,"Ecran 27 pouces","Ecran informatique pour afficher des choses",250.0,4,"https://picsum.photos/id/237/200/300"),
        Article(2,"Ecran 28 pouces","Ecran informatique pour afficher des choses",270.0,4,"https://picsum.photos/id/238/200/300"),
        Article(3,"Ecran 24 pouces","Ecran informatique pour afficher des choses",200.0,4,"https://picsum.photos/id/239/200/300"),
        Article(4,"Ecran 22 pouces","Ecran informatique pour afficher des choses",130.0,4,"https://picsum.photos/id/240/200/300"),
        Article(5,"Ecran 34 pouces","Ecran informatique pour afficher des choses",600.0,4,"https://picsum.photos/id/241/200/300"),
        Article(6,"Ordinateur MBP 13","Ordinateur qui coûte 4 SMIC",4000.0,3,"https://picsum.photos/id/242/200/300"),
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