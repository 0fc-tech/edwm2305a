package com.eniecole.cadox

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.navigation.fragment.findNavController
import com.eniecole.cadox.databinding.FragmentArticleViewBinding
import com.eniecole.cadox.repository.ArticleRepository

private const val TAG = "ArticleViewFragment"
class ArticleViewFragment : Fragment() {
    private lateinit var binding : FragmentArticleViewBinding
    private val requestPermissionSMS = registerForActivityResult(
        ActivityResultContracts.RequestPermission()){
        isGranted->
        val intentToSMS =Intent(
            if(isGranted)
                Intent.ACTION_SENDTO
            else Intent.ACTION_VIEW,
            Uri.parse("sms:061234567")
        )
        //L'app SMS vient lire l'INTENT qu'elle reçoit et utilise la valeur de l'extra "sms_body" pour le corps du SMS
        intentToSMS.putExtra("sms_body","Pour mon anniversaire je voudrais un " +
                "${ binding.article?.intitule} ça ne coûte que ${ binding.article?.prix}€")
        startActivity(intentToSMS)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //Parser et interpréter le fichier XML Fragment_Article_View => Transforme XML Layout en View
        // ET elle retourne ensuite le binding
        binding = FragmentArticleViewBinding.inflate(inflater, container, false)
        //On récupère le constraint layout du binding et on le retourne
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val articleMBP = ArticleRepository.getArticle(1)
        Log.i(TAG, "onViewCreated:${articleMBP.toString()} ")
        println("print"+articleMBP.toString())
        if(articleMBP == null){
            Log.e(TAG, "onViewCreated: erreur lors de la récupération de l'article \"null\"", )
        }
        binding.article = articleMBP
        binding.textViewPrix.textSize = 40.0f
        //Détecter le clic sur le bouton "edit" et passer à la page suivante
        binding.imageButtonEdit.setOnClickListener {
            //Construire notre route vers editFragment et lui donner notre article
            if(articleMBP != null){
                val direction = ArticleViewFragmentDirections.actionArticleViewFragmentToArticleEditFragment(articleMBP)
                findNavController().navigate(direction)
            }
        }
        binding.imageButtonWeb.setOnClickListener {
            val intentToWeb = Intent(Intent.ACTION_VIEW, Uri.parse(articleMBP?.url))
            startActivity(intentToWeb)
        }
        binding.imageButtonSend.setOnClickListener {
            requestPermissionSMS.launch(Manifest.permission.SEND_SMS)
        }
    }
}










