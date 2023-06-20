package com.infinitelearning.savoricious

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_home.*

class DetailNotif : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_notif)

        val notif = intent.getParcelableExtra<Notif_Data>("notif")
        if (notif != null) {
            val textView: TextView = findViewById(R.id.tv_isinotif)
            val textView1: TextView = findViewById(R.id.waktu)
            val imageView: ImageView = findViewById(R.id.iv_notif)


            textView.text = notif.isinotif
            textView1.text = notif.jam
            imageView.setImageResource(notif.image)
        }
    }
}