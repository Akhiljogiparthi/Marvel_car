package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userhome);
        Button profile=(Button)findViewById(R.id.profile);
        Button yourtrips=(Button)findViewById(R.id.trips);
        Button searchcars=(Button)findViewById(R.id.cars);
        Button recentrentals=(Button)findViewById(R.id.rent);
        Button recentpayment=(Button)findViewById(R.id.payment);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(userhome.this,profile.class);
                startActivity(i);
            }
        });
        yourtrips.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(userhome.this,yourtrips.class);
                startActivity(i);
            }
        }));
        searchcars.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i =new Intent(userhome.this,searchcars.class);
            startActivity(i);
        }
    });
        recentrentals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(userhome.this,recentrentals.class);
                startActivity(i);
            }
        });
            recentpayment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(userhome.this,recentpayment.class);
                    startActivity(i);
                }
            });
    }
}
