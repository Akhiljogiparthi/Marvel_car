package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class user_listofvehicles extends AppCompatActivity {
RecyclerView user_vehicle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_listofvehicles);
        user_vehicle=findViewById(R.id.user_vehicle);
        user_vehicle.setLayoutManager(new LinearLayoutManager(this));

        user_vehicleadapter user_adapter =new user_vehicleadapter(getApplicationContext());
        user_vehicle.setAdapter(user_adapter);


    }
}
