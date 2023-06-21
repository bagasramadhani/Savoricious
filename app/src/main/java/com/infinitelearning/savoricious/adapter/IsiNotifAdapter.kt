package com.infinitelearning.savoricious.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.infinitelearning.savoricious.Notif_Data
import com.infinitelearning.savoricious.R

class IsiNotifAdapter(private val notifList:ArrayList<Notif_Data>)
    : RecyclerView.Adapter<IsiNotifAdapter.NotifViewHolder>(){

    var onItemClick : ((Notif_Data) ->Unit)? = null

    class NotifViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.iv_notif)
        val textView : TextView = itemView.findViewById(R.id.tv_isinotif)
        val textView1 : TextView = itemView.findViewById(R.id.waktu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotifViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notifikasi, parent, false)
        return NotifViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotifViewHolder, position: Int) {
       val notif = notifList[position]
        holder.imageView.setImageResource(notif.image)
        holder.textView.text = notif.isinotif
        holder.textView1.text = notif.jam

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(notif)
        }
    }

    override fun getItemCount(): Int {
       return notifList.size
    }
}