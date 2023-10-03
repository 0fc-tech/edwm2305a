package com.eniecole.cadox.dao

import com.eniecole.cadox.dao.memory.ArticleDaoMemoryImpl

object DaoFactory {
    fun getDao(type: DaoType) :ArticleDao{
        return when(type){
            DaoType.MEMORY -> ArticleDaoMemoryImpl()
            DaoType.DB -> ArticleDaoMemoryImpl()
            DaoType.NETWORK -> ArticleDaoMemoryImpl()
        }
    }
}