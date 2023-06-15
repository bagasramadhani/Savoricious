package com.infinitelearning.savoricious

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.infinitelearning.savoricious.databinding.ActivityDetailItemBinding
import kotlinx.android.synthetic.main.card_item.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menuID = intent.getIntExtra(MENU_ID_EXTRA, -1)
        val menu = menuFromID(menuID)
        if(menu != null)
        {

            binding.nama.text = menu.nama

            binding.tvNamaMenu.text = menu.namamenu
            binding.tvRating.text = menu.rating
            binding.tvTime.text = menu.waktu
            binding.tvEye2.text = menu.dilihat
            binding.tvDetailResep1.text = menu.description

        }
    }
    private fun menuFromID(menuID: Int): MenuDetail?
    {
        for(menu in menuDetaillist)
        {
            if(menu.id == menuID)
                return menu
        }
        return null
    }
}