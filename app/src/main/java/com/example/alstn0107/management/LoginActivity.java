package com.example.alstn0107.management;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText idText=(EditText) findViewById(R.id.idText);
        EditText passwordText=(EditText) findViewById(R.id.passwordText);

        Button loginButton = (Button) findViewById(R.id.loginButton);
        TextView registerButton = (TextView)findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() { //new View.OnClickListener()까지 치고 imple눌러서 구현
            @Override
            public void onClick(View view) { //버튼을 클릭했을때 registerIntent를 통해서 RegisterActivity를 실행할수 있는거임
                Intent registerIntent =new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);


            }
        });


    }
}
