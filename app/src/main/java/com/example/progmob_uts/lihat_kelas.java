package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.progmob_uts.Model.data_Kelas;

import java.util.ArrayList;

public class lihat_kelas extends AppCompatActivity {
    private RecyclerView recyclerView;
    private data_Kelas data_kelas;
    private ArrayList<data_Kelas> data_kelasArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_kelas);

        addData();

        recyclerView = findViewById(R.id.rvKelas);
        data_kelas = new data_Kelas(data_kelasArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(lihat_kelas.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(data_kelas);
    }

    private void addData(){
        data_kelasArrayList = new ArrayList<>();
        data_kelasArrayList.add(new data_Kelas("SI3333-Progmob","4", "Jumat", "I Kadek Dendy Senapartha S.T,M.En,", "23"));

    }
}
