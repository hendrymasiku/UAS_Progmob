package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class lihat_dosen extends AppCompatActivity {
    private RecyclerView recyclerView;
    private data_dosen dataDosenAdapter;
    private ArrayList<data_dosen> dataDosenArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_dosen);

        addData();
    }

    private void addData(){
        dataDosenArrayList = new ArrayList<>();
        dataDosenArrayList.add(new data_dosen());

    }
}
