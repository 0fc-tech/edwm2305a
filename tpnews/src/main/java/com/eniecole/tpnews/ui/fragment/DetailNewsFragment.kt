package com.eniecole.tpnews.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.eniecole.tpnews.R
import com.eniecole.tpnews.databinding.FragmentDetailNewsBinding


class DetailNewsFragment : Fragment() {
    private lateinit var binding : FragmentDetailNewsBinding
    private val args by navArgs<DetailNewsFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailNewsBinding.inflate( inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.news = args.news
    }
}