package com.example.progmob_uts.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.progmob_uts.R;
import com.example.progmob_uts.lihat_kelas;
import com.example.progmob_uts.R;
import java.util.ArrayList;
public class data_matkul extends RecyclerView.Adapter<data_matkul.ViewHolder> {
    ArrayList<data_matkul> data_matkulArrayList;

    public data_matkul(ArrayList<data_matkul> dataMatkulArrayList) {
        this.data_matkulArrayList = dataMatkulArrayList;
    }

    @NonNull
    @Override
    public data_matkul.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_mhs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull data_matkul.ViewHolder holder, int position) {
        holder.txtHari.setText(data_matkulArrayList.get(position).getHari());
        holder.txtSesi.setText(data_matkulArrayList.get(position).getSesi());
        holder.txtKodeMatkul.setText(data_matkulArrayList.get(position).getKodeMatkul());
        holder.txtJlhSks.setText(data_matkulArrayList.get(position).getJlhSks());
    }

    private int getJlhSks() {
        return 0;
    }

    private int getKodeMatkul() {
        return 0;
    }

    private int getSesi() {
        return 0;
    }

    private int getHari() {
        return 0;
    }

    @Override
    public int getItemCount() {
        return (data_matkulArrayList != null) ? data_matkulArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtHari, txtSesi, txtKodeMatkul, txtJlhSks;

        public ViewHolder(View view) {
            super(view);
            txtHari = view.findViewById(R.id.txtHari);
            txtJlhSks = view.findViewById(R.id.txtJlhSks);
            txtKodeMatkul = view.findViewById(R.id.txtKodeMatkul);
            txtSesi = view.findViewById(R.id.txtSesi);
        }

    }
}
