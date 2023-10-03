package com.eniecole.cadox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eniecole.cadox.repository.ArticleRepository

private const val TAG = "ArticleViewActivity"
class ArticleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_view)
        Log.d(TAG, "onCreate: ${ArticleRepository.getArticle(2).toString()}")
        val article = ArticleRepository.getArticle(2)
        article.intitule
    }
}