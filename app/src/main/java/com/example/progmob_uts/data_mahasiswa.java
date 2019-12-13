package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.progmob_uts.Model.data_Mhs;

import java.util.ArrayList;

public class data_mahasiswa extends AppCompatActivity {

    public data_mahasiswa(ArrayList<data_Mhs> dataMhsArrayList) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);
    }



}
