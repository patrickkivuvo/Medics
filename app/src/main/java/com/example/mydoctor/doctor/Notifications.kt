package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.mydoctor.R

class Notifications : AppCompatActivity() {
    private lateinit var sms: ImageView

    private lateinit var notif: TextView
    private lateinit var remind: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
        sms = findViewById(R.id.Messages)

        notif = findViewById(R.id.Notifications)
        remind = findViewById(R.id.Reminders)

        notif.setOnClickListener {
            remind.background = null
            remind.setTextColor(resources.getColor(R.color.textColor))
            notif.background = resources.getDrawable(R.drawable.switch_trcks, null)
            notif.setTextColor(resources.getColor(R.color.white))
        }
        remind.setOnClickListener {
            remind.background = resources.getDrawable(R.drawable.switch_trcks, null)
            remind.setTextColor(resources.getColor(R.color.white))
            notif.background = null
            notif.setTextColor(resources.getColor(R.color.textColor))
        }


        sms.setOnClickListener {
            val intent = Intent(this, Inbox::class.java)
            startActivity(intent)
        }
    }
}