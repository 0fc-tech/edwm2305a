package com.eniecole.cadox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.eniecole.cadox.databinding.FragmentArticleEditBinding
import com.eniecole.cadox.databinding.FragmentArticleViewBinding
import com.eniecole.cadox.repository.ArticleRepository


class ArticleEditFragment : Fragment() {
    private lateinit var binding : FragmentArticleEditBinding
    private val args by navArgs<ArticleEditFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArticleEditBinding.inflate(inflater, container, false)
        //On récupère le constraint layout du binding et on le retourne
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val articleRecupere = args.article
        binding.article = articleRecupere
    }
}