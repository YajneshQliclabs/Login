package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login.databinding.ActivityAcountingBinding
import com.example.login.databinding.ActivityTechnologyBinding

class Technology : AppCompatActivity() {

    private lateinit var binding: ActivityTechnologyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityTechnologyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext3.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }
    }
}