package com.eniecole.cadox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eniecole.cadox.repository.ArticleRepository

class ArticleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_view)
        print(ArticleRepository.getArticle(1).toString())
    }
}