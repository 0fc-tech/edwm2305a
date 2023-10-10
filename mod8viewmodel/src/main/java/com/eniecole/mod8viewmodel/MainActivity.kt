package com.eniecole.mod8viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.eniecole.mod8viewmodel.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    //private var compteur = 0
    //private lateinit var textView: TextView
    //private lateinit var floatingActionButton: FloatingActionButton
    val vm : CompteurViewModel by viewModels()
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //textView = findViewById(R.id.textView)
        //floatingActionButton = findViewById(R.id.floatingActionButton)

        binding.vm = vm
        //lifecycleOwner = this permet d'écouter les changements des LiveData
        //A chaque que les livedata changent, je vais réafficher les nouvelles valeurs
        binding.lifecycleOwner = this
        binding.floatingActionButton.setOnClickListener {
            //j'incrémente mon compteur, je vais avertir le binding que la donnée à changer
            // DONC elle sera tout le temps à jour sur l'UI
            vm.inc()
            //binding.vm = vm
        }
    }
}