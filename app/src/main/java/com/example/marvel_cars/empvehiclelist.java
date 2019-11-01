package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class empvehiclelist extends AppCompatActivity {
    RecyclerView listvh;
    private int[] images={R.drawable.audi1,R.drawable.audi2,R.drawable.audi3,R.drawable.audi4,R.drawable.download
            ,R.drawable.download12,R.drawable.download13};
    private emp_vehiclelist_adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empvehiclelist);
        listvh =findViewById(R.id.listvh);
        layoutManager=new GridLayoutManager(this,2);
        listvh.setHasFixedSize(true);
        listvh.setLayoutManager(layoutManager);
        adapter=new emp_vehiclelist_adapter(images);
        listvh.setAdapter(adapter);
    }
}
