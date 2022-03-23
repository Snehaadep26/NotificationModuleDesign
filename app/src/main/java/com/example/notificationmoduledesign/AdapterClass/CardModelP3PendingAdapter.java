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

import com.example.notificationmoduledesign.JavaClass.CardModelPendingP3;
import com.example.notificationmoduledesign.R;

import java.util.ArrayList;

public class CardModelP3PendingAdapter extends RecyclerView.Adapter<CardModelP3PendingAdapter.RecyclerViewHolder> {
    ArrayList<CardModelPendingP3> cardModelPendingP3s;
    private OnButtonClickedListener onButtonClickedListener;


    public CardModelP3PendingAdapter(ArrayList<CardModelPendingP3> cardModelPendingP3s, Context context) {
        this.cardModelPendingP3s = cardModelPendingP3s;
    }

    public interface OnButtonClickedListener {
        void onRejectClicked(int position);

        void onApproveClick(int position);
    }

    public void setOnItemClickedListener(OnButtonClickedListener listener) {
        onButtonClickedListener = listener;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pending_cardp3, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,onButtonClickedListener);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        CardModelPendingP3 current = cardModelPendingP3s.get(position);

        holder.name.setText(current.getName());
        holder.number.setText(current.getNumber());
        holder.classTv.setText(current.getStd());
        holder.subject.setText(current.getSubject());
        holder.date.setText(current.getDate());
        holder.time.setText(current.getTime());
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

            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);
            classTv = itemView.findViewById(R.id.classTV);
            subject = itemView.findViewById(R.id.subject);
            date = itemView.findViewById(R.id.date);
            time = itemView.findViewById(R.id.time);
            rejectButton = itemView.findViewById(R.id.rejectButton);
            approveButton = itemView.findViewById(R.id.approveButton);

            rejectButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onRejectClicked(position);
                        }
                    }
                    Toast.makeText(itemView.getContext(), "\u0058 Rejected", Toast.LENGTH_SHORT).show();
                }
            });

            approveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onApproveClick(position);
                        }
                    }
                    Toast.makeText(itemView.getContext(), "\u2713 Approved", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
