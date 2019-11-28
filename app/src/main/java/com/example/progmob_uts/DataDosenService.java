package com.example.progmob_uts;

import com.example.progmob_uts.Model.data_Dosen;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DataDosenService {
        @GET("/api/progmob/dosen/{nim_progmob}")
        Call<List<data_Dosen>> getDosenAll(@Path("nim_progmob") String nimProgmob);
    }

