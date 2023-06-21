package com.infinitelearning.savoricious

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.infinitelearning.savoricious.databinding.ActivityDetailItemBinding
import kotlinx.android.synthetic.main.card_item.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailItemBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail_item)

        val populer = intent.getParcelableExtra<Populer>("populer")
        if (populer != null) {
            val imageView: ImageView = findViewById(R.id.iv_profile)
            val textView: TextView = findViewById(R.id.nama)
            val imageView1: ImageView = findViewById(R.id.iv_item1)
            val textView1: TextView = findViewById(R.id.tv_nama_menu)
            val textView2: TextView = findViewById(R.id.tv_rating)
            val textView3: TextView = findViewById(R.id.tv_time)
            val textView4: TextView = findViewById(R.id.tv_eye2)


            imageView.setImageResource(populer.gambarprofile)
            textView.text = populer.nama
            imageView1.setImageResource(populer.gambarmenu)
            textView1.text = populer.namamenu
            textView2.text = populer.rating
            textView3.text = populer.waktu
            textView4.text = populer.penonton


        }
    }
}

