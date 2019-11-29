package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.progmob_uts.Model.data_Mhs;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    DataDosenService data_DosenService;
    DataMahasiswaService data_MhsService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data_DosenService = RetrofitClient.getRetrofitInstance()
                .create(DataDosenService.class);
        data_MhsService = RetrofitClient.getRetrofitInstance()
                .create(DataMahasiswaService.class);
        getAllDataDosen();
        getAllDataMHS();
    }

    private void getAllDataDosen() {
        Call<List<com.example.progmob_uts.Model.data_Dosen>> call = DataDosenService.getDosenAll("1");
        call.enqueue(new Callback<List<com.example.progmob_uts.Model.data_Dosen>>() {
            @Override
            public void onResponse(Call<List<com.example.progmob_uts.Model.data_Dosen>> call, Response<List<com.example.progmob_uts.Model.data_Dosen>> response) {
                for (com.example.progmob_uts.Model.data_Dosen dosen : response.body()) {
                    System.out.println("NidnNama : " + dosen.getNidnNama());
                    System.out.println("Gelar : " + dosen.getGelar());
                }

            }

            @Override
            public void onFailure(Call<List<com.example.progmob_uts.Model.data_Dosen>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "somethig wrong.... ", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void getAllDataMHS() {
        Call<List<data_Mhs>> call = DataMahasiswaService.getMhsAll("1");
        call.enqueue(new Callback<List<data_Mhs>>() {
            @Override
            public void onResponse(Call<List<data_Mhs>> call, Response<List<data_Mhs>> response) {
                for (data_Mhs mahasiswa : response.body()) {
                    System.out.println("nimNama : " + mahasiswa.getNimNama());
                    System.out.println("Alamat : " + mahasiswa.getAlamat());
                }

            }

            @Override
            public void onFailure(Call<List<data_Mhs>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "somethig wrong.... ", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void getAllDataMHS() {
        Call<List<DefaultResult>> call = DataMahasiswaService.getMhsAll("1");
        call.enqueue(new Callback<List<DefaultResult>>() {
            @Override
            public void onResponse(Call<List<DefaultResult>> call, Response<List<DefaultResult>> response) {
                for (DefaultResult mahasiswa : response.body()) {
                }
            }

            @Override
            public void onFailure(Call<List<DefaultResult>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "somethig wrong.... ", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void insertDosen() {
        Call<DefaultResult> call = data_DosenService.insertDosen("Hendry", "72150066", "Seturan", "gmail.com", "S.Kom, MM", "Upload", "72150066");
        call.enqueue(new Callback<DefaultResult>() {
            @Override
            public void onResponse(Call<DefaultResult> call, Response<DefaultResult> response) {
                System.out.println(response.body().getStatus());
            }

            @Override
            public void onFailure(Call<DefaultResult> call, Throwable t) {
                System.out.println("message :" + t.getMessage());
                Toast.makeText(MainActivity.this, "Something Went Wrong...Please Try Later!", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void deleteDosen() {
        Call<DefaultResult> call = data_DosenService.deleteDosen("Dendy", "809010");
        call.enqueue(new Callback<DefaultResult>() {
            @Override
            public void onResponse(Call<DefaultResult> call, Response<DefaultResult> response) {
                System.out.println(response.body().getStatus());
            }

            @Override
            public void onFailure(Call<DefaultResult> call, Throwable t) {
                System.out.println("message :" + t.getMessage());
                Toast.makeText(MainActivity.this, "Something Went Wrong...Please Try Later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void updateDosen() {
        Call<DefaultResult> call = data_DosenService.updateDosen("Arnold", "000033", "Demangan", "gmail.com", "S.Kom", "Upload", "3");
        call.enqueue(new Callback<DefaultResult>() {
            @Override
            public void onResponse(Call<DefaultResult> call, Response<DefaultResult> response) {
                System.out.println(response.body().getStatus());
            }

            @Override
            public void onFailure(Call<DefaultResult> call, Throwable t) {
                System.out.println("message :" + t.getMessage());
                Toast.makeText(MainActivity.this, "Something Went Wrong...Please Try Later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

