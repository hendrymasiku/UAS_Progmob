package com.example.progmob_uts.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.progmob_uts.R;

import java.util.ArrayList;

public class data_kelas extends RecyclerView.Adapter<data_kelas.ViewHolder> {
    ArrayList<data_kelas> data_kelasArrayList;

    public data_kelas (ArrayList<data_kelas> data_kelasArrayList){
        this.data_kelasArrayList = data_kelasArrayList;
    }

    public data_kelas(String s, String s1, String jumat, String i_kadek, String s2) {
    }

    @NonNull
    @Override
    public data_kelas.ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_kelas,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull data_kelas.ViewHolder holder, int position){
        holder.txtHariKls.setText(data_kelasArrayList.get(position).getHariKls());
        holder.txtSesiKls.setText(data_kelasArrayList.get(position).getSesiKls());
        holder.txtKodeMatkulKls.setText(data_kelasArrayList.get(position).getKodeMatkulKls());
        holder.txtDosenPengampuKls.setText(data_kelasArrayList.get(position).getDosenPengampuKls());
        holder.txtJlhMhsKls.setText(data_kelasArrayList.get(position).getJlhMhsKls());
    }

    private int getJlhMhsKls() {
            return 0;
    }

    private int getDosenPengampuKls() {
        return 0;
    }

    private int getKodeMatkulKls() {
        return 0;
    }

    private int getSesiKls() {
        return 0;
    }

    private int getHariKls() {
        return 0;
    }

    @Override
    public int getItemCount(){
        return(data_kelasArrayList != null) ? data_kelasArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtHariKls, txtSesiKls, txtKodeMatkulKls, txtDosenPengampuKls, txtJlhMhsKls;

        public ViewHolder (View view) {
            super(view);
            txtHariKls = view.findViewById(R.id.txtHariKls);
            txtKodeMatkulKls = view.findViewById(R.id.txtKodeMatkulKls);
            txtSesiKls = view.findViewById(R.id.txtSesiKls);
            txtDosenPengampuKls = view.findViewById(R.id.txtDosenPengampuKls);
            txtJlhMhsKls = view.findViewById(R.id.txtJlhMhsKls);
        }
    }

}


