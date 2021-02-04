package com.example.profilesekolahsmpn6tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HalamanBaruActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_baru);
        }
    public void prestasi(View view){
        Intent intent=new Intent(HalamanBaruActivity.this, PrestasiActivity.class);
        startActivity(intent);
    }
    public void profil(View view){
        Intent intent=new Intent(HalamanBaruActivity.this, ProfilActivity.class);
        startActivity(intent);
    }
    public void informasi(View view){
        Intent intent=new Intent(HalamanBaruActivity.this, InformasiActivity.class);
        startActivity(intent);
    }
    public void tugas(View view){
        Intent intent=new Intent(HalamanBaruActivity.this, TugasActivity.class);
        startActivity(intent);
    }

    public void ekstrakulikuler(View view){
        Intent intent=new Intent(HalamanBaruActivity.this, EkstrakulikulerActivity.class);
        startActivity(intent);
    }
    public void absen(View view){
        Intent intent=new Intent(HalamanBaruActivity.this, AbsenActivity.class);
        startActivity(intent);
    }


}