package com.example.fragmentebi.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragmentebi.R

class Homefragment: Fragment(R.layout.home) {
    private lateinit var editTextAmount: EditText
    private lateinit var sendButton: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editTextAmount = view.findViewById(R.id.editTextAmount)
        sendButton = view.findViewById(R.id.buttonSend)

        val controller = Navigation.findNavController(view)


        sendButton.setOnClickListener() {
            val amountText = editTextAmount.text.toString()

            if (amountText.isEmpty()) {
                return@setOnClickListener

                val amount = amountText.toInt()
                val action = HomefragmentDirections.actionHomeFragmentToDashboardFragment(amount)


            }

        }
    }
}







