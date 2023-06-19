package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LandingPage3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page3)

        val btn_daftar = findViewById<Button>(R.id.btn_daftar)

        btn_daftar.setOnClickListener {
            startActivity(Intent(this, daftarActivity::class.java))
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)

        }

        val btn_masuk = findViewById<TextView>(R.id.buttonmasuk)

        btn_masuk.setOnClickListener {
            startActivity(Intent(this, SignIn_Page::class.java))
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)

        }
    }
}