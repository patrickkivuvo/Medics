package com.example.mydoctor.doctor

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mydoctor.R

class Details : AppCompatActivity() {
    private lateinit var bac: ImageView
    private lateinit var bio: TextView
    private lateinit var detail: TextView
    private lateinit var time: TextView

    private lateinit var date: TextView


    private lateinit var BioLinear: LinearLayout
    private lateinit var DetailLinear: LinearLayout
    private lateinit var TimeLinear: LinearLayout

    private lateinit var clerk: Button
    private lateinit var bt1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        clerk = findViewById(R.id.btnClerk)
        bt1 = findViewById(R.id.btnSave)


        date = findViewById(R.id.Date)

        bio = findViewById(R.id.Biodata)
        detail = findViewById(R.id.Details)
        time = findViewById(R.id.Time)

        BioLinear = findViewById(R.id.BiodataLayout)
        DetailLinear = findViewById(R.id.DetailsLayout)
        TimeLinear = findViewById(R.id.DateLayout)

        clerk.setOnClickListener {
            val intent = Intent(this, Kendi::class.java)
            startActivity(intent)
        }
        bt1.setOnClickListener {
            val intent = Intent(this, RescheduleAppointment::class.java)
            startActivity(intent)
        }

        bio.setOnClickListener {
            time.background = null
            detail.background = null
            time.setTextColor(resources.getColor(R.color.textColor))
            detail.setTextColor(resources.getColor(R.color.textColor))
            bio.background = resources.getDrawable(R.drawable.switch_trcks, null)
            BioLinear.visibility = View.VISIBLE
            DetailLinear.visibility = View.GONE
            TimeLinear.visibility = View.GONE
            bio.setTextColor(resources.getColor(R.color.white))
        }
        detail.setOnClickListener {
            time.background = null
            bio.background = null
            time.setTextColor(resources.getColor(R.color.textColor))
            bio.setTextColor(resources.getColor(R.color.textColor))
            detail.background = resources.getDrawable(R.drawable.switch_trcks, null)
            DetailLinear.visibility = View.VISIBLE
            BioLinear.visibility = View.GONE
            TimeLinear.visibility = View.GONE
            detail.setTextColor(resources.getColor(R.color.white))
        }
        time.setOnClickListener {
            bio.background = null
            detail.background = null
            bio.setTextColor(resources.getColor(R.color.textColor))
            detail.setTextColor(resources.getColor(R.color.textColor))
            time.background = resources.getDrawable(R.drawable.switch_trcks, null)
            TimeLinear.visibility = View.VISIBLE
            DetailLinear.visibility = View.GONE
            BioLinear.visibility = View.GONE
            time.setTextColor(resources.getColor(R.color.white))
        }

        // date picker
        val tv = findViewById<TextView>(R.id.Date)
        val cal = Calendar.getInstance()
        val myYear = cal.get(Calendar.YEAR)
        val myMonth = cal.get(Calendar.MONTH)
        val day = cal.get(Calendar.DAY_OF_MONTH)

        tv.setOnClickListener {
            val datePickerDialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    tv.text = "Date:" + dayOfMonth + "/ " + (month + 1) + "/ " + year
                },
                myYear,
                myMonth,
                day
            )
            datePickerDialog.show()
        }
    }
}