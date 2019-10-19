package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdminLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        Button adlogin = (Button)findViewById(R.id.adlogin);
        Button adminfp = (Button) findViewById(R.id.adminfp);
        TextView adminlogin = (TextView) findViewById(R.id.adlogin);
        final EditText username = (EditText) findViewById(R.id.username);
        final EditText adpwd = (EditText) findViewById(R.id.adpwd);
        adlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("admin".equals(username.getText().toString()) && "password".equals(adpwd.getText().toString())) {
                    Intent i = new Intent(AdminLogin.this, userhome.class);
                    startActivity(i);
                }
            }

        });
    }
}
