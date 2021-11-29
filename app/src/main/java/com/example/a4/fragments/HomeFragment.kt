package com.example.a4.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.a4.R



class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var amountEditText: EditText
    private lateinit var sendButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        amountEditText = view.findViewById(R.id.editTextAmount)
        sendButton = view.findViewById(R.id.buttonsend)

        val navController = Navigation.findNavController(view)

        sendButton.setOnClickListener {

            val amountText = amountEditText.text.toString()

            if (amountText.isEmpty()) {
                return@setOnClickListener

            }

            val amount = amountText.toInt()

            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment()

            navController.navigate(action)
        }
    }

}