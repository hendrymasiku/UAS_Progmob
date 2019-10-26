package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_mhs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mhs);
    }

    public void KeKrs(View view) {
        Intent intent = new Intent(menu_mhs.this, lihat_krs.class);
        startActivity(intent);
    }

    public void KeKelas(View view) {
        Intent intent = new Intent(menu_mhs.this, lihat_kelas.class);
        startActivity(intent);
    }
}