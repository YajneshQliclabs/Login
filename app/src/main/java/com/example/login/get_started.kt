package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class get_started : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.get_started)

        val Getstarted = findViewById<Button>(R.id.btnNext)

        Getstarted.setOnClickListener {
            val intent = Intent(this, technology::class.java)
            startActivity(intent)
            finish()
        }

    }
}