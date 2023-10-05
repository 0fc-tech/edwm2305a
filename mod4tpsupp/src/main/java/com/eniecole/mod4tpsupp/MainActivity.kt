package com.eniecole.mod4tpsupp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.eniecole.mod4tpsupp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.article = Article(
            "Bureau IKEA super pour travailler",
            600.0f,"Bureua IKEA","IKEA")
        binding.buttonPasserCommande.setOnClickListener {
            binding.textViewCommandeEnCours.visibility = View.VISIBLE
        }
    }
}