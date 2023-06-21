package com.infinitelearning.savoricious

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class menukhusustinggi : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menukhusustinggi)


        btnIntent = findViewById(R.id.tinggi)
        btnIntent = findViewById(R.id.rendhah)
        btnIntent = findViewById(R.id.buttonburger)
        btnIntent = findViewById(R.id.buttonpizza)
        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tinggi -> run {
                val IntentBiasa = Intent(this@menukhusustinggi, menukhusustinggi::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.rendhah -> run {
                val IntentBiasa = Intent(this@menukhusustinggi, menukhusus::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.buttonburger-> run {
                val IntentBiasa = Intent(this@menukhusustinggi, resepburger::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.buttonpizza-> run {
                val IntentBiasa = Intent(this@menukhusustinggi, pizzaayam::class.java)
                startActivity(IntentBiasa)
            }
        }
    }
}