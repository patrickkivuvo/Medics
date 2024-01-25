package com.example.mydoctor.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mydoctor.R
import com.example.mydoctor.doctor.Biodata
import com.example.mydoctor.doctor.Kendi

class Congrats : AppCompatActivity() {
    private lateinit var goHome: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats)

        goHome = findViewById(R.id.btnGoHome)

        goHome.setOnClickListener {
            val intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }
    }
}