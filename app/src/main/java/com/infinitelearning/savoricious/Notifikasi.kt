package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.infinitelearning.savoricious.adapter.NotifAdapter

class Notifikasi : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)

        val isiNotifList = listOf<IsiNotif>(
            IsiNotif(
                R.drawable.bgnotiv1,
                "Ali, koneksi baru anda, membagikan posting yang mungkin menarik bagi anda.",
                "1 menit"
            ),

            IsiNotif(
                R.drawable.bgnotiv2,
                "Nabila, menyukai postingan anda.",
                "24 menit"
            ),

            IsiNotif(
                R.drawable.bgnotiv3,
                "Bagas, koneksi baru anda, membagikan posting yang mungkin menarik bagi anda.",
                "34 menit"
            ),

            IsiNotif(
                R.drawable.bgnotiv4,
                "Siti, koneksi baru anda, membagikan posting yang mungkin menarik bagi anda.",
                "53 menit"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_notif)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = NotifAdapter( this, isiNotifList){
            val intent = Intent ( this, DetailNotif::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}