package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
                if ("user".equals(adusername.getText().toString()) && "password".equals(adpwd.getText().toString())) {
                    Intent i = new Intent(User_login.this,user_home.class);
                    startActivity(i);
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
