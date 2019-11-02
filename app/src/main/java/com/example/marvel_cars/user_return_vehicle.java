package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class user_return_vehicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_return_vehicle);
        Button sub12 =findViewById(R.id.sub12);
        sub12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Return request has been successfull",Toast.LENGTH_LONG).show();
            }
        });

    }
}
