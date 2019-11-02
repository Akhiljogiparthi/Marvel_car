package com.example.marvel_cars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class emp_customer_adapter extends RecyclerView.Adapter<emp_customer_viewholder> {
    private LayoutInflater inflater;
    emp_customer_adapter(Context context){this.inflater=LayoutInflater.from(context);}
    @NonNull
    @Override
    public emp_customer_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = inflater.inflate(R.layout.emp_cl_adapter, parent, false);
        return new emp_customer_viewholder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull emp_customer_viewholder holder, int position) {
        emp_customer_data customer1 = emp_cust_datasource.getInstance().customer.get(position);

        holder.tView7.setText(String.valueOf(customer1.Name));
        holder.tView8.setText(String.valueOf(customer1.Email));
        holder.tView9.setText(String.valueOf(customer1.phonenumber));
        holder.tView10.setText(String.valueOf(customer1.password));
    }

    @Override
    public int getItemCount() {
        return user_datasource.getInstance().vehicle.size();
    }
}
