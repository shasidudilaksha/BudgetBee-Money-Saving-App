package com.example.budgetbee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Onboarding2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding2)

        val btnNext2: Button = findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            startActivity(Intent(this, Onboarding3Activity::class.java))
            finish()
        }
    }
}
