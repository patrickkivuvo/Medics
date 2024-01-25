package com.example.mydoctor.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import com.example.mydoctor.R

class SliderActivity : AppCompatActivity() {
    private val introSliderAdapter = IntroSliderAdapter(
    listOf(
        IntroSlide(
            "24/7 Virtual HealthCare",
            "Talk to a HealthCare Practitioner anywhere and anytime",
            R.drawable.doctor17
        ),
        IntroSlide(
            "Home Care Services",
            "Home Based Care Services on the go",
            R.drawable.doctor11
        ),
        IntroSlide(
            "Appointments",
            "Choose where and when to see your doctor ",
            R.drawable.heart24
        )
    )
)

    private lateinit var introSlider: ViewPager2
    private lateinit var next: Button
    private lateinit var nxt: TextView
    private lateinit var skp: TextView
    private lateinit var layout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider)

        introSlider = findViewById(R.id.introSliderViewPager2)
        nxt = findViewById(R.id.Next)
        skp = findViewById(R.id.Skip)
        layout = findViewById(R.id.indicatorsContainer)
        introSlider.adapter = introSliderAdapter
        setupIndicators()
        setCurrentIndicator(0)
        introSlider.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
    }

    private fun setupIndicators(){
        val indicators = arrayOfNulls<ImageView>(introSliderAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        layoutParams.setMargins(8,0,8,0)
        for (i in indicators.indices){
            indicators[i] = ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
                this?.layoutParams = layoutParams
            }
            layout.addView(indicators[i])
        }


        nxt.setOnClickListener {
            skp.background = null
            skp.setTextColor(resources.getColor(R.color.textColor))
            nxt.setTextColor(resources.getColor(R.color.white))
            nxt.background = resources.getDrawable(R.drawable.switch_trcks, null)
            if (introSlider.currentItem + 1 <introSliderAdapter.itemCount){
                introSlider.currentItem += 1
            }else{
                val intent = Intent(this, Welcome::class.java)
                startActivity(intent)
            }
        }

        skp.setOnClickListener {
            skp.background = resources.getDrawable(R.drawable.switch_trcks, null)
            skp.setTextColor(resources.getColor(R.color.white))
            nxt.background = null
            nxt.setTextColor(resources.getColor(R.color.textColor))
            val intent = Intent(this, Welcome::class.java)
            startActivity(intent)
        }


    }
    private fun setCurrentIndicator(index: Int){
        val childCount = layout.childCount
        for (i in 0 until childCount){
            val imageView = layout[i] as ImageView
            if (i == index){
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_active
                    )
                )
            }else{
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
            }
        }
    }

}