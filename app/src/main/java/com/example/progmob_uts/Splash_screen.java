package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

    }
        public void GoButton(View view) {
            Intent intent = new Intent(Splash_screen.this, Login_face.class);
            startActivity(intent);
        }
    }
