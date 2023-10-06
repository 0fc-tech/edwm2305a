package com.eniecole.cadox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.eniecole.cadox.databinding.FragmentArticleViewBinding
import com.eniecole.cadox.repository.ArticleRepository

class ArticleViewFragment : Fragment() {
    private lateinit var binding : FragmentArticleViewBinding
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

        val articleMBP = ArticleRepository.getArticle(6)
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
    }
}










