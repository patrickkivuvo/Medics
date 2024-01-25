package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.mydoctor.MainActivity
import com.example.mydoctor.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SymptomChecker : AppCompatActivity() {
    private lateinit var bac: ImageView
    private lateinit var save: FloatingActionButton

    private lateinit var PreLinear: LinearLayout
    private lateinit var ClickLinear: LinearLayout
    private lateinit var PostLinear: LinearLayout
    private lateinit var RecLinear: LinearLayout

    private lateinit var pre: TextView
    private lateinit var click: TextView
    private lateinit var post: TextView
    private lateinit var reco: TextView

    private lateinit var chos: AutoCompleteTextView
    private lateinit var chose: AutoCompleteTextView
    private lateinit var choos: AutoCompleteTextView
    private lateinit var choose: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptom_checker)
        bac = findViewById(R.id.back)
        save = findViewById(R.id.addContinue)


        PreLinear = findViewById(R.id.PreLayout)
        ClickLinear = findViewById(R.id.ClickedLayout)
        PostLinear = findViewById(R.id.PostLayout)
        RecLinear = findViewById(R.id.RecommendationsLayout)

        pre = findViewById(R.id.Pre)
        post = findViewById(R.id.Post)
        click = findViewById(R.id.Clicked)
        reco = findViewById(R.id.Recommendations)

        chos = findViewById(R.id.autoCompleteTextView3)
        chose = findViewById(R.id.autoCompleteTextView2)
        choos = findViewById(R.id.autoCompleteTextView1)
        choose = findViewById(R.id.autoCompleteTextView)

        pre.setOnClickListener {
            post.background = null
            click.background = null
            reco.background = null
            post.setTextColor(resources.getColor(R.color.textColor))
            click.setTextColor(resources.getColor(R.color.textColor))
            reco.setTextColor(resources.getColor(R.color.textColor))
            pre.background = resources.getDrawable(R.drawable.switch_trcks, null)
            PreLinear.visibility = View.VISIBLE
            ClickLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
            RecLinear.visibility = View.GONE
            pre.setTextColor(resources.getColor(R.color.white))
        }
        post.setOnClickListener {
            pre.background = null
            click.background = null
            reco.background = null
            pre.setTextColor(resources.getColor(R.color.textColor))
            click.setTextColor(resources.getColor(R.color.textColor))
            reco.setTextColor(resources.getColor(R.color.textColor))
            post.background = resources.getDrawable(R.drawable.switch_trcks, null)
            PostLinear.visibility = View.VISIBLE
            ClickLinear.visibility = View.GONE
            PreLinear.visibility = View.GONE
            RecLinear.visibility = View.GONE
            post.setTextColor(resources.getColor(R.color.white))
        }
        click.setOnClickListener {
            post.background = null
            pre.background = null
            reco.background = null
            post.setTextColor(resources.getColor(R.color.textColor))
            pre.setTextColor(resources.getColor(R.color.textColor))
            reco.setTextColor(resources.getColor(R.color.textColor))
            click.background = resources.getDrawable(R.drawable.switch_trcks, null)
            ClickLinear.visibility = View.VISIBLE
            PreLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
            RecLinear.visibility = View.GONE
            click.setTextColor(resources.getColor(R.color.white))
        }

        reco.setOnClickListener {
            post.background = null
            click.background = null
            pre.background = null
            post.setTextColor(resources.getColor(R.color.textColor))
            click.setTextColor(resources.getColor(R.color.textColor))
            pre.setTextColor(resources.getColor(R.color.textColor))
            reco.background = resources.getDrawable(R.drawable.switch_trcks, null)
            RecLinear.visibility = View.VISIBLE
            ClickLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
            PreLinear.visibility = View.GONE
            reco.setTextColor(resources.getColor(R.color.white))
        }


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

        bac.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        save.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}