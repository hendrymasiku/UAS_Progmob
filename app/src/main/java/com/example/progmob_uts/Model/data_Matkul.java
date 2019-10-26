package com.example.progmob_uts.Model;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class data_Matkul extends RecyclerView.Adapter {
        public String kodeMatkul;
        public String sesi;
        public String hari;
        public String jlhSks;

        public data_Matkul(String kodeMatkul, String sesi, String hari, String jlhSks) {
            this.kodeMatkul = kodeMatkul;
            this.sesi = sesi;
            this.hari = hari;
            this.jlhSks = jlhSks;
        }

    public data_Matkul(ArrayList<data_Matkul> data_matkulArrayList) {

    }

        public String getKodeMatkul() {
            return kodeMatkul;
        }

        public void setKodeMatkul(String kodeMatkul) {
            this.kodeMatkul = kodeMatkul;
        }

        public String getSesi() {
            return sesi;
        }

        public void setSesi(String sesi) {
            this.sesi = sesi;
        }

        public String getHari() {
            return hari;
        }

        public void setHari(String hari) {
            this.hari = hari;
        }

        public String getJlhSks() {
            return jlhSks;
        }

        public void setJlhSks(String jlhSks) {
            this.jlhSks = jlhSks;
        }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

