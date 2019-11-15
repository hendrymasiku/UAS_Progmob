package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_face extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_face);

        SharedPreferences prefs = Login_face.this.getSharedPreferences("prefs_file", MODE_PRIVATE);
        String statusLogin = prefs.getString("isLogin", null);
        EditText roleLogin = (EditText) findViewById(R.id.emailText);
        String strValue = roleLogin.getText().toString();
        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(myBtnLoginClick);
        if (statusLogin == "Admin") {
            Intent intent = new Intent(Login_face.this, menu_admin.class);
            startActivity(intent);
        } else if (statusLogin == "User") {
            Intent intent = new Intent(Login_face.this, menu_mhs.class);
            startActivity(intent);
        } else /*if (statusLogin == null)*/ {
            Toast.makeText(Login_face.this, "Tidak dapat login", Toast.LENGTH_SHORT).show();
        }
    }

    private View.OnClickListener myBtnLoginClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            SharedPreferences prefs = Login_face.this.getSharedPreferences("prefs_file", MODE_PRIVATE);
            String statusLogin = prefs.getString("isLogin", null);
            SharedPreferences.Editor edit = prefs.edit();

            Button loginBtn = (Button) findViewById(R.id.loginBtn);
            if (statusLogin != null) {
                edit.putString("isLogin", null);
                Intent intent = new Intent(Login_face.this, menu_mhs.class);
                startActivity(intent);
            } else if (statusLogin == null) {
                edit.putString("isLogin", "Admin");
                Intent intent = new Intent(Login_face.this, menu_admin.class);
                startActivity(intent);
            } else {
                loginBtn.setText("Login");
            /*Toast.makeText(LoginScreen.this, "belum", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginScreen.this, MenuAdmin.class);
            startActivity(intent);*/
            }
            edit.commit();
        }

        ;

        /*public void KeLogin(View view ) {
            Intent intent = new Intent(Login_face.this, menu_mhs.class);
            startActivity(intent);
        }*/

    };
}


