package com.eniecole.cadox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.RatingBar
import android.widget.TextView
import com.eniecole.cadox.repository.ArticleRepository

private const val TAG = "ArticleViewActivity"
class ArticleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_view)
        Log.d(TAG, "onCreate: ${ArticleRepository.getArticle(6).toString()}")
        val article = ArticleRepository.getArticle(6)

        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)
        val textViewDescription = findViewById<TextView>(R.id.textViewDescription)
        val textViewDateAchat = findViewById<TextView>(R.id.textViewDateAchat)
        val textViewPrix = findViewById<TextView>(R.id.textViewPrix)
        val textViewUrl = findViewById<TextView>(R.id.textViewUrl)
        val checkBoxIsAchete = findViewById<CheckBox>(R.id.checkBoxIsAchete)
        val ratingBarNiveau = findViewById<RatingBar>(R.id.ratingBarNiveau)
        textViewTitle.text = article?.intitule
        textViewDescription.text = article?.description
        textViewDateAchat.text = article?.dateAchat?.toString()
        textViewPrix.text = "${article?.prix}€"
        textViewUrl.text = article?.url
        checkBoxIsAchete.isChecked = article?.achete ?: false
        ratingBarNiveau.rating = article?.niveau?.toFloat() ?: 0f
    }
}







