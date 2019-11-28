package com.example.progmob_uts;

import com.example.progmob_uts.Model.data_Mhs;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DataMahasiswaService {
        @GET("/api/progmob/mahasiswa/{nim_progmob}")
        Call<List<data_Mhs>> getMhsAll(@Path("nim_progmob") String nimProgmob);
    }


