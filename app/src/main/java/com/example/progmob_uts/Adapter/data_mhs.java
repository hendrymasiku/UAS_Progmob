package com.example.progmob_uts.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.progmob_uts.R;

import java.util.ArrayList;

public class data_mhs extends RecyclerView.Adapter<data_mhs.ViewHolder> {
    ArrayList<data_mhs> data_mhsArrayList;

    public data_mhs (ArrayList<data_mhs>dataMatkulArrayList) {
        this.data_mhsArrayList = dataMatkulArrayList;
    }

    @NonNull
    @Override
    public data_mhs.ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_mahasiswa,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull data_mhs.ViewHolder holder, int position){
        holder.txtNimNama.setText(data_mhsArrayList.get(position).getNimNama());
        holder.txtAlamat.setText(data_mhsArrayList.get(position).getAlamat());
        holder.txtEmail.setText(data_mhsArrayList.get(position).getEmail());
    }

    private int getEmail() {
        return 0;
    }

    private int getAlamat() {
        return 0;
    }

    private int getNimNama() {
        return 0;
    }

    @Override
    public int getItemCount(){
        return(data_mhsArrayList != null) ? data_mhsArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNimNama, txtAlamat, txtEmail;

        public ViewHolder (View view) {
            super(view);
            txtNimNama = view.findViewById(R.id.txtNimNama);
            txtEmail = view.findViewById(R.id.txtEmail);
            txtAlamat = view.findViewById(R.id.txtAlamat);
        }
    }
}

