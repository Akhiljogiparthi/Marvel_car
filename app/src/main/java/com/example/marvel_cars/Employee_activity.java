package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Employee_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_activity);
        Button adminlogin1= (Button)findViewById(R.id.adminlogin);
        Button adminfp = (Button) findViewById(R.id.adminfp);
        TextView adminlogin = (TextView) findViewById(R.id.adminlogin);
        final EditText adusername = (EditText) findViewById(R.id.admin_username);
        final EditText adpwd = (EditText) findViewById(R.id.admin_password);
        adminlogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("admin".equals(adusername.getText().toString()) && "password".equals(adpwd.getText().toString())) {
                    Intent i = new Intent(Employee_activity.this,Employee_home.class);
                    startActivity(i);
                }
            }

        });
        adminfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Employee_activity.this,forget_password.class);
                startActivity(i);
            }
        });
    }
    }

