package com.example.marvel_cars;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class emp_customerlist_adapter extends RecyclerView.Adapter<emp_customerlist_adapter.customerviewholder> {
    private int[] cus;

    public emp_customerlist_adapter(int[] customers) { this.cus = customers;
    }

    @Override
    public emp_customerlist_adapter.customerviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.emp_cl_adapter, parent, false);
        customerviewholder customer = new customerviewholder(view);
        return customer;
    }

    @Override
    public void onBindViewHolder(@NonNull emp_customerlist_adapter.customerviewholder holder, int position) {
        holder.tView7.setText("Name:mad" + (position + 1));
        holder.tView8.setText("Email:mad12" + (position + 1) + "@cegep.com");
        holder.tView9.setText("Ph No:123456789" + position);

    }

    @Override
    public int getItemCount() {
        return cus.length;
    }

    public static class customerviewholder extends RecyclerView.ViewHolder {
        TextView tView7;
        TextView tView8;
        TextView tView9;


        public customerviewholder(@NonNull View itemView) {
            super(itemView);
            tView7 = itemView.findViewById(R.id.tView7);
            tView8 = itemView.findViewById(R.id.tView8);
            tView9= itemView.findViewById(R.id.tView9);
        }
    }
}
