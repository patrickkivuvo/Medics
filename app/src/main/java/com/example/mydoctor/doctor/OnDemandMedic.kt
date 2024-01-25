package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mydoctor.R

class OnDemandMedic : AppCompatActivity() {
    private lateinit var accep: Button
    private lateinit var contin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_demand_medic)

        accep = findViewById(R.id.Accept)
        contin = findViewById(R.id.Full)


        accep.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        contin.setOnClickListener {
            val intent = Intent(this, FullDetails::class.java)
            startActivity(intent)
        }
    }
}