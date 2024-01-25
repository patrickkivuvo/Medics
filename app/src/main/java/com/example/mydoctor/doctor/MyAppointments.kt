package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mydoctor.MainActivity
import com.example.mydoctor.R

class MyAppointments : AppCompatActivity() {
    private lateinit var now: Button
    private lateinit var bac: ImageView
    private lateinit var bok: TextView


    private lateinit var sched: TextView
    private lateinit var book: TextView


    private lateinit var SchedLinear: LinearLayout
    private lateinit var BookLinear: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_appointments)


        bac = findViewById(R.id.back)
        now = findViewById(R.id.Now)
        bok = findViewById(R.id.Book)

        sched = findViewById(R.id.Scheduled)
        book = findViewById(R.id.Appointment)
        SchedLinear = findViewById(R.id.ScheduledLayout)
        BookLinear = findViewById(R.id.BookLayout)

        sched.setOnClickListener {
            book.background = null
            book.setTextColor(resources.getColor(R.color.textColor))
            sched.background = resources.getDrawable(R.drawable.switch_trcks, null)
            SchedLinear.visibility = View.VISIBLE
            BookLinear.visibility = View.GONE
            sched.setTextColor(resources.getColor(R.color.white))
        }
        book.setOnClickListener {
            book.background = resources.getDrawable(R.drawable.switch_trcks, null)
            book.setTextColor(resources.getColor(R.color.white))
            sched.background = null
            SchedLinear.visibility = View.GONE
            BookLinear.visibility = View.VISIBLE
            sched.setTextColor(resources.getColor(R.color.textColor))
        }

        now.setOnClickListener {
            val intent = Intent(this, ResumeSession::class.java)
            startActivity(intent)
        }
        bok.setOnClickListener {
            val intent = Intent(this, ScheduledAppointments::class.java)
            startActivity(intent)
        }




        bac.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}