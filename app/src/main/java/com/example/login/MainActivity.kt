package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Getstarted = findViewById<Button>(R.id.btnGetStarted)

        Getstarted.setOnClickListener {
            val intent = Intent(this,compliance::class.java)
            startActivity(intent)
            finish()
        }

    }
}