package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);
    }

    public void KeKrsA(View view) {
        Intent intent = new Intent(menu_admin.this, lihat_krs.class);
        startActivity(intent);
    }

    public void KeKelasA(View view) {
        Intent intent = new Intent(menu_admin.this, lihat_kelas.class);
        startActivity(intent);
    }


    public void KeMatkulA(View view) {
        Intent intent = new Intent(menu_admin.this, lihat_matkul.class);
        startActivity(intent);
    }


    public void KeMhsA(View view) {
        Intent intent = new Intent(menu_admin.this, lihat_dosen.class);
        startActivity(intent);
    }
}
