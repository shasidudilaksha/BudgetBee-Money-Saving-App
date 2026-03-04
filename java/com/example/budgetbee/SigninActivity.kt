package com.example.budgetbee

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signinactivity)


        val btnSignIn: Button = findViewById(R.id.btnSignIn)
        btnSignIn.setOnClickListener {
            // Navigate to Onboarding2Activity
            startActivity(Intent(this, HomeFragment::class.java))
            finish()

        }


    }
}


