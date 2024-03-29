package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class user_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        Button listofvehicles=(Button)findViewById(R.id.vehicle);
        Button reservationlist=(Button)findViewById(R.id.listreservations);
        Button Return=(Button)findViewById(R.id.Return);
        listofvehicles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<user_vehicledata> vehicle =user_datasource.getInstance().vehicle;
                for (int i=0;i<vehicle.size();i++){
                    user_vehicledata vehicles = vehicle.get(i);
                }
                Intent i1 = new Intent(user_home.this,user_listofvehicles.class);
                startActivity(i1);

            }
        });
        reservationlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(user_home.this,reservationlist.class);
                startActivity(i);
            }
        });
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(user_home.this,user_return_vehicle.class);
                startActivity(i);
            }
        });

    }
}
