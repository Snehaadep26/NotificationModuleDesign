package com.example.notificationmoduledesign.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notificationmoduledesign.JavaClass.AllNotificationCardP1;
import com.example.notificationmoduledesign.JavaClass.AnnouncementCardP2;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;

public class AnnouncementCardAdapterP2 extends RecyclerView.Adapter<AnnouncementCardAdapterP2.CardViewHolder> {

    ArrayList<AnnouncementCardP2> returned;
    Context context;

    public AnnouncementCardAdapterP2(ArrayList<AnnouncementCardP2> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public AnnouncementCardAdapterP2.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.today_cardp2 ,parent,false);
        AnnouncementCardAdapterP2.CardViewHolder cvh = new AnnouncementCardAdapterP2.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull AnnouncementCardAdapterP2.CardViewHolder holder, int position) {
        AnnouncementCardP2 currentCards = this.returned.get(position);
        holder.infoTextP2.setText(currentCards.getInfoTextP2());
        holder.timeTextP2.setText(currentCards.getTimeTextP2());
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

        TextView todayTextP2,infoTextP2,timeTextP2;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            infoTextP2=itemView.findViewById(R.id.infoTextP2);
            timeTextP2=itemView.findViewById(R.id.timeTextP2);


        }
    }
}
