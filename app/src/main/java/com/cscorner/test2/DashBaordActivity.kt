package com.cscorner.test2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashBaordActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_baord)



        val navigationBtn=findViewById<BottomNavigationView>(R.id.bottom_navigationpage)
        loadFragment(HomeFragment())
        navigationBtn.setOnItemSelectedListener {
            when(it.itemId){
                R.id.Home->loadFragment(HomeFragment())
                R.id.Image->loadFragment(ImageFragment())
                R.id.Profile->loadFragment(ProfileFragment())
            }
            true
        }
    }

    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.framelayout,fragment).commit()
    }
}