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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data_DosenService = RetrofitClient.getRetrofitInstance()
                .create(DataDosenService.class);
        data_MhsService = RetrofitClient.getRetrofitInstance()
                .create(DataMahasiswaService.class);


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

    private boolean checkPermision() {
        int result = ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.READ_EXTERNAL_STORAGE);
        return result == PackageManager.PERMISSION_GRANTED;
    }

        //menambahkan image//
        private void insertDosenWithFoto(){
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

    }
}