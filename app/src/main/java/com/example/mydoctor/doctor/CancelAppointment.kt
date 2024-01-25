package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.mydoctor.R

class CancelAppointment : AppCompatActivity() {
    private lateinit var bt1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cancel_appointment)

        bt1 = findViewById(R.id.btnSave)

        bt1.setOnClickListener {
            Toast.makeText(this, "Cancelled Successfully!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}