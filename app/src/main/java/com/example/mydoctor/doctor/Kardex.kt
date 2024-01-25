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
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Kardex : AppCompatActivity() {
    private lateinit var bac: ImageView
    private lateinit var save: Button
    private lateinit var save1: Button

    private lateinit var PreLinear: LinearLayout
    private lateinit var ClickLinear: LinearLayout
    private lateinit var PostLinear: LinearLayout
    private lateinit var RecLinear: LinearLayout

    private lateinit var pre: TextView
    private lateinit var click: TextView
    private lateinit var post: TextView
    private lateinit var reco: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kardex)
        bac = findViewById(R.id.back)
        save = findViewById(R.id.btnGoHom)
        save1 = findViewById(R.id.btnGoHome)

        PreLinear = findViewById(R.id.PreLayout)
        ClickLinear = findViewById(R.id.ClickedLayout)
        PostLinear = findViewById(R.id.PostLayout)
        RecLinear = findViewById(R.id.RecommendationsLayout)


        pre = findViewById(R.id.Pre)
        post = findViewById(R.id.Post)
        click = findViewById(R.id.Clicked)
        reco = findViewById(R.id.Recommendations)

        save.setOnClickListener {
            Toast.makeText(this, "Saved Successfully!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        save1.setOnClickListener {
            Toast.makeText(this, "Saved Successfully!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }


        bac.setOnClickListener {
            val intent = Intent(this, MySessions::class.java)
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


    }
}