package com.example.progmob_uts.Model;

import com.google.gson.annotations.SerializedName;

public class data_Dosen {
    @SerializedName("nidnNama")
    private String nidnNama;
    @SerializedName("gelar")
    private String gelar;
    @SerializedName("Alamat")
    private String Alamat;
    @SerializedName("Email")
    private String Email;
    //public String nidnNama;
    //public String gelar;
    //public String alamat;
    //public String email;
        public data_Dosen(String nidnNama, String gelar, String alamat, String email) {
            this.nidnNama = nidnNama;
            this.gelar = gelar;
            this.Alamat = alamat;
            this.Email = email;
        }

        public String getNidnNama() {
            return nidnNama;
        }

        public void setNidnNama(String nidnNama) {
            this.nidnNama = nidnNama;
        }

        public String getGelar() {
            return gelar;
        }

        public void setGelar(String gelar) {
            this.gelar = gelar;
        }

        public String getAlamat() {
            return Alamat;
        }

        public void setAlamat(String alamat) {
            Alamat = alamat;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }
    }

