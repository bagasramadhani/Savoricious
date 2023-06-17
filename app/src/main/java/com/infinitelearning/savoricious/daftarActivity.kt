package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class daftarActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btndaftar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        btndaftar = findViewById(R.id.button5a)

        btndaftar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button5a ->{
                val intentmasuk = Intent(this@daftarActivity, SignIn_Page::class.java)
                startActivity(intentmasuk)
            }
        }

    }
}