package com.example.progmob_uts.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.progmob_uts.R;

import java.util.ArrayList;

public class data_krs extends RecyclerView.Adapter<data_krs.ViewHolder> {
    ArrayList<data_krs> data_krsArrayList;

    public data_krs (ArrayList<data_krs> dataKrsArrayList) {
        this.data_krsArrayList = dataKrsArrayList;
    }

    @NonNull
    @Override
    public data_krs.ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_krs,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull data_krs.ViewHolder holder, int position){
        holder.txtHariKrs.setText(data_krsArrayList.get(position).getHariKrs());
        holder.txtSesiKrs.setText(data_krsArrayList.get(position).getSesiKrs());
        holder.txtKodeMatkulKrs.setText(data_krsArrayList.get(position).getKodeMatkulKrs());
        holder.txtJlhSksKrs.setText(data_krsArrayList.get(position).getJlhSksKrs());
        holder.txtDosenPengampuKrs.setText(data_krsArrayList.get(position).getDosenPengampuKrs());
        holder.txtJlhMhsKrs.setText(data_krsArrayList.get(position).getJlhMhsKrs());
    }

    private int getJlhMhsKrs() {
        return 0;
    }

    private int getDosenPengampuKrs() {
        return 0;
    }

    private int getJlhSksKrs() {return 0; }

    private int getKodeMatkulKrs() {
        return 0;
    }

    private int getSesiKrs() {
        return 0;
    }

    private int getHariKrs() {
        return 0;
    }

    @Override
    public int getItemCount(){
        return(data_krsArrayList != null) ? data_krsArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtHariKrs, txtSesiKrs, txtKodeMatkulKrs, txtJlhSksKrs, txtDosenPengampuKrs, txtJlhMhsKrs;

        public ViewHolder (View view) {
            super(view);
            txtHariKrs = view.findViewById(R.id.txtHariKrs);
            txtJlhSksKrs = view.findViewById(R.id.txtJlhSksKrs);
            txtKodeMatkulKrs = view.findViewById(R.id.txtKodeMatkulKrs);
            txtSesiKrs = view.findViewById(R.id.txtSesiKrs);
            txtDosenPengampuKrs = view.findViewById(R.id.txtDosenPengampu);
            txtJlhMhsKrs = view.findViewById(R.id.txtJlhMhsKrs);

        }
    }
}


