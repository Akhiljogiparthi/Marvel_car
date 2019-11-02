package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class reservevehicle extends AppCompatActivity {
    RecyclerView bookvh;
    private int[] images={R.drawable.audi1,R.drawable.audi2,R.drawable.audi3,R.drawable.audi4,R.drawable.download};
    private emp_vehiclelist_adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservevehicle);
        String fromd=getIntent().getStringExtra("from").toString();
        String tod=getIntent().getStringExtra("to").toString();
        final TextView from=(TextView)findViewById(R.id.from1);
        final TextView to=(TextView)findViewById(R.id.to1);
        from.setText(fromd);
        to.setText(tod);
        bookvh =findViewById(R.id.bookvh);
        layoutManager=new GridLayoutManager(this,1);
        bookvh.setHasFixedSize(true);
        bookvh.setLayoutManager(layoutManager);
        adapter=new emp_vehiclelist_adapter(images);
        bookvh.setAdapter(adapter);
        final EditText Selvh = (EditText)findViewById(R.id.Selvh);
        Button confvh = findViewById(R.id.confvh);
        confvh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vehicle has been confirmed",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
