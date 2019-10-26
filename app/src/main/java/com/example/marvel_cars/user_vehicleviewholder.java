package com.example.marvel_cars;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class user_vehicleviewholder extends RecyclerView.ViewHolder {
    TextView tView4,tView5,tView6;
    user_vehicleviewholder(@NonNull View itemView){
        super(itemView);
        tView4=itemView.findViewById(R.id.tView4);
        tView5=itemView.findViewById(R.id.tView5);
        tView6=itemView.findViewById(R.id.tView6);

    }
}
