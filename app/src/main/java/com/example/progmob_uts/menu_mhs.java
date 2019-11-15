package com.example.progmob_uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class menu_mhs extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.logout,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.logoutBtn :
                AlertDialog.Builder builder = new AlertDialog.Builder(menu_mhs.this);
                builder.setMessage("Apakah Anda Ingin Logout?").setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(menu_mhs.this, "Cancel Logout", Toast.LENGTH_SHORT).show();
                    }
                })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                Toast.makeText(menu_mhs.this, "Berhasil LogOut", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(menu_mhs.this, Login_face.class);
                                startActivity(intent);
                                menu_mhs.super.onDestroy();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
                return true;
        }
        return false;
    }
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