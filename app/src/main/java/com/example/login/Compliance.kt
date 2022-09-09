package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login.databinding.ActivityComplianceBinding

class Compliance : AppCompatActivity() {

    private lateinit var binding: ActivityComplianceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityComplianceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext1.setOnClickListener {
            startActivity(Intent(this,Accounting::class.java))
        }

    }
}