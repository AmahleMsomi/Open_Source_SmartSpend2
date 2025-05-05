package com.example.smartspend

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //linking buttons
        findViewById<Button>(R.id.btnAddExpense).setOnClickListener {
            startActivity(Intent(this, addExpense::class.java))
        }

        //btnViewExpenes
        findViewById<Button>(R.id.btnViewExpenes).setOnClickListener {
            startActivity(Intent(this, ExpenseTracking::class.java))
        }

        //btnAddSavings
        findViewById<Button>(R.id.btnAddSavings).setOnClickListener {
            startActivity(Intent(this, Savings::class.java))
        }
    }
}