package com.example.notificationmoduledesign.AdapterClass;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notificationmoduledesign.JavaClass.AllNotificationCardP1;
import com.example.notificationmoduledesign.MainActivities.MainActivityP2;
import com.example.notificationmoduledesign.MainActivities.MainActivityP3;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;

public class AllNotifiCardAdapterP1 extends RecyclerView.Adapter<AllNotifiCardAdapterP1.CardViewHolder> {

    ArrayList<AllNotificationCardP1> returned;
    Context context;

    public AllNotifiCardAdapterP1(ArrayList<AllNotificationCardP1> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_cardp1 ,parent,false);
        CardViewHolder cvh = new CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        AllNotificationCardP1 currentCards = this.returned.get(position);
        holder.titleTextP1.setText(currentCards.getTitleTextP1());
        holder.dateTextP1.setText(currentCards.getDateTextP1());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, MainActivityP3.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(intent);

            }
        });
    }

//    @Override
//    public int getItemCount() {
//        return 0;
//    }

        @Override
    public int getItemCount() {
        return returned.size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageForP1Card;
        TextView titleTextP1,dateTextP1;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextP1=itemView.findViewById(R.id.categoriesTextP11);
            dateTextP1=itemView.findViewById(R.id.dateTextP11);


        }
    }
}
