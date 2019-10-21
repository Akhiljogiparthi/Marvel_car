package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adminhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminhome);
        final  Button profile = (Button)findViewById(R.id.profile);
        final Button vehicle = (Button)findViewById(R.id.vehicle);
        final Button Reserve = (Button)findViewById(R.id.reserve);
        final Button customer = (Button)findViewById(R.id.customer);
        final  Button track = (Button)findViewById(R.id.track);
        final Button sale = (Button)findViewById(R.id.sale);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Adminhome.this,profile.class);
                startActivity(i);
            }
        });

        vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Adminhome.this,vehicle.class);
                startActivity(i);
            }
        });

        Reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Adminhome.this,Reserve.class);
                startActivity(i);
            }
        });
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Adminhome.this,customer.class);
                startActivity(i);
            }
        });
        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Adminhome.this,track.class);
                startActivity(i);
            }
        });
        sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Adminhome.this,sale.class);
                startActivity(i);
            }
        });
        }
}
