package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.widget.Toast;

import com.example.progmob_uts.Model.data_Mhs;
import com.google.android.material.textfield.TextInputLayout;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.ContentHandler;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    DataDosenService data_DosenService;
    DataMahasiswaService data_MhsService;
    Boolean error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);
        data_DosenService = RetrofitClient.getRetrofitInstance()
                .create(DataDosenService.class);
        data_MhsService = RetrofitClient.getRetrofitInstance()
                .create(DataMahasiswaService.class);
    }


        private void getMhsAll() {
            Call<DefaultResult> call = data_MhsService.insertMhs("Reinald", "72150001", "Babarsari", "reinald@si.ukdw.ac.id", "Yes", "", "1");
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
    private void insertMatkul() {
        Call<DefaultResult> call = data_MhsService.insertMatkul("Jaringan Komputer", "Halim", "0516118902", "1", "3", "", "3");
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

    private void insertjadwaldosen() {
        Call<DefaultResult> call = data_MhsService.insertjadwaldosen("1", "Alogaritma", "Argo", "0516118902", "1", "3", "3");
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

    private void KRS() {
        Call<DefaultResult> call = data_MhsService.KRS("1", "ST1234", "Alogaritma", "0516118902", "1", "S.T M.Eng", "1","3","3","Reinald","72150001");
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
    private void KRSdosen() {
        Call<DefaultResult> call = data_MhsService.KRSdosen("1", "ST1234", "Alogaritma", "0516118902", "1", "S.T M.Eng", "1","3","3");
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


    private void insertDosen() {
        Call<DefaultResult> call = data_DosenService.insertDosen("Halim budi santosa", "056118903", "Giwangan", "hbudi@staff.ukdw.ac.id", "S.T, M.T", "", "2");
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
        Call<DefaultResult> call = data_DosenService.updateDosen("Argo", "0516118902", "Godean", "argo@staff.ukdw.ac.id", "S.T, M.Eng", "", "1");
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
        Call<DefaultResult> call = data_DosenService.deleteDosen("Halim budi santosa", "056118903");
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

    private boolean checkPermision() {
        int result = ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.READ_EXTERNAL_STORAGE);
        return result == PackageManager.PERMISSION_GRANTED;
    }

    //menambahkan image//
    private void insertDosenWithFoto() {
        File sdcard = Environment.getExternalStorageDirectory();
        String imageToSend = null;


        File file = new File(sdcard, "/Download/images.jpg");

        if (file.exists()) {
            if (!checkPermision()) {

                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        1);

            }

            Bitmap imageBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            imageBitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
            byte[] bytes = baos.toByteArray();
            imageToSend = Base64.encodeToString(bytes, Base64.DEFAULT);

        }

        Call<DefaultResult> call = data_DosenService.insertDosenWithFoto("Hendry", "72150066", "Seturan", "gmail.com", "S.Kom, MM", imageToSend, "72150066");
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

        // UNTUK MENAMPILKAN VALIDASI//
        //Dosen//

        TextInputLayout tilGelar = (TextInputLayout) findViewById(R.id.Gelar);
        if (error) {
            tilGelar.setError("Isikan Gelar Anda");
        }
        //Mahasiswa//

        TextInputLayout tilalamat = (TextInputLayout) findViewById(R.id.Alamat);
        if (error) {
            tilalamat.setError("Isikan Alamat Anda");
        }
        TextInputLayout tilNIDN = (TextInputLayout) findViewById(R.id.NIDN);
        if (error) {
            tilNIDN.setError("Isikan NIDN Anda");
        }
        TextInputLayout tilNama = (TextInputLayout) findViewById(R.id.Nama);
        if (error) {
            tilGelar.setError("Isikan Nama Anda");
        }
        TextInputLayout tilfoto = (TextInputLayout) findViewById(R.id.Foto);
        if (error) {
            tilGelar.setError("Isikan Foto Anda");
        }

        TextInputLayout tilNIM = (TextInputLayout) findViewById(R.id.NIM);
        if (error) {
            tilNIM.setError("Isikan NIM Anda");
        }

        TextInputLayout tilAlamat = (TextInputLayout) findViewById(R.id.Alamat);
        if (error) {
            tilalamat.setError("Isikan Alamat Anda");
        }

        TextInputLayout tilnama = (TextInputLayout) findViewById(R.id.nama);
        if (error) {
            tilGelar.setError("Isikan Nama Anda");
        }

        TextInputLayout tilFoto = (TextInputLayout) findViewById(R.id.foto);
        if (error) {
            tilGelar.setError("Isikan Foto Anda");
        }
    }
}

