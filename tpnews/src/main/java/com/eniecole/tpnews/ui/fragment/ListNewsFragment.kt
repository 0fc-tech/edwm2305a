package com.eniecole.tpnews.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.eniecole.tpnews.News
import com.eniecole.tpnews.R
import com.eniecole.tpnews.databinding.FragmentListNewsBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ListNewsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListNewsFragment : Fragment() {
    lateinit var binding : FragmentListNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentListNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val alArticles = arrayListOf(
            News(1, "Article senstation 1","lorempisum1 lorempisum1 lorempisum1 lorempisum1 lorempisum lorempisum lorempisum ", "1lorempisum "),
            News(2, "Article senstation 2","lorempisum2 lorempisum2 lorempisum2 lorempisum2 lorempisum lorempisum lorempisum ", "2lorempisum "),
            News(3, "Article senstation 3","lorempisum3 lorempisum3 lorempisum3 lorempisum3 lorempisum lorempisum lorempisum ", "3lorempisum "),
            News(4, "Article senstation 4","lorempisum4 lorempisum4 lorempisum4 lorempisum4 lorempisum lorempisum lorempisum ", "4lorempisum "),
        )
        binding.textViewContent1.text = alArticles[0].content
        binding.textViewTitle1.text = alArticles[0].title
        binding.textViewContent2.text = alArticles[1].content
        binding.textViewTitle2.text = alArticles[1].title
        binding.textViewContent3.text = alArticles[2].content
        binding.textViewTitle3.text = alArticles[2].title
        binding.textViewContent4.text = alArticles[3].content
        binding.textViewTitle4.text = alArticles[3].title

        binding.article1Card.setOnClickListener {
            ListNewsFragmentDirections.actionListDetail(alArticles[0]).also {
                findNavController().navigate(it)
            }
        }
        binding.article2Card.setOnClickListener {
            ListNewsFragmentDirections.actionListDetail(alArticles[1]).also {
                findNavController().navigate(it)
            }
        }
        binding.article3Card.setOnClickListener {
            ListNewsFragmentDirections.actionListDetail(alArticles[2]).also {
                findNavController().navigate(it)
            }
        }
        binding.article4Card.setOnClickListener {
            ListNewsFragmentDirections.actionListDetail(alArticles[3]).also {
                findNavController().navigate(it)
            }
        }

    }

}