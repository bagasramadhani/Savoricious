package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class menuminuman : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuminuman)

        btnIntent = findViewById(R.id.buttonLihat1a_mnm)
        btnIntent = findViewById(R.id.buttonLihat21a_mnm)
        btnIntent = findViewById(R.id.buttonLihat31a_mnm)
        btnIntent.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.buttonLihat1a_mnm -> run {
                val IntentBiasa = Intent(this@menuminuman, eskuwut::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.buttonLihat21a_mnm -> run {
                val IntentBiasa = Intent(this@menuminuman, eslaksamanamangga::class.java)
                startActivity(IntentBiasa)
            }
        }
        when (v!!.id) {
            R.id.buttonLihat31a_mnm -> run {
                val IntentBiasa = Intent(this@menuminuman, sarangbuah::class.java)
                startActivity(IntentBiasa)
            }
        }
    }
}