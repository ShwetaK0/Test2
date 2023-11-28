package com.cscorner.test2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.annotation.SuppressLint
import android.content.Context
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class ProfileFragment : Fragment() {


    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val rowView = inflater.inflate(R.layout.fragment_profile, container, false)



                val profileName=rowView.findViewById<TextView>(R.id.Name)
                val profilePass=rowView.findViewById<TextView>(R.id.Age)

                val context = requireActivity()
             val showPreferences = context.getSharedPreferences("MySharedPref", AppCompatActivity.MODE_PRIVATE)

               val usernameText = showPreferences.getString("user_email", "")
                val passwordText = showPreferences.getString("user_pwd", "")


        profileName.text = usernameText
        profilePass.text = passwordText



                return rowView
            }


        }


