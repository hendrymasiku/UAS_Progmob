package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.progmob_uts.Model.data_Matkul;

import java.util.ArrayList;

public class lihat_matkul extends AppCompatActivity {
    private RecyclerView recyclerView;
    private data_Matkul data_matkul;
    private ArrayList<data_Matkul> data_matkulArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_matkul);

        addDate();

        recyclerView = findViewById(R.id.rvMatkul);
        data_matkul = new data_Matkul(data_matkulArrayList) ;
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(lihat_matkul.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(data_matkul);
    }

    private void addDate(){
        data_matkulArrayList = new ArrayList<>();
        data_matkulArrayList.add(new data_Matkul("SI3333-Progmob", "4", "Jumat", "3"));
    }

}
