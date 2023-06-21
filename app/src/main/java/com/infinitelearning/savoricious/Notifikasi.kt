package com.infinitelearning.savoricious

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.infinitelearning.savoricious.adapter.IsiNotifAdapter

class Notifikasi : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var notifList : ArrayList<Notif_Data>
    private lateinit var notifAdapter: IsiNotifAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)

        recyclerView = findViewById(R.id.rv_notif)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        notifList = ArrayList()

        notifList.add(Notif_Data(R.drawable.bgnotiv1, "Ali, koneksi baru anda, membagikan posting yang mungkin menarik bagi anda.", "1 menit"))
        notifList.add(Notif_Data(R.drawable.bgnotiv2, "Nabila, Menyukai postingan anda.", "24 menit"))
        notifList.add(Notif_Data(R.drawable.bgnotiv3, "Bagas, koneksi baru anda, membagikan posting yang mungkin menarik bagi anda.", "34 menit"))
        notifList.add(Notif_Data(R.drawable.bgnotiv4, "Siti, koneksi baru anda, membagikan posting yang mungkin menarik bagi anda.", "54 menit"))

        notifAdapter = IsiNotifAdapter(notifList)
        recyclerView.adapter = notifAdapter


        notifAdapter.onItemClick = {
            val intent = Intent(this, DetailNotif::class.java)
            intent.putExtra("notif", it)
            startActivity(intent)



        }
        recyclerView = findViewById(R.id.rv_notif2)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        notifList = ArrayList()

        notifList.add(Notif_Data(R.drawable.bgnotiv1, "Ali, koneksi baru anda, membagikan posting yang mungkin menarik bagi anda.", "1 menit"))
        notifList.add(Notif_Data(R.drawable.bgnotiv2, "Nabila, Menyukai postingan anda.", "24 menit"))
        notifList.add(Notif_Data(R.drawable.bgnotiv3, "Bagas, koneksi baru anda, membagikan posting yang mungkin menarik bagi anda.", "34 menit"))
        notifList.add(Notif_Data(R.drawable.bgnotiv4, "Siti, koneksi baru anda, membagikan posting yang mungkin menarik bagi anda.", "54 menit"))

        notifAdapter = IsiNotifAdapter(notifList)
        recyclerView.adapter = notifAdapter


        notifAdapter.onItemClick = {
            val intent = Intent(this, DetailNotif::class.java)
            intent.putExtra("notif", it)
            startActivity(intent)



        }
    }

}

