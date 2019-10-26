package com.example.progmob_uts.Model;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class data_Kelas extends RecyclerView.Adapter {
        public String kodeMatkulKls;
        public String sesiKls;
        public String hariKls;
        public String dosenPengampuKls;
        public String jlhMhsKls;

        public data_Kelas(String kodeMatkulKls, String sesiKls, String hariKls, String dosenPengampuKls, String jlhMhsKls) {
            this.kodeMatkulKls = kodeMatkulKls;
            this.sesiKls = sesiKls;
            this.hariKls = hariKls;
            this.dosenPengampuKls = dosenPengampuKls;
            this.jlhMhsKls = jlhMhsKls;
        }

    public data_Kelas(ArrayList<data_Kelas> data_kelasArrayList) {
    }

        public String getKodeMatkulKls() {
            return kodeMatkulKls;
        }

        public void setKodeMatkulKls(String kodeMatkulKls) {
            this.kodeMatkulKls = kodeMatkulKls;
        }

        public String getSesiKls() {
            return sesiKls;
        }

        public void setSesiKls(String sesiKls) {
            this.sesiKls = sesiKls;
        }

        public String getHariKls() {
            return hariKls;
        }

        public void setHariKls(String hariKls) {
            this.hariKls = hariKls;
        }

        public String getDosenPengampuKls() {
            return dosenPengampuKls;
        }

        public void setDosenPengampuKls(String dosenPengampuKls) {
            this.dosenPengampuKls = dosenPengampuKls;
        }

        public String getJlhMhsKls() {
            return jlhMhsKls;
        }

        public void setJlhMhsKls(String jlhMhsKls) {
            this.jlhMhsKls = jlhMhsKls;
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
