package com.infinitelearning.savoricious.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.infinitelearning.savoricious.IsiNotif
import com.infinitelearning.savoricious.R

class NotifAdapter (private val context: Context, private val isiNotif: List<IsiNotif>, val listener:(IsiNotif) -> Unit)
    : RecyclerView.Adapter<NotifAdapter.IsiNotifViewHolder>(){

        class IsiNotifViewHolder (view: View): RecyclerView.ViewHolder(view){
            val imgIsiNotif = view.findViewById<ImageView>(R.id.iv_notif)
            val isiIsiNotif = view.findViewById<TextView>(R.id.tv_isinotif)
            val waktuIsiNotif = view.findViewById<TextView>(R.id.waktu)

            fun bindView(isiNotif: IsiNotif, listener: (IsiNotif) -> Unit){
                imgIsiNotif.setImageResource(isiNotif.imgIsiNotif)
                isiIsiNotif.text = isiNotif.isiIsiNotif
                waktuIsiNotif.text = isiNotif.waktuIsiNotif
                itemView.setOnClickListener {
                    (listener(isiNotif))
                }

            }


        }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IsiNotifViewHolder {
         TODO("Not yet implemented")
     }

    override fun onBindViewHolder(holder: IsiNotifViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}