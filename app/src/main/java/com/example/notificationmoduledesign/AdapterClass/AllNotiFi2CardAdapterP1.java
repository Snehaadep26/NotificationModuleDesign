package com.example.notificationmoduledesign.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notificationmoduledesign.JavaClass.AllNotiFi2CardP1;
import com.example.notificationmoduledesign.JavaClass.AllNotificationCardP1;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;

public class AllNotiFi2CardAdapterP1 extends RecyclerView.Adapter<AllNotiFi2CardAdapterP1.CardViewHolder> {

    ArrayList<AllNotiFi2CardP1> returned;
    Context context;

    public AllNotiFi2CardAdapterP1(ArrayList<AllNotiFi2CardP1> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public AllNotiFi2CardAdapterP1.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.allnoti_cardp1 ,parent,false);
        AllNotiFi2CardAdapterP1.CardViewHolder cvh = new AllNotiFi2CardAdapterP1.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        AllNotiFi2CardP1 currentCards = this.returned.get(position);
        holder.imageForP1Card.setImageResource(currentCards.getAllNotiImgP1());
        holder.allNotiTextP1.setText(currentCards.getAllNotiTextP1());
        holder.viewTextP1.setText(currentCards.getViewTextP1());
        holder.dateTextP1.setText(currentCards.getDateTextP1());
        holder.timeTextP1.setText(currentCards.getTimeTextP1());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(context, MainActivityP2.class);
//                context.startActivity(intent);
//
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return returned.size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageForP1Card;
        TextView allNotiTextP1,viewTextP1,dateTextP1,timeTextP1;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageForP1Card=itemView.findViewById(R.id.allNotiImgP1);
            allNotiTextP1=itemView.findViewById(R.id.allNotiTextP1);
            viewTextP1=itemView.findViewById(R.id.viewTextP1);
            dateTextP1=itemView.findViewById(R.id.allNotidateTextP1);
            timeTextP1=itemView.findViewById(R.id.allNotitimeTextP1);


        }
    }
}
