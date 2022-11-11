package com.example.projectm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()
        val nutton = findViewById<View>(R.id.button4) as Button
        nutton.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, LoginScreen::class.java))
        }
        val mutton = findViewById<View>(R.id.button5) as Button
        mutton.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, NavigationBar::class.java))
        }
    }
}