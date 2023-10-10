package com.eniecole.mod8viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    //private var compteur = 0
    private lateinit var textView: TextView
    private lateinit var floatingActionButton: FloatingActionButton
    val vm : CompteurViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        floatingActionButton = findViewById(R.id.floatingActionButton)

        textView.text = vm.compteur.toString()
        floatingActionButton.setOnClickListener {
            textView.text = vm.inc().toString()
        }
    }
}