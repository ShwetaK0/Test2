package com.cscorner.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        val textView1 = findViewById<TextView>(R.id.text1)
        val textView2 = findViewById<TextView>(R.id.text2)

        val showPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE)

        val usernameText = showPreferences.getString("user_email","")
        val userageText = showPreferences.getString("user_pwd","")

        textView1.setText(usernameText)
        textView2.setText(userageText)

    }
}