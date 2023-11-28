package com.cscorner.test2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Register : AppCompatActivity() {

    private lateinit var email: EditText
    private lateinit var username: EditText
    private lateinit var password: EditText




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registor)

        email=findViewById(R.id.email)
        username=findViewById(R.id.username)
        password=findViewById(R.id.password)

        val res=findViewById<Button>(R.id.btn3)


        val preference = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val editPreference=preference.edit()

        res.setOnClickListener {
            editPreference.putString("user_email", email.text.toString()).apply()
            editPreference.putString("user_pwd", password.text.toString()).apply()
            startActivity(Intent(this, MainActivity::class.java))

        }



    }


}