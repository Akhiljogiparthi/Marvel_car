package com.example.marvel_cars;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class emp_vehiclelist_adapter extends RecyclerView.Adapter<emp_vehiclelist_adapter.vehicleviewholder> {
    private int[] images;
    public emp_vehiclelist_adapter(int[] images)
    {
        this.images=images;
    }

    @NonNull
    @Override
    public vehicleviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.emp_vehicle_layout,parent,false);
        vehicleviewholder vehicle=new vehicleviewholder(view);
        return vehicle;

    }

    @Override
    public void onBindViewHolder(@NonNull vehicleviewholder holder, int position) {
        int imageid=images[position];
        holder.album.setImageResource(imageid);
        holder.albumtitle.setText("audi :"+(position+1));
        holder.numberofseats.setText("No of seats:"+(position+1));
        holder.price.setText("Price per day:$"+(position*10+10));
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
    public static class vehicleviewholder extends RecyclerView.ViewHolder
    {
        ImageView album;
        TextView albumtitle;
        TextView numberofseats;
        TextView price;
        public vehicleviewholder(@NonNull View itemView) {
            super(itemView);
            album=itemView.findViewById(R.id.album);
            albumtitle=itemView.findViewById(R.id.albumtitle);
            numberofseats=itemView.findViewById(R.id.numberofseats);
            price = itemView.findViewById(R.id.Price);
        }
    }
}
