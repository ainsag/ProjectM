package com.example.projectm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        supportActionBar?.hide()
        val mButton = findViewById<View>(R.id.button2) as Button
        mButton.setOnClickListener {
            startActivity(Intent(this@LoginScreen, NavigationBar::class.java))
        }

    }
}