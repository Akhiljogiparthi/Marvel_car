package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class Employee_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home);
        Button customerlist=(Button)findViewById(R.id.customer);
        Button createcustomer=(Button)findViewById(R.id.createcustomer);
        Button vehiclelist=(Button)findViewById(R.id.vehiclelist);
        Button createvehicle=(Button)findViewById(R.id.createvehicle);
        Button cancelreservation=(Button)findViewById(R.id.cancelreservation);

        customerlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<emp_customer_data> customer = emp_cust_datasource.getInstance().customer;
                for (int i=0;i<customer.size();i++) {
                    emp_customer_data customers=customer.get(i);
                }

                Intent i1 =new Intent(Employee_home.this,emp_customerlist.class);
                startActivity(i1);
            }
        });

        createcustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Employee_home.this,createcustomer.class);
                startActivity(i);
            }
        });
        vehiclelist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Employee_home.this,empvehiclelist.class);
                startActivity(i);
            }
        });
        createvehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Employee_home.this,createvehicle.class);
                startActivity(i);
            }
        });
        cancelreservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Employee_home.this,cancelreservation.class);
                startActivity(i);
            }
        });

    }
}
