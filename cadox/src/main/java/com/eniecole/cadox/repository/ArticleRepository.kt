package com.eniecole.cadox.repository

import com.eniecole.cadox.bo.Article
import com.eniecole.cadox.dao.DaoFactory
import com.eniecole.cadox.dao.DaoType

object ArticleRepository {
    //Fonction "getArticle" prend en param un identifiant Long et peut retourner un Article ou Null
    fun getArticle(id : Long) : Article? {
        return DaoFactory.getDao(DaoType.MEMORY).selectById(id);
    }
}