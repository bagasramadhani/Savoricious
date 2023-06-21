package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class menukue : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menukue)

        btnIntent = findViewById(R.id.buttonLihat1a_kue)
        btnIntent = findViewById(R.id.buttonLihat21a_kue)
        btnIntent = findViewById(R.id.buttonLihat31a_kue)
        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.buttonLihat1a_kue -> run {
                val IntentBiasa = Intent(this@menukue, pieteler::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.buttonLihat21a_kue -> run {
                val IntentBiasa = Intent(this@menukue, bikaambon::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.buttonLihat31a_kue -> run {
                val IntentBiasa = Intent(this@menukue, lumpurlabu::class.java)
                startActivity(IntentBiasa)
            }
        }
    }
}