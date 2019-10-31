package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class emp_customerlist extends AppCompatActivity {
    RecyclerView  empcust_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_customerlist);
    empcust_list=findViewById(R.id.empcust_list);
        empcust_list.setLayoutManager(new LinearLayoutManager(this));
        emp_customer_adapter emp_adapter =new emp_customer_adapter(getApplicationContext());
        empcust_list.setAdapter(emp_adapter);

    }

}
