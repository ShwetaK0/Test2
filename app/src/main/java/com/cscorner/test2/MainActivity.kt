package com.cscorner.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var enterEmail: EditText
    private lateinit var enterPass: EditText
    private lateinit var login: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enterEmail=findViewById(R.id.edit1)
        enterPass=findViewById(R.id.edit2)
         login=findViewById(R.id.btn1)
        val res=findViewById<Button>(R.id.btn2)

        val preference = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val data1=preference.getString("user_email","")
        val data2=preference.getString("user_pwd","")



        login.setOnClickListener {
            val enteredEmail=enterEmail.text.toString()
            val enteredPassword=enterPass.text.toString()

            if(enteredEmail==data1&& enteredPassword==data2){
                //Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, DashBaordActivity::class.java))
            } else {
                Toast.makeText(this, "Login failed. Check your credentials.", Toast.LENGTH_SHORT)
                    .show()
            }


}
      res.setOnClickListener {
          startActivity(Intent(this,Register::class.java))
      }



    }
}