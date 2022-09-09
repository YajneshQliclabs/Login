package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login.databinding.ActivityAcountingBinding

class Accounting : AppCompatActivity() {

    private lateinit var binding: ActivityAcountingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityAcountingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext2.setOnClickListener {
            startActivity(Intent(this,Technology::class.java))
        }
    }
}