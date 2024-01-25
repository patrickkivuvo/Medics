package com.example.mydoctor.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mydoctor.R

class ResetPassword : AppCompatActivity() {
    private lateinit var contin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)


        contin = findViewById(R.id.btnHome)



        contin.setOnClickListener {
            val intent = Intent(this, Congrats::class.java)
            startActivity(intent)
        }
    }
}