package com.infinitelearning.savoricious.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.infinitelearning.savoricious.Notif_Data
import com.infinitelearning.savoricious.Populer
import com.infinitelearning.savoricious.R
import com.infinitelearning.savoricious.model.ModelBahan

class PopulerAdapter (var populerList : ArrayList<Populer>, var context: Activity?)
        : RecyclerView.Adapter<PopulerAdapter.PopulerViewHolder>(){

    var onItemClick : ((Populer) ->Unit)? = null

    class PopulerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.iv_profile)
        val textView : TextView = itemView.findViewById(R.id.nama)
        val imageView1 : ImageView = itemView.findViewById(R.id.iv_item1)
        val textView1 : TextView = itemView.findViewById(R.id.tv_nama_menu)
        val textView2 : TextView = itemView.findViewById(R.id.tv_rating)
        val textView3 : TextView = itemView.findViewById(R.id.tv_time)
        val textView4 : TextView = itemView.findViewById(R.id.tv_eye2)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopulerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return PopulerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopulerViewHolder, position: Int) {
        val populer = populerList[position]
        holder.imageView.setImageResource(populer.gambarprofile)
        holder.textView.text = populer.nama
        holder.imageView1.setImageResource(populer.gambarmenu)
        holder.textView1.text = populer.namamenu
        holder.textView2.text = populer.rating
        holder.textView3.text = populer.waktu
        holder.textView4.text = populer.penonton

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(populer)
        }
    }

    override fun getItemCount(): Int {
        return populerList.size
    }
}
