package com.example.budgetbee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Onboarding1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding1)

        val btnNext1: Button = findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            // Navigate to Onboarding2Activity
            startActivity(Intent(this, Onboarding2Activity::class.java))
            finish()
        }
    }
}

