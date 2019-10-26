package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class user_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        Button listofvehicles=(Button)findViewById(R.id.vehicle);
        Button rentvehicle=(Button)findViewById(R.id.rent);
        Button reservevehicle=(Button)findViewById(R.id.reserve);
        Button reservationlist=(Button)findViewById(R.id.listreservations);
        Button Return=(Button)findViewById(R.id.Return);
        listofvehicles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(user_home.this,user_listofvehicles.class);
                startActivity(i);
            }
        });
        rentvehicle.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(user_home.this,vehicleforrent.class);
            startActivity(i);
        }
    });
        reservevehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(user_home.this,reservevehicle.class);
                startActivity(i);
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
                Intent i = new Intent(user_home.this,returnvehicle.class);
                startActivity(i);
            }
        });

    }
}
