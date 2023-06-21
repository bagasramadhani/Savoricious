package com.infinitelearning.savoricious

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class menukhusus : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menukhusus)

        btnIntent = findViewById(R.id.tinggi)
        btnIntent = findViewById(R.id.rendhah)
        btnIntent = findViewById(R.id.buttonburger_rendah)
        btnIntent = findViewById(R.id.buttonpizza_khusus)
        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tinggi -> run {
                val IntentBiasa = Intent(this@menukhusus, menukhusustinggi::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.rendhah -> run {
                val IntentBiasa = Intent(this@menukhusus, menukhusus::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.buttonburger_rendah-> run {
                val IntentBiasa = Intent(this@menukhusus, supjagung::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.buttonpizza_khusus-> run {
                val IntentBiasa = Intent(this@menukhusus, oatmelpsng::class.java)
                startActivity(IntentBiasa)
            }
        }
    }
}