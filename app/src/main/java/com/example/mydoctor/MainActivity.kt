package com.example.mydoctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mydoctor.doctor.Kendi

class MainActivity : AppCompatActivity() {
    private lateinit var editText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.kuja)

        editText.setOnClickListener {
            val intent = Intent(this, Kendi::class.java)
            startActivity(intent)
        }
    }
}