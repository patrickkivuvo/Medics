package com.example.mydoctor.doctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.mydoctor.R

class PhysioSession : AppCompatActivity() {
    private lateinit var PreLinear: LinearLayout
    private lateinit var SessionLinear: LinearLayout
    private lateinit var PostLinear: LinearLayout
    private lateinit var SumLinear: LinearLayout

    private lateinit var pre: TextView
    private lateinit var session: TextView
    private lateinit var post: TextView
    private lateinit var summary: TextView

    private lateinit var save: Button
    private lateinit var save1: Button
    private lateinit var save2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physio_session)

        PreLinear = findViewById(R.id.PreLayout)
        SessionLinear = findViewById(R.id.SessionsLayout)
        PostLinear = findViewById(R.id.PostLayout)
        SumLinear = findViewById(R.id.SummaryLayout)


        pre = findViewById(R.id.Pre)
        post = findViewById(R.id.Post)
        session = findViewById(R.id.Session)
        summary = findViewById(R.id.Recommendations)

        save = findViewById(R.id.Home)
        save1 = findViewById(R.id.btnHome)
        save2 = findViewById(R.id.btnGoHome)


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

        save2.setOnClickListener {
            Toast.makeText(this, "Saved Successfully!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        pre.setOnClickListener {
            post.background = null
            session.background = null
            summary.background = null
            post.setTextColor(resources.getColor(R.color.textColor))
            session.setTextColor(resources.getColor(R.color.textColor))
            summary.setTextColor(resources.getColor(R.color.textColor))
            pre.background = resources.getDrawable(R.drawable.switch_trcks, null)
            PreLinear.visibility = View.VISIBLE
            SessionLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
            SumLinear.visibility = View.GONE
            pre.setTextColor(resources.getColor(R.color.white))
        }
        post.setOnClickListener {
            pre.background = null
            session.background = null
            summary.background = null
            pre.setTextColor(resources.getColor(R.color.textColor))
            session.setTextColor(resources.getColor(R.color.textColor))
            summary.setTextColor(resources.getColor(R.color.textColor))
            post.background = resources.getDrawable(R.drawable.switch_trcks, null)
            PostLinear.visibility = View.VISIBLE
            SessionLinear.visibility = View.GONE
            PreLinear.visibility = View.GONE
            SumLinear.visibility = View.GONE
            post.setTextColor(resources.getColor(R.color.white))
        }
        session.setOnClickListener {
            post.background = null
            pre.background = null
            summary.background = null
            post.setTextColor(resources.getColor(R.color.textColor))
            pre.setTextColor(resources.getColor(R.color.textColor))
            summary.setTextColor(resources.getColor(R.color.textColor))
            session.background = resources.getDrawable(R.drawable.switch_trcks, null)
            SessionLinear.visibility = View.VISIBLE
            PreLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
            SumLinear.visibility = View.GONE
            session.setTextColor(resources.getColor(R.color.white))
        }

        summary.setOnClickListener {
            post.background = null
            session.background = null
            pre.background = null
            post.setTextColor(resources.getColor(R.color.textColor))
            session.setTextColor(resources.getColor(R.color.textColor))
            pre.setTextColor(resources.getColor(R.color.textColor))
            summary.background = resources.getDrawable(R.drawable.switch_trcks, null)
            SumLinear.visibility = View.VISIBLE
            SessionLinear.visibility = View.GONE
            PostLinear.visibility = View.GONE
            PreLinear.visibility = View.GONE
            summary.setTextColor(resources.getColor(R.color.white))
        }
    }
}