package com.infinitelearning.savoricious.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.infinitelearning.savoricious.MenuClickListener
import com.infinitelearning.savoricious.MenuDetail
import com.infinitelearning.savoricious.databinding.CardItemBinding
import com.infinitelearning.savoricious.model.CardViewHolder

class CardAdapter (
    private val menu: List<MenuDetail>,
    private val clickListener: MenuClickListener)
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardItemBinding.inflate(from,parent, false)
        return  CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindMenuDetail(menu[position])
    }

    override fun getItemCount(): Int = menu.size
    }
