package com.eniecole.mod5demosupp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonConnexion = view.findViewById<Button>(R.id.buttoConnexion)
        buttonConnexion.setOnClickListener {
            val direction = LoginFragmentDirections.actionLoginFragmentToHomeFragment(
                view.findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
            )
            findNavController().navigate(direction)

        }
    }


}