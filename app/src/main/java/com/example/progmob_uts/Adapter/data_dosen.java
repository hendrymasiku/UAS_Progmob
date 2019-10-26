package com.example.progmob_uts.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.progmob_uts.R;

import java.util.ArrayList;

public class data_dosen extends RecyclerView.Adapter<data_dosen.ViewHolder> {
    ArrayList<data_dosen> data_dosenArrayList;

    public data_dosen (ArrayList<data_dosen> data_dosenArrayList){
        this.data_dosenArrayList = data_dosenArrayList;
    }

    @NonNull
    @Override
    public data_dosen.ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_dosen,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull data_dosen.ViewHolder holder, int position){
        holder.txtNidnNama.setText(data_dosenArrayList.get(position).geNindNama());
        holder.txtGelar.setText(data_dosenArrayList.get(position).getGelar());
        holder.txtAlamat.setText(data_dosenArrayList.get(position).getAlamat());
        holder.txtEmail.setText(data_dosenArrayList.get(position).getEmail());
    }

    private int getEmail() {
        return 0;
    }

    private int getAlamat() {
        return 0;
    }

    private int getGelar() {
        return 0;
    }

    private int geNindNama() {
        return 0;
    }

    @Override
    public int getItemCount(){
        return(data_dosenArrayList != null) ? data_dosenArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNidnNama, txtGelar, txtAlamat, txtEmail;

        public ViewHolder (View view) {
            super(view);
            txtNidnNama = view.findViewById(R.id.txtNidnNama);
            txtGelar = view.findViewById(R.id.txtGelar);
            txtEmail = view.findViewById(R.id.txtEmail);
            txtAlamat = view.findViewById(R.id.txtAlamat);
        }
    }

}


