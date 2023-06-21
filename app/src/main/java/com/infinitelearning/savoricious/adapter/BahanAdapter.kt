package com.infinitelearning.savoricious.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.infinitelearning.savoricious.R
import com.infinitelearning.savoricious.model.ModelBahan

class BahanAdapter (var data : ArrayList<ModelBahan>, var context: Activity?)
    : RecyclerView.Adapter<BahanAdapter.MyViewHolder>() {

    class MyViewHolder (view : View) : RecyclerView.ViewHolder(view){
        val namabahan = view.findViewById<TextView>(R.id.tv_nama)
        val gambarbahan = view.findViewById<ImageView>(R.id.iv_gambar)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.namabahan.text = data[position].namabahan
        holder.gambarbahan.setImageResource(data[position].gambarbahan)

//        holder.cardView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.anim_rv));
    }

    override fun getItemCount(): Int {
        return data.size
    }


}