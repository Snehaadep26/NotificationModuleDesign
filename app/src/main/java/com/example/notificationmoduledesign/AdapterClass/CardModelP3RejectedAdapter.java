package com.example.notificationmoduledesign.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notificationmoduledesign.JavaClass.CardModelRejectedP3;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;

public class CardModelP3RejectedAdapter extends RecyclerView.Adapter<CardModelP3RejectedAdapter.RecyclerViewHolder> {
    ArrayList<CardModelRejectedP3> cardModelPendingP3s;
    private CardModelP3RejectedAdapter.OnButtonClickedListener onButtonClickedListener;


    public CardModelP3RejectedAdapter(ArrayList<CardModelRejectedP3> cardModelPendingP3s, Context context) {
        this.cardModelPendingP3s = cardModelPendingP3s;
    }

    public interface OnButtonClickedListener {
        void onRejectClicked(int position);

        void onApproveClick(int position);
    }



    @NonNull
    @Override
    public CardModelP3RejectedAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rejected_cardp3, parent, false);
        CardModelP3RejectedAdapter.RecyclerViewHolder recyclerViewHolder = new CardModelP3RejectedAdapter.RecyclerViewHolder(view,onButtonClickedListener);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardModelP3RejectedAdapter.RecyclerViewHolder holder, int position) {
        CardModelRejectedP3 current = cardModelPendingP3s.get(position);

        holder.name.setText(current.getNameRU());
        holder.number.setText(current.getNumberRU());

        holder.date.setText(current.getDateRU());
        holder.time.setText(current.getTimeRU());
    }

    @Override
    public int getItemCount() {
        return cardModelPendingP3s.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView name, number, classTv, subject, date, time;
        Button rejectButton, approveButton;

        public RecyclerViewHolder(@NonNull View itemView, OnButtonClickedListener listener) {
            super(itemView);

            name = itemView.findViewById(R.id.nameRU);

            number = itemView.findViewById(R.id.numberRU);
            classTv = itemView.findViewById(R.id.classTVRU);
            subject = itemView.findViewById(R.id.subjectRU);
            date = itemView.findViewById(R.id.dateRU);
            time = itemView.findViewById(R.id.timeRU);
            rejectButton = itemView.findViewById(R.id.rejectButtonRU);

//            rejectButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (listener != null) {
//                        int position = getAdapterPosition();
//                        if (position != RecyclerView.NO_POSITION) {
//                            listener.onRejectClicked(position);
//                        }
//                    }
//                    Toast.makeText(itemView.getContext(), "\u0058 Rejected", Toast.LENGTH_SHORT).show();
//                }
//            });
//
//            approveButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (listener != null){
//                        int position = getAdapterPosition();
//                        if (position != RecyclerView.NO_POSITION){
//                            listener.onApproveClick(position);
//                        }
//                    }
//                    Toast.makeText(itemView.getContext(), "\u2713 Approved", Toast.LENGTH_SHORT).show();
//                }
//            });
        }
    }
}
