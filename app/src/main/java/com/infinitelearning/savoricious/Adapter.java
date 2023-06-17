package com.infinitelearning.savoricious;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class holder extends RecyclerView.ViewHolder{

    ImageView img;
    TextView txtname, txtDec;
    Button btn;

    public holder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.image_makanan);
        img = itemView.findViewById(R.id.nasigoreng);
        img = itemView.findViewById(R.id.image_makanan2);
        img = itemView.findViewById(R.id.telur);
        img = itemView.findViewById(R.id.image_makanan3);
        img = itemView.findViewById(R.id.sup);
        img = itemView.findViewById(R.id.image_makanan);
        txtname = itemView.findViewById(R.id.textnasi);
        txtname = itemView.findViewById(R.id.textasin);
        txtname = itemView.findViewById(R.id.texttelur);
        txtname = itemView.findViewById(R.id.textsup);
        txtname = itemView.findViewById(R.id.textmerah);
        txtDec = itemView.findViewById(R.id.decresepnasi);
        txtDec = itemView.findViewById(R.id.deckampung);
        txtDec = itemView.findViewById(R.id.tdecreseptelur);
        txtDec = itemView.findViewById(R.id.decbalado);
        txtDec = itemView.findViewById(R.id.decsup);
        txtDec = itemView.findViewById(R.id.deckuah);
        btn = itemView.findViewById(R.id.buttonLihat1);
        btn = itemView.findViewById(R.id.buttonLihat2);
        btn = itemView.findViewById(R.id.buttonLihat3);
        btn = itemView.findViewById(R.id.buttonLBN);

    }
}

public class Adapter extends RecyclerView.Adapter<holder> {

    Context context ;
    ArrayList<makanan> Listmakanan;

    public Adapter(Context context, ArrayList<makanan> listmakanan) {
        this.context = context;
        Listmakanan = listmakanan;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_makanan,parent,false);
        return new holder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        makanan Makanan = Listmakanan.get(position);
        holder.img.setImageResource(Makanan.getImage());
        holder.btn.setBottom(Makanan.getButton());
        holder.txtname.setText(Makanan.getNama());
        holder.txtDec.setText(Makanan.getDescription());

    }

    @Override
    public int getItemCount() {
        return Listmakanan.size();
    }
}


