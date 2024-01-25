package com.example.mydoctor.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import com.example.mydoctor.R
import com.example.mydoctor.doctor.FullDetails
import com.example.mydoctor.doctor.Home
import com.example.mydoctor.doctor.Kardex
import com.example.mydoctor.doctor.Kendi
import com.example.mydoctor.doctor.Nurse
import com.example.mydoctor.doctor.OnlineAppointments
import com.example.mydoctor.doctor.PhysicalAppointments
import com.example.mydoctor.doctor.Plan
import com.example.mydoctor.doctor.ResumeSession
import com.example.mydoctor.doctor.SymptomChecker
import com.example.mydoctor.doctor.SymptomCheckerRequest
import com.example.mydoctor.doctor.WaitingRoom

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAGS_CHANGED
        )
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SliderActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}