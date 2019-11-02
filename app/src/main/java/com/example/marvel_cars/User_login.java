package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class User_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        Button userlogin1= (Button)findViewById(R.id.userlogin);
        Button userfp = (Button) findViewById(R.id.userfp);
        TextView userlogin = (TextView) findViewById(R.id.Textview);
        final EditText adusername = (EditText) findViewById(R.id.user_username);
        final EditText adpwd = (EditText) findViewById(R.id.user_password);
        userlogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<emp_customer_data> customer =emp_cust_datasource.getInstance().customer;
                Boolean choice = false;
                for (int i=0;i<customer.size();i++) {
                    emp_customer_data cus =customer.get(i);

                    if (("user".equals(adusername.getText().toString()) && "password".equals(adpwd.getText().toString())) ||
                            cus.Name.equals(adusername.getText().toString())&&cus.password.equals(adpwd.getText().toString())) {
                        Intent i1 = new Intent(User_login.this, user_home.class);
                        startActivity(i1);
                    }
                }
            }

        });
        userfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(User_login.this,forget_password.class);
                startActivity(i);
            }
        });
    }
}
