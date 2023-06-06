package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LandingPage3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page3)

        val btn_daftar = findViewById<Button>(R.id.btn_daftar)

        btn_daftar.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)

        }
    }
}