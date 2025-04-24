package com.example.smartspend

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Landing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LandingPageLoginbtn)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //add a register page
        val LandingPagebtn = findViewById<Button>(R.id.LandingPageLoginbtn)
        val LandingPageSignUpbtn = findViewById<Button>(R.id.LandingPageSignUpbtn)


        LandingPageSignUpbtn.setOnClickListener {
            val intent = Intent(this, SignUP::class.java)
            startActivity(intent)


            LandingPagebtn.setOnClickListener {
                val intent = Intent(this, LogIN::class.java)
                startActivity(intent)
            }
        }
    }
}