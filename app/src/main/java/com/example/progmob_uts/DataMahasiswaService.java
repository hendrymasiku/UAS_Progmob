package com.example.progmob_uts;

import com.example.progmob_uts.Model.data_Mhs;

import java.util.List;
import java.util.NavigableMap;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface DataMahasiswaService {
        @GET("/api/progmob/mahasiswa/{nim_progmob}")
        Call<List<data_Mhs>> getMhsAll(@Field("nim progmob") String nim);

    @FormUrlEncoded
    @POST("api/progmob/Mhs/create")
    Call<DefaultResult>insertMhs(String namamhs,
                                 @Field("nama") String nama,
                                 @Field("nim") String nim,
                                 @Field("alamat") String alamat,
                                 @Field("email") String email,
                                 @Field("foto") String foto,
                                 @Field("id") String id);

    @FormUrlEncoded
    @POST("api/progmob/Mhs/create")
    Call<DefaultResult>insertMatkul(String matkul,
                                    @Field("dosen") String dosen,
                                    @Field("nidn") String nidn,
                                    @Field("hari") String hari,
                                    @Field("sesi") String sesi,
                                    @Field("sks") String sks, String s);

    @FormUrlEncoded
    @POST("api/progmob/Mhs/create")
    Call<DefaultResult>insertjadwaldosen(String id,
                                    @Field("matkul") String matkul,
                                    @Field("dosen") String dosen,
                                    @Field("nidn") String nidn,
                                    @Field("hari") String hari,
                                    @Field("sesi") String sesi,
                                    @Field("sks") String sks);

    @FormUrlEncoded
    @POST("api/progmob/Mhs/create")
    Call<DefaultResult>KRS(String id,
                                         @Field("kode") String kode,
                                         @Field("nama_matkul") String nama_matkul,
                                         @Field("nidn") String nidn,
                                         @Field("dosen") String dosen,
                                         @Field("gelar") String gelar,
                                            @Field("hari") String hari,
                                            @Field("sesi") String sesi,
                                            @Field("sks") String sks,
                                            @Field("sks") String mhs,
                                            @Field("sks") String nim);

    @FormUrlEncoded
    @POST("api/progmob/Mhs/create")
    Call<DefaultResult>KRSdosen(String id,
                           @Field("kode") String kode,
                           @Field("nama_matkul") String nama_matkul,
                           @Field("nidn") String nidn,
                           @Field("dosen") String dosen,
                           @Field("gelar") String gelar,
                           @Field("hari") String hari,
                           @Field("sesi") String sesi,
                           @Field("sks") String sks);









}


