package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.progmob_uts.Model.data_Mhs;

import java.util.ArrayList;

public class lihat_mhs extends AppCompatActivity {

    private RecyclerView recyclerView;
    private data_mahasiswa data_mahasiswa;
    private ArrayList<data_Mhs> data_mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);


        recyclerView = findViewById(R.id.rcMhs);
        data_mahasiswa = new data_mahasiswa(data_mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(lihat_mhs.this);
        recyclerView.setLayoutManager(layoutManager);
        //recyclerView.setAdapter(data_mahasiswa);
    }

    private void addData(){
        data_mahasiswaArrayList = new ArrayList<>();
        data_mahasiswaArrayList.add(new data_Mhs("72150066 Hendry Masiku", "Seturan 2 No.14", "Hendrymasiku24@gmail.com"));
    }
}