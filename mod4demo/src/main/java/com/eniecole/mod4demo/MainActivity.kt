package com.eniecole.mod4demo

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewHW = findViewById<TextView>(R.id.textViewHelloWorld)
        val buttonClick = findViewById<Button>(R.id.buttonClick)
        buttonClick.setOnClickListener {
            textViewHW.text = "Bravo :D Vous avez comment appuyer sur un bouton"
        }
        textViewHW.text = "Bonjour à tous !"
        textViewHW.textSize = 40f
    }
}