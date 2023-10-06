package com.eniecole.mod5demosupp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.itemAdd){
            Toast.makeText(this, "Ajout en cours", Toast.LENGTH_SHORT).show()

        }else if (item.itemId == R.id.itemEdit){
            val direction = LoginFragmentDirections.actionLoginFragmentToHomeFragment(
                User("Michel","JP", LocalDateTime.now(),"email")
            )
            findNavController(R.id.fragmentContainerView).navigate(direction)
        }
        return super.onOptionsItemSelected(item)
    }
}