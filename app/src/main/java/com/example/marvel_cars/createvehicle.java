package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class createvehicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createvehicle);
        Button vecsubmit=(Button)findViewById(R.id.vecsubmit);
        final TextView view1 = (TextView)findViewById(R.id.vectext);
        vecsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               view1.setText("New vehicle has been created , go back to home page");
            }
        });
    }
}
