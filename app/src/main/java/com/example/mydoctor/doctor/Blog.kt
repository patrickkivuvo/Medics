package com.example.mydoctor.doctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.mydoctor.R

class Blog : AppCompatActivity() {
    private lateinit var Atic: TextView
    private lateinit var New: TextView

    private lateinit var back: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        Atic = findViewById(R.id.Articles)
        New = findViewById(R.id.News)

        back = findViewById(R.id.back)


        Atic.setOnClickListener {
            New.background = null
            New.setTextColor(resources.getColor(R.color.textColor))
            Atic.background = resources.getDrawable(R.drawable.switch_trcks, null)
            Atic.setTextColor(resources.getColor(R.color.white))
        }
        New.setOnClickListener {
            New.background = resources.getDrawable(R.drawable.switch_trcks, null)
            New.setTextColor(resources.getColor(R.color.white))
            Atic.background = null
            Atic.setTextColor(resources.getColor(R.color.textColor))
        }
    }
}