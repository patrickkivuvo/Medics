package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.mydoctor.R

class Inbox : AppCompatActivity() {
    private lateinit var notif: ImageView

    private lateinit var unrea: TextView
    private lateinit var rea: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inbox)


        unrea = findViewById(R.id.unread)
        rea = findViewById(R.id.read)

        notif = findViewById(R.id.Notifications)


        unrea.setOnClickListener {
            rea.background = null
            rea.setTextColor(resources.getColor(R.color.textColor))
            unrea.background = resources.getDrawable(R.drawable.switch_trcks, null)
            unrea.setTextColor(resources.getColor(R.color.white))
        }
        rea.setOnClickListener {
            rea.background = resources.getDrawable(R.drawable.switch_trcks, null)
            rea.setTextColor(resources.getColor(R.color.white))
            unrea.background = null
            unrea.setTextColor(resources.getColor(R.color.textColor))
        }


        notif.setOnClickListener {
            val intent = Intent(this, Notifications::class.java)
            startActivity(intent)
        }
    }
}