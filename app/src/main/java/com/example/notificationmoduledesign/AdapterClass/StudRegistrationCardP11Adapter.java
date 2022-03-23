package com.example.notificationmoduledesign.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notificationmoduledesign.JavaClass.StudRegistrationCardP11;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;

public class StudRegistrationCardP11Adapter extends RecyclerView.Adapter<StudRegistrationCardP11Adapter.CardViewHolder> {

    ArrayList<StudRegistrationCardP11> returned;
    Context context;

    public StudRegistrationCardP11Adapter(ArrayList<StudRegistrationCardP11> returned, Context context) {
        this.returned = returned;
        this.context=context;
    }


    @NonNull
    @Override
    public StudRegistrationCardP11Adapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reg_cardp11 ,parent,false);
        StudRegistrationCardP11Adapter.CardViewHolder cvh = new StudRegistrationCardP11Adapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        StudRegistrationCardP11 currentCards = this.returned.get(position);
        holder.nametext.setText(currentCards.getName());
        holder.phoneText.setText(currentCards.getPhone());
        holder.subText.setText(currentCards.getSubDate());
        holder.subTime.setText(currentCards.getSubTime());
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

        TextView nametext,phoneText,subText,subTime;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            nametext=itemView.findViewById(R.id.nameRU11);
            phoneText=itemView.findViewById(R.id.numberRU11);
            subText=itemView.findViewById(R.id.dateRU11);
            subTime=itemView.findViewById(R.id.timeRU11);


        }
    }
}
