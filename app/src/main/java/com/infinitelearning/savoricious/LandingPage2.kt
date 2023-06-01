package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LandingPage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page2)

        val btn_lanjut = findViewById<Button>(R.id.btn_lanjut)

        btn_lanjut.setOnClickListener {
            startActivity(Intent(this, LandingPage3::class.java))
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)

        }
    }
}