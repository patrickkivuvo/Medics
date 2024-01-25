package com.example.mydoctor.doctor

import android.content.Intent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

import com.example.mydoctor.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Kendi : AppCompatActivity() {
    private lateinit var bac: ImageView
    private lateinit var save: FloatingActionButton

    private lateinit var PreLinear: LinearLayout
    private lateinit var ClickLinear: LinearLayout
    private lateinit var AudiLinear: LinearLayout

    private lateinit var pre: TextView
    private lateinit var click: TextView
    private lateinit var post: TextView
    private lateinit var reco: TextView

    private lateinit var plan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kendi)

        save = findViewById(R.id.addContinue)

        plan = findViewById(R.id.btnPlan)

        PreLinear = findViewById(R.id.PreLayout)
        ClickLinear = findViewById(R.id.ClickedLayout)
        AudiLinear = findViewById(R.id.AudioLayout)



        pre = findViewById(R.id.Pre)
        post = findViewById(R.id.Audio)
        click = findViewById(R.id.Clicked)
        reco = findViewById(R.id.Recommendations)


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
            AudiLinear.visibility = View.GONE
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
            AudiLinear.visibility = View.VISIBLE
            ClickLinear.visibility = View.GONE
            PreLinear.visibility = View.GONE
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
            AudiLinear.visibility = View.GONE
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
            ClickLinear.visibility = View.GONE
            AudiLinear.visibility = View.GONE
            PreLinear.visibility = View.GONE
            reco.setTextColor(resources.getColor(R.color.white))
            val intent = Intent(this, ResumeSession::class.java)
            startActivity(intent)
        }

        plan.setOnClickListener {
            val intent = Intent(this, Plan::class.java)
            startActivity(intent)
        }
    }

    fun call(view: View){
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:+254 7123456789")
        startActivity(dialIntent)
    }
}