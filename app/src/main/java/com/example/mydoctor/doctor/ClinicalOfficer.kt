package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import com.example.mydoctor.R

class ClinicalOfficer : AppCompatActivity() {
    private lateinit var sms: ImageView
    private lateinit var notif: ImageView

    private lateinit var bt1: RelativeLayout
    private lateinit var bt2: RelativeLayout
    private lateinit var bt3: RelativeLayout
    private lateinit var bt4: RelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clinical_officer)

        sms = findViewById(R.id.Messages)
        notif = findViewById(R.id.Notifications)

        bt1 = findViewById(R.id.btn1)
        bt2 = findViewById(R.id.btn2)
        bt3 = findViewById(R.id.btn3)
        bt4 = findViewById(R.id.btn4)


        sms.setOnClickListener {
            val intent = Intent(this, Inbox::class.java)
            startActivity(intent)
        }
        notif.setOnClickListener {
            val intent = Intent(this, Notifications::class.java)
            startActivity(intent)
        }

        bt1.setOnClickListener {
            val intent = Intent(this, OnlineAppointments::class.java)
            startActivity(intent)
        }
        bt3.setOnClickListener {
            val intent = Intent(this, WaitingRoom::class.java)
            startActivity(intent)
        }
        bt4.setOnClickListener {
            val intent = Intent(this, SymptomCheckerRequest::class.java)
            startActivity(intent)
        }
    }
}