package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class user_listofvehicles extends AppCompatActivity {
RecyclerView userlistvh;
    private int[] images={R.drawable.audi1,R.drawable.audi2,R.drawable.audi3,R.drawable.audi4,R.drawable.download
            ,R.drawable.download12,R.drawable.download13};
    DatePickerDialog.OnDateSetListener set1,set2;
    private emp_vehiclelist_adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_listofvehicles);
       userlistvh =findViewById(R.id.userlistvh);
        layoutManager=new GridLayoutManager(this,2);
        userlistvh.setHasFixedSize(true);
        userlistvh.setLayoutManager(layoutManager);
        adapter=new emp_vehiclelist_adapter(images);
        userlistvh.setAdapter(adapter);
        final Button bookbtn =findViewById(R.id.bookbtn);
       final Button resbtn =findViewById(R.id.resbtn);
        final TextView fromdate = findViewById(R.id.fromdate);
        final TextView todate = findViewById(R.id.todate);
        fromdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int day =calendar.get(Calendar.DAY_OF_MONTH);
                int month =calendar.get(Calendar.MONTH);
                int year =calendar.get(Calendar.YEAR);
                DatePickerDialog datepicker = new DatePickerDialog(
                        user_listofvehicles.this,android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
                        set1,year,month,day);
                datepicker.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datepicker.show();
            }
        });
        todate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int day =calendar.get(Calendar.DAY_OF_MONTH);
                int month =calendar.get(Calendar.MONTH);
                int year =calendar.get(Calendar.YEAR);
                DatePickerDialog datepicker = new DatePickerDialog(
                        user_listofvehicles.this,android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
                        set2,year,month,day);
                datepicker.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datepicker.show();
            }
        });
        set1= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                String date = month+"/"+dayOfMonth+"/"+year;
                fromdate.setText(date);
            }
        };
        set2= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                String date = month+"/"+dayOfMonth+"/"+year;
                todate.setText(date);
            }
        };
        bookbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(user_listofvehicles.this,reservevehicle.class);
                i.putExtra("from",fromdate.getText().toString());
                i.putExtra("to",todate.getText().toString());
                startActivity(i);
            }
        });
        resbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(user_listofvehicles.this,reservevehicle.class);
                i.putExtra("from",fromdate.getText().toString());
                i.putExtra("to",todate.getText().toString());
                startActivity(i);
            }
        });





    }
}
