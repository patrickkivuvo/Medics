package com.example.mydoctor.doctor

import android.content.Intent
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

class ViewFullDescription : AppCompatActivity() {
    private lateinit var storeImg: ImageView
    private lateinit var gallerBtn: ImageView

    private lateinit var bio: TextView
    private lateinit var info: TextView
    private lateinit var his: TextView

    private lateinit var BioLinear: LinearLayout
    private lateinit var InfoLinear: LinearLayout

    private lateinit var chos: AutoCompleteTextView
    private lateinit var chose: AutoCompleteTextView
    private lateinit var choos: AutoCompleteTextView
    private lateinit var choose: AutoCompleteTextView

    private lateinit var contin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_full_description)

        storeImg = findViewById(R.id.imageStore)
        gallerBtn = findViewById(R.id.imgPick)

        bio = findViewById(R.id.Biodata)
        info = findViewById(R.id.MedicalInfo)
        his = findViewById(R.id.History)

        BioLinear = findViewById(R.id.BiodataLayout)
        InfoLinear = findViewById(R.id.MedicalInfoLayout)
        contin = findViewById(R.id.btnHome)

        chos = findViewById(R.id.autoCompleteTextView3)
        chose = findViewById(R.id.autoCompleteTextView2)
        choos = findViewById(R.id.autoCompleteTextView1)
        choose = findViewById(R.id.autoCompleteTextView)



        // dropdown menu for yes/no

        val choices = resources.getStringArray(R.array.choose_one)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, choices)
        val autoCompleteTV = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        autoCompleteTV.setAdapter(arrayAdapter)

        // dropdown menu for yes/no1

        val choice = resources.getStringArray(R.array.choose_one)
        val arayAdapter = ArrayAdapter(this, R.layout.dropdown_item, choice)
        val autoComplete = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView1)
        autoComplete.setAdapter(arayAdapter)

        // dropdown menu for yes/no2

        val choce = resources.getStringArray(R.array.choose_one)
        val araAdapter = ArrayAdapter(this, R.layout.dropdown_item, choce)
        val autoCompleteT = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView2)
        autoCompleteT.setAdapter(araAdapter)


        // dropdown menu for yes/no3

        val choc = resources.getStringArray(R.array.choose_one)
        val arAdapter = ArrayAdapter(this, R.layout.dropdown_item, choc)
        val autoComplet = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView3)
        autoComplet.setAdapter(arAdapter)

        contin.setOnClickListener {
            val intent = Intent(this, Kendi::class.java)
            startActivity(intent)
        }
        bio.setOnClickListener {
            info.background = null
            his.background = null
            info.setTextColor(resources.getColor(R.color.textColor))
            his.setTextColor(resources.getColor(R.color.textColor))
            bio.background = resources.getDrawable(R.drawable.switch_trcks, null)
            BioLinear.visibility = View.VISIBLE
            InfoLinear.visibility = View.GONE
            bio.setTextColor(resources.getColor(R.color.white))
        }
        info.setOnClickListener {
            info.background = resources.getDrawable(R.drawable.switch_trcks, null)
            info.setTextColor(resources.getColor(R.color.white))
            bio.background = null
            his.background = null
            BioLinear.visibility = View.GONE
            InfoLinear.visibility = View.VISIBLE
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
            info.setTextColor(resources.getColor(R.color.textColor))
            bio.setTextColor(resources.getColor(R.color.textColor))
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