package com.example.smartspend

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val etUsername = findViewById<View>(R.id.etUsername)
        etEmail = findViewById<View>(R.id.etEmail)
        btnEditProfilee = findViewById<View>(R.id.btnEditProfilee)
        btnLogOut = findViewById<View>(R.id.btnLogOut)

        // TODO: Load user data from database

        // TODO: Load user data from database
        etUsername.setText("John Doe")
        etEmail.setText("johndoe@example.com")



        btnEditProfilee.setOnClickListener { v ->
            // TODO: Implement Edit Profile functionality
            Toast.makeText(this, "Edit Profile Clicked", Toast.LENGTH_SHORT).show()
        }

        btnLogOut.setOnClickListener { v ->
            // TODO: Implement Logout functionality
            startActivity(Intent(this, LandingActivity::class.java))
            finish()
        }
    }
}