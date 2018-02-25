package com.notsorryforbeingme.gitadestrianti_1202150237_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    private int waktuLoading = 4000;
    //4000 = 4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan berpindah ke LoginForn

                Intent login = new Intent(SplashScreen.this, LoginForm.class);
                startActivity(login);
                finish();
            }
        },waktuLoading);
    }
}
