package com.eniecole.cadox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.RatingBar
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.eniecole.cadox.databinding.ActivityArticleViewBinding
import com.eniecole.cadox.repository.ArticleRepository

private const val TAG = "ArticleViewActivity"
class ArticleViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityArticleViewBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_article_view)
        Log.d(TAG, "onCreate: ${ArticleRepository.getArticle(6).toString()}")
        val articleMBP = ArticleRepository.getArticle(6)
        binding.article = articleMBP
        binding.textViewPrix.textSize = 40.0f

        //val textViewTitle = findViewById<TextView>(R.id.textViewTitle)
        //val textViewDescription = findViewById<TextView>(R.id.textViewDescription)
        //val textViewDateAchat = findViewById<TextView>(R.id.textViewDateAchat)
        //val textViewPrix = findViewById<TextView>(R.id.textViewPrix)
        //val textViewUrl = findViewById<TextView>(R.id.textViewUrl)
        //val checkBoxIsAchete = findViewById<CheckBox>(R.id.checkBoxIsAchete)
        //val ratingBarNiveau = findViewById<RatingBar>(R.id.ratingBarNiveau)
        //textViewTitle.text = article?.intitule
        //textViewDescription.text = article?.description
        //textViewDateAchat.text = article?.dateAchat?.toString()
        //textViewPrix.text = "${article?.prix}€"
        //textViewUrl.text = article?.url
        //checkBoxIsAchete.isChecked = article?.achete ?: false
        //ratingBarNiveau.rating = article?.niveau?.toFloat() ?: 0f
    }
}







