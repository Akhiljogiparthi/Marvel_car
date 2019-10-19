package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        Button userlogin=(Button)findViewById(R.id.login);
        Button userfp=(Button)findViewById(R.id.userfp);
        TextView login=(TextView)findViewById(R.id.userlogin);
        final EditText username=(EditText)findViewById(R.id.username);
        final EditText password=(EditText)findViewById(R.id.password);
        userlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("user".equals(username.getText().toString())&&"password".equals(password.getText().toString()))
                {
                    Intent i=new Intent(UserLogin.this,userhome.class);
                    startActivity(i);
                }
            }
        });
        userfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(UserLogin.this,forgpas.class);
                startActivity(i);

            }
        });

        }
}
