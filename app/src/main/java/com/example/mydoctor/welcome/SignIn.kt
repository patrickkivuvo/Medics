package com.example.mydoctor.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mydoctor.R

class SignIn : AppCompatActivity() {
    private lateinit var LogInLinear: LinearLayout
    private lateinit var SignUpLinear: LinearLayout
    private lateinit var logn: TextView
    private lateinit var signp: TextView

    private lateinit var forgotpassword: TextView

    private lateinit var signin: Button
    private lateinit var back: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        signp = findViewById(R.id.signUp)
        logn = findViewById(R.id.login)
        LogInLinear = findViewById(R.id.logInLayout)
        SignUpLinear = findViewById(R.id.SignUpLayout)
        back = findViewById(R.id.back)
        signin = findViewById(R.id.btnSignIn)
        forgotpassword = findViewById(R.id.forgot)


        logn.setOnClickListener {
            signp.background = null
            signp.setTextColor(resources.getColor(R.color.textColor))
            logn.background = resources.getDrawable(R.drawable.switch_trcks, null)
            LogInLinear.visibility = View.VISIBLE
            SignUpLinear.visibility = View.GONE
            logn.setTextColor(resources.getColor(R.color.white))
        }
        signp.setOnClickListener {
            signp.background = resources.getDrawable(R.drawable.switch_trcks, null)
            signp.setTextColor(resources.getColor(R.color.white))
            logn.background = null
            LogInLinear.visibility = View.GONE
            SignUpLinear.visibility = View.VISIBLE
            logn.setTextColor(resources.getColor(R.color.textColor))
        }

        signin.setOnClickListener {
            val intent = Intent(this, Congrats::class.java)
            startActivity(intent)
        }

        forgotpassword.setOnClickListener {
            val intent = Intent(this, ForgortPassword::class.java)
            startActivity(intent)
        }

        back.setOnClickListener {
            val intent = Intent(this, Welcome::class.java)
            startActivity(intent)
        }
    }
}