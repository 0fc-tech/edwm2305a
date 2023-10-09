package com.eniecole.mod6intent

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //INTENT EXPLICITE => Envoyer l'utilisateur sur une activité dont le nom est connue
        //val intentToSecond = Intent(this, SecondActivity::class.java)
        //startActivity(intentToSecond)

        //Intent IMPLICITE => Envoyer l'utilisateur vers une activité dont on ne connait pas le nom
        // MAIS on sait ce qu'elle DOIT Faire
        //val intentCallPhone = Intent(Intent.ACTION_VIEW, Uri.parse("tel:012345678"))
        //startActivity(intentCallPhone)
        //val intentSearchURL = Intent(Intent.ACTION_VIEW, Uri.parse("https://eni-ecole.fr"))
        //startActivity(intentSearchURL)
        //val intentToENI = Intent(Intent.ACTION_VIEW, Uri.parse("geo:47.225934,-1.6176846"))
        ///startActivity(intentToENI)
        //registerReceiver(ReceiverLowBattery(), IntentFilter(Intent.ACTION_BATTERY_LOW))
        val intentToEMail = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:contact@jeanmichel.com"))
        startActivity(intentToEMail)
        registerReceiver(ReceiverLowBattery(), IntentFilter(Intent.ACTION_BATTERY_LOW))
    }
}
class ReceiverLowBattery : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        //TODO Traiter la batterie faible exemple: ralentir le temps de MAJ du positonnement GPS
        // toutes les 5 secondes => toutes les 20 secondes
        Log.d(TAG, "BATTERIE FAIBLE ATTENTION!! ")
    }

}