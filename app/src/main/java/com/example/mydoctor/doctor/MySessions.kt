package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mydoctor.R

class MySessions : AppCompatActivity() {
    private lateinit var new: TextView
    private lateinit var scheduled: TextView
    private lateinit var active: TextView


    private lateinit var view1: Button
    private lateinit var accept: Button
    private lateinit var kardex: Button
    private lateinit var view: Button

    private lateinit var NewLinear: LinearLayout
    private lateinit var ScheduledLinear: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_sessions)


        new = findViewById(R.id.New)
        scheduled = findViewById(R.id.Scheduled)
        active = findViewById(R.id.Active)

        view = findViewById(R.id.View)
        accept = findViewById(R.id.Accept)
        kardex = findViewById(R.id.Kardex)
        view1= findViewById(R.id.Details)

        NewLinear = findViewById(R.id.NewLayout)
        ScheduledLinear = findViewById(R.id.ScheduledLayout)

        view1.setOnClickListener {
            val intent = Intent(this, ViewDetails::class.java)
            startActivity(intent)
        }
        view.setOnClickListener {
            val intent = Intent(this, ViewDetails::class.java)
            startActivity(intent)
        }
        accept.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        kardex.setOnClickListener {
            val intent = Intent(this, Kardex::class.java)
            startActivity(intent)
        }

        new.setOnClickListener {
            scheduled.background = null
            active.background = null
            scheduled.setTextColor(resources.getColor(R.color.textColor))
            active.setTextColor(resources.getColor(R.color.textColor))
            new.background = resources.getDrawable(R.drawable.switch_trcks, null)
            NewLinear.visibility = View.VISIBLE
            ScheduledLinear.visibility = View.GONE
            new.setTextColor(resources.getColor(R.color.white))
        }
        scheduled.setOnClickListener {
            new.background = null
            active.background = null
            new.setTextColor(resources.getColor(R.color.textColor))
            active.setTextColor(resources.getColor(R.color.textColor))
            scheduled.background = resources.getDrawable(R.drawable.switch_trcks, null)
            ScheduledLinear.visibility = View.VISIBLE
            NewLinear.visibility = View.GONE
            scheduled.setTextColor(resources.getColor(R.color.white))
        }
        active.setOnClickListener {
            scheduled.background = null
            new.background = null
            scheduled.setTextColor(resources.getColor(R.color.textColor))
            new.setTextColor(resources.getColor(R.color.textColor))
            active.background = resources.getDrawable(R.drawable.switch_trcks, null)
            NewLinear.visibility = View.GONE
            ScheduledLinear.visibility = View.GONE
            active.setTextColor(resources.getColor(R.color.white))
        }

    }
}