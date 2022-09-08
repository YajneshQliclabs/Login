package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class compliance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compliance)

        val Getstarted = findViewById<Button>(R.id.btnNext)

        Getstarted.setOnClickListener {
            val intent = Intent(this,get_started::class.java)
            startActivity(intent)
            finish()
        }

    }
}