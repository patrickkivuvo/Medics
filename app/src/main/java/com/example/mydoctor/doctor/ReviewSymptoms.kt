package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.mydoctor.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ReviewSymptoms : AppCompatActivity() {
    private lateinit var save: FloatingActionButton

    private lateinit var PreLinear: LinearLayout
    private lateinit var ClickLinear: LinearLayout
    private lateinit var RecLinear: LinearLayout
    private lateinit var PostLinear: LinearLayout

    private lateinit var pre: TextView
    private lateinit var click: TextView
    private lateinit var post: TextView
    private lateinit var reco: TextView



    private lateinit var goHome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_symptoms)
        save = findViewById(R.id.addContinue)

        PreLinear = findViewById(R.id.PreLayout)
        ClickLinear = findViewById(R.id.ClickedLayout)
        RecLinear = findViewById(R.id.RecommendationsLayout)
        PostLinear = findViewById(R.id.PostLayout)


        pre = findViewById(R.id.Pre)
        post = findViewById(R.id.Post)
        click = findViewById(R.id.Clicked)
        reco = findViewById(R.id.Recommendations)


        goHome = findViewById(R.id.btnGoHome)



        goHome.setOnClickListener {
            Toast.makeText(this, "Saved Successfully!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        pre.setOnClickListener {
            post.background = null
            click.background = null
            reco.background = null
            post.setTextColor(resources.getColor(R.color.textColor))
            click.setTextColor(resources.getColor(R.color.textColor))
            reco.setTextColor(resources.getColor(R.color.textColor))
            pre.background = resources.getDrawable(R.drawable.switch_trcks, null)
            PreLinear.visibility = View.VISIBLE
            PostLinear.visibility = View.GONE
            ClickLinear.visibility = View.GONE
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
            PreLinear.visibility = View.GONE
            PostLinear.visibility = View.VISIBLE
            ClickLinear.visibility = View.GONE
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
            RecLinear.visibility = View.GONE
            PreLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
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
            PreLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
            reco.setTextColor(resources.getColor(R.color.white))
        }
    }
}