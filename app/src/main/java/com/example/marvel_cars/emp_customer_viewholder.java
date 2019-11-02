package com.example.marvel_cars;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class emp_customer_viewholder extends RecyclerView.ViewHolder {
    TextView tView7,tView8,tView9,tView10;
    emp_customer_viewholder(@NonNull View itemView){
        super(itemView);
        tView7 =itemView.findViewById(R.id.tView7);
        tView8 =itemView.findViewById(R.id.tView8);
        tView9 =itemView.findViewById(R.id.tView9);
        tView10 =itemView.findViewById(R.id.tView10);
    }
}
