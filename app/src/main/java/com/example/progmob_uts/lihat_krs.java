package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.progmob_uts.Model.data_Krs;

import java.util.ArrayList;

public class lihat_krs extends AppCompatActivity {
    private RecyclerView recyclerView;
    private data_Krs dataKrsAdapter;
    private ArrayList<data_Krs> data_krsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_krs);

        addData();

        recyclerView = findViewById(R.id.rvKrs);
        dataKrsAdapter = new data_Krs(data_krsArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(lihat_krs.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dataKrsAdapter);
    }

    private void addData(){
        data_krsArrayList = new ArrayList<>();
        data_krsArrayList.add(new data_Krs("SI3333-Progmob", "4", "Jumat", "3", "I Kadek Dendy Senapartha S.T,M.En", "23"));
    }
}
