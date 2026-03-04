package com.example.budgetbee

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay 2 seconds then go to Onboarding
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,Onboarding1Activity::class.java)
            startActivity(intent)
            finish() // Prevent going back to splash
        }, 2000)
    }
}
