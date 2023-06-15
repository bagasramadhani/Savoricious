package com.infinitelearning.savoricious.model

import androidx.recyclerview.widget.RecyclerView
import com.infinitelearning.savoricious.MenuClickListener
import com.infinitelearning.savoricious.MenuDetail
import com.infinitelearning.savoricious.databinding.CardItemBinding
import kotlinx.android.synthetic.main.activity_tambah_resep.view.*
import kotlinx.android.synthetic.main.card_item.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class CardViewHolder(
    private val cardItemBinding: CardItemBinding,
    private val clickListener: MenuClickListener
) : RecyclerView.ViewHolder(cardItemBinding.root)
{
    fun bindMenuDetail(menu1: MenuDetail)
    {

        cardItemBinding.nama.text = menu1.nama

        cardItemBinding.tvNamaMenu.text = menu1.namamenu
        cardItemBinding.tvRating.text = menu1.rating
        cardItemBinding.tvTime.text = menu1.waktu
        cardItemBinding.tvEye2.text = menu1.dilihat

        cardItemBinding.cardItem.setOnClickListener {
            clickListener.onClick(menu1)
        }

    }

}