package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import com.example.mydoctor.R
import android.widget.SearchView
import android.widget.Toast

class Home : AppCompatActivity() {
    private lateinit var sms: ImageView
    private lateinit var notif: ImageView
    // creating variable for searchview
    lateinit var searchView: SearchView

    private lateinit var bt1: Button
    private lateinit var bt2: Button
    private lateinit var bt3: Button
    private lateinit var bt4: Button
    private lateinit var bt5: Button
    private lateinit var bt6: Button
    private lateinit var bt7: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // initializing variables with their ids.
        sms = findViewById(R.id.Messages)
        notif = findViewById(R.id.Notifications)
        searchView = findViewById(R.id.idSV)

        bt1 = findViewById(R.id.btn1)
        bt2 = findViewById(R.id.btn2)
        bt3 = findViewById(R.id.btn3)
        bt4 = findViewById(R.id.btn4)
        bt5 = findViewById(R.id.btn5)
        bt6 = findViewById(R.id.btn6)
        bt7 = findViewById(R.id.btn7)


        bt1.setOnClickListener {
            val intent = Intent(this, DrSpecialist::class.java)
            startActivity(intent)
        }
        bt2.setOnClickListener {
            val intent = Intent(this, MedicalOfficer::class.java)
            startActivity(intent)
        }
        bt3.setOnClickListener {
            val intent = Intent(this, ClinicalOfficer::class.java)
            startActivity(intent)
        }


        bt4.setOnClickListener {
            val intent = Intent(this, Nurse::class.java)
            startActivity(intent)
        }
        bt5.setOnClickListener {
            val intent = Intent(this, Physio::class.java)
            startActivity(intent)
        }

        bt6.setOnClickListener {
            val intent = Intent(this, Psychologist::class.java)
            startActivity(intent)
        }
        bt7.setOnClickListener {
            val intent = Intent(this, Nutritionist::class.java)
            startActivity(intent)
        }

        sms.setOnClickListener {
            val intent = Intent(this, Inbox::class.java)
            startActivity(intent)
        }
        notif.setOnClickListener {
            val intent = Intent(this, Notifications::class.java)
            startActivity(intent)
        }

    }
}