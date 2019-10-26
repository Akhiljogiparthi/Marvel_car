package com.example.marvel_cars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class user_vehicleadapter extends RecyclerView.Adapter<user_vehicleviewholder> {
    private LayoutInflater inflater;
    user_vehicleadapter(Context context){this.inflater=LayoutInflater.from(context);}
    @NonNull
    @Override
    public user_vehicleviewholder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View view = inflater.inflate(R.layout.user_vehiclevh, parent, false);
        return new user_vehicleviewholder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull user_vehicleviewholder holder, int position) {
        user_vehicledata vehicle1 = user_datasource.getInstance().vehicle.get(position);

        holder.tView4.setText(String.valueOf(vehicle1.Name));
        holder.tView5.setText(String.valueOf(vehicle1.price));
        holder.tView6.setText(String.valueOf(vehicle1.seats));
    }

    @Override
    public int getItemCount() {
        return user_datasource.getInstance().vehicle.size();
    }
}
