package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.mydoctor.R

class PhysicalAppointments : AppCompatActivity() {
    private lateinit var bac: ImageView

    private lateinit var new: TextView
    private lateinit var schedul: TextView
    private lateinit var self: TextView

    private lateinit var viewD: Button
    private lateinit var detai: Button
    private lateinit var cance: Button
    private lateinit var accep: Button

    private lateinit var newLinear: LinearLayout
    private lateinit var scheduleLinear: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physical_appointments)

        new = findViewById(R.id.New)
        schedul = findViewById(R.id.Scheduled)
        self = findViewById(R.id.SelfMonitoring)

        viewD = findViewById(R.id.View)
        detai = findViewById(R.id.Details)
        cance = findViewById(R.id.Cancel)
        accep = findViewById(R.id.Accept)

        newLinear= findViewById(R.id.NewLayout)
        scheduleLinear = findViewById(R.id.ScheduledLayout)

        accep.setOnClickListener {
            Toast.makeText(this, "Accepted Successfully!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        viewD.setOnClickListener {
            val intent = Intent(this, ViewDetails::class.java)
            startActivity(intent)
        }
        detai.setOnClickListener {
            val intent = Intent(this, DetailsPhysical::class.java)
            startActivity(intent)
        }
        cance.setOnClickListener {
            val intent = Intent(this, CancelAppointment::class.java)
            startActivity(intent)
        }


        new.setOnClickListener {
            schedul.background = null
            self.background = null
            schedul.setTextColor(resources.getColor(R.color.textColor))
            self.setTextColor(resources.getColor(R.color.textColor))
            new.background = resources.getDrawable(R.drawable.switch_trcks, null)
            newLinear.visibility = View.VISIBLE
            scheduleLinear.visibility = View.GONE
            new.setTextColor(resources.getColor(R.color.white))
        }
        schedul.setOnClickListener {
            new.background = null
            self.background = null
            new.setTextColor(resources.getColor(R.color.textColor))
            self.setTextColor(resources.getColor(R.color.textColor))
            schedul.background = resources.getDrawable(R.drawable.switch_trcks, null)
            scheduleLinear.visibility = View.VISIBLE
            newLinear.visibility = View.GONE
            schedul.setTextColor(resources.getColor(R.color.white))
        }
        self.setOnClickListener {
            new.background = null
            schedul.background = null
            new.setTextColor(resources.getColor(R.color.textColor))
            schedul.setTextColor(resources.getColor(R.color.textColor))
            self.background = resources.getDrawable(R.drawable.switch_trcks, null)
            scheduleLinear.visibility = View.VISIBLE
            newLinear.visibility = View.GONE
            self.setTextColor(resources.getColor(R.color.white))
        }
    }
}