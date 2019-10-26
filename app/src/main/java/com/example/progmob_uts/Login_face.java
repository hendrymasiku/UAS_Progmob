package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_face extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_face);

    }

        public void KeLogin(View view ) {
            Intent intent = new Intent(Login_face.this, menu_mhs.class);
            startActivity(intent);
        }
    }


