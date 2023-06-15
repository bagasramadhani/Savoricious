package com.infinitelearning.savoricious

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailNotif : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_notif)

        // supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)

        val IsiNotif = intent.getParcelableExtra<IsiNotif>(Notifikasi.INTENT_PARCELABLE)

        val imgIsiNotif = findViewById<ImageView>(R.id.iv_notif)
        val isiIsiNotif = findViewById<TextView>(R.id.tv_isinotif)
        val waktuIsiNotif = findViewById<TextView>(R.id.waktu)

        imgIsiNotif.setImageResource(IsiNotif?.imgIsiNotif!!)
        isiIsiNotif.text = IsiNotif.isiIsiNotif
        waktuIsiNotif.text = IsiNotif.waktuIsiNotif
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}