package com.example.progmob_uts.Model;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class data_Krs extends RecyclerView.Adapter {
        public String kodeMatkulKrs;
        public String sesiKrs;
        public String hariKrs;
        public String jlhSksKrs;
        public String dosenPengampuKrs;
        public String jlhMhsKrs;

        public data_Krs(String kodeMatkulKrs, String sesiKrs, String hariKrs, String jlhSksKrs, String dosenPengampuKrs, String jlhMhsKrs) {
            this.kodeMatkulKrs = kodeMatkulKrs;
            this.sesiKrs = sesiKrs;
            this.hariKrs = hariKrs;
            this.jlhSksKrs = jlhSksKrs;
            this.dosenPengampuKrs = dosenPengampuKrs;
            this.jlhMhsKrs = jlhMhsKrs;
        }

    public data_Krs(ArrayList<data_Krs> data_krsArrayList) {

    }

        public String getKodeMatkulKrs() {
            return kodeMatkulKrs;
        }

        public void setKodeMatkulKrs(String kodeMatkulKrs) {
            this.kodeMatkulKrs = kodeMatkulKrs;
        }

        public String getSesiKrs() {
            return sesiKrs;
        }

        public void setSesiKrs(String sesiKrs) {
            this.sesiKrs = sesiKrs;
        }

        public String getHariKrs() {
            return hariKrs;
        }

        public void setHariKrs(String hariKrs) {
            this.hariKrs = hariKrs;
        }

        public String getJlhSksKrs() {
            return jlhSksKrs;
        }

        public void setJlhSksKrs(String jlhSksKrs) {
            this.jlhSksKrs = jlhSksKrs;
        }

        public String getDosenPengampuKrs() {
            return dosenPengampuKrs;
        }

        public void setDosenPengampuKrs(String dosenPengampuKrs) {
            this.dosenPengampuKrs = dosenPengampuKrs;
        }

        public String getJlhMhsKrs() {
            return jlhMhsKrs;
        }

        public void setJlhMhsKrs(String jlhMhsKrs) {
            this.jlhMhsKrs = jlhMhsKrs;
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

