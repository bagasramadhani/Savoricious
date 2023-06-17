package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SignIn_Page : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn6: Button
    private lateinit var btn3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_page)

        btn6 = findViewById(R.id.button6)
        btn3= findViewById(R.id.button3)



        btn6.setOnClickListener(this)
        btn3.setOnClickListener(this)

    }


    override fun onClick(v: View) {
        when(v.id){
            R.id.button6 -> {
                val intentdaftar = Intent (this@SignIn_Page, daftarActivity::class.java)
                startActivity (intentdaftar)
            }
            R.id.button3 ->{
                val intentdaftar1 = Intent(this@SignIn_Page, daftarActivity::class.java)
                startActivity(intentdaftar1)
            }
        }


    }

}