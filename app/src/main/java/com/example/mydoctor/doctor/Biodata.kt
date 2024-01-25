package com.example.mydoctor.doctor

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.mydoctor.R
import com.example.mydoctor.welcome.Congrats

class Biodata : AppCompatActivity() {
    private lateinit var storeImg: ImageView
    private lateinit var gallerBtn: ImageView

    private lateinit var date: TextView

    private lateinit var bio: TextView
    private lateinit var info: TextView
    private lateinit var his: TextView

    private lateinit var BioLinear: LinearLayout
    private lateinit var InfoLinear: LinearLayout
    private lateinit var AvailLinear: LinearLayout


    private lateinit var bac: ImageView
    private lateinit var contin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        storeImg = findViewById(R.id.imageStore)
        gallerBtn = findViewById(R.id.imgPick)
        date = findViewById(R.id.Date)

        bio = findViewById(R.id.Biodata)
        info = findViewById(R.id.MedicalInfo)
        his = findViewById(R.id.History)

        BioLinear = findViewById(R.id.BiodataLayout)
        InfoLinear = findViewById(R.id.MedicalInfoLayout)
        AvailLinear = findViewById(R.id.DateLayout)
        contin = findViewById(R.id.btnHome)

        bac = findViewById(R.id.back)

        bio.setOnClickListener {
            info.background = null
            his.background = null
            info.setTextColor(resources.getColor(R.color.textColor))
            his.setTextColor(resources.getColor(R.color.textColor))
            bio.background = resources.getDrawable(R.drawable.switch_trcks, null)
            BioLinear.visibility = View.VISIBLE
            InfoLinear.visibility = View.GONE
            AvailLinear.visibility = View.GONE
            bio.setTextColor(resources.getColor(R.color.white))
        }
        info.setOnClickListener {
            info.background = resources.getDrawable(R.drawable.switch_trcks, null)
            info.setTextColor(resources.getColor(R.color.white))
            bio.background = null
            his.background = null
            BioLinear.visibility = View.GONE
            InfoLinear.visibility = View.VISIBLE
            AvailLinear.visibility = View.GONE
            his.setTextColor(resources.getColor(R.color.textColor))
            bio.setTextColor(resources.getColor(R.color.textColor))
        }
        his.setOnClickListener {
            his.background = resources.getDrawable(R.drawable.switch_trcks, null)
            his.setTextColor(resources.getColor(R.color.white))
            bio.background = null
            info.background = null
            BioLinear.visibility = View.GONE
            InfoLinear.visibility = View.GONE
            AvailLinear.visibility = View.VISIBLE
            info.setTextColor(resources.getColor(R.color.textColor))
            bio.setTextColor(resources.getColor(R.color.textColor))
        }



        bac.setOnClickListener {
            val intent = Intent(this, Congrats::class.java)
            startActivity(intent)
        }
        contin.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
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

        gallerBtn.setOnClickListener {
            pickImageGallery()
        }

    }

    private fun pickImageGallery() {
        val intent = Intent()
        intent.action = Intent.ACTION_GET_CONTENT
        intent.type = "image/*"
        startActivityForResult(intent, 100)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100){
            storeImg.setImageURI(data?.data)
        }
    }
}