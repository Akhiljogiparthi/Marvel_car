package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class empvehiclelist extends AppCompatActivity {
    RecyclerView empvehlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empvehiclelist);
        empvehlist=findViewById(R.id.empvehlist);
        empvehlist.setLayoutManager(new LinearLayoutManager(this));

        user_vehicleadapter user_adapter =new user_vehicleadapter(getApplicationContext());
        empvehlist.setAdapter(user_adapter);
    }
}
