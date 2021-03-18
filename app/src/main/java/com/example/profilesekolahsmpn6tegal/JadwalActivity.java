package com.example.profilesekolahsmpn6tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JadwalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);
    }
    public void vii(View view){
        Intent intent=new Intent(JadwalActivity.this, Kelas7Activity.class);
        startActivity(intent);
    }
    public void viii(View view){
        Intent intent=new Intent(JadwalActivity.this, Kelas8Activity.class);
        startActivity(intent);
    }
    public void ix(View view){
        Intent intent=new Intent(JadwalActivity.this, Kelas9Activity.class);
        startActivity(intent);
    }
}