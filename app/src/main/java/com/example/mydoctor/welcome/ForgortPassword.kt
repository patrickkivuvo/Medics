package com.example.mydoctor.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import com.example.mydoctor.R

class ForgortPassword : AppCompatActivity() {
    private lateinit var Forgot: RelativeLayout
    private lateinit var Forgot1: RelativeLayout
    private lateinit var contin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgort_password)


        Forgot = findViewById(R.id.forgot)
        Forgot1 = findViewById(R.id.forgot1)

        contin = findViewById(R.id.btnHome)

        Forgot.setOnClickListener {
            Forgot1.background = null
            Forgot.background = resources.getDrawable(R.drawable.switch_tumbsforgort, null)
        }
        Forgot1.setOnClickListener {
            Forgot1.background = resources.getDrawable(R.drawable.switch_tumbsforgort, null)
            Forgot.background = null
        }

        contin.setOnClickListener {
            val intent = Intent(this, Verify::class.java)
            startActivity(intent)
        }
    }
}