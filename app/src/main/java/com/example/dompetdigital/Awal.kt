package com.abu.dompetdigital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.dompetdigital.MainActivity
import com.example.dompetdigital.R

class Awal : AppCompatActivity() {
    // Splash screen timer
    private val SPLASH_TIME_OUT = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        Handler().postDelayed(
            {
                val i = Intent(this@Awal, MainActivity::class.java)
                startActivity(i)
                finish()
            }, SPLASH_TIME_OUT)
    }
}