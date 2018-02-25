package com.notsorryforbeingme.gitadestrianti_1202150237_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginForm extends AppCompatActivity {

    Button btnLogin;
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);//mengambil layout dari actiivty_login_form

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

       btnLogin.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               login();
           }
       });
    }

    public void login(){
        String user=etUsername.getText().toString().trim();
        String pass=etPassword.getText().toString().trim();

        if(user.equals("EAD") && pass.equals("MOBILE")){

            Intent main = new Intent(LoginForm.this, MainActivity.class);
            startActivity(main);
            finish();

            Toast.makeText(this,"Login berhasil!",Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this,"Username atau password salah",Toast.LENGTH_LONG).show();
        }
    }

}
