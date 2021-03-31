package com.example.profilesekolahsmpn6tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kelas7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas7);
    }
    public void tujuha(View view){
        Intent intent=new Intent(Kelas7Activity.this, VllAActivity.class);
        startActivity(intent);
    }
    public void tujuhb(View view){
        Intent intent=new Intent(Kelas7Activity.this, VllBActivity.class);
        startActivity(intent);
    }
    public void tujuhc(View view){
        Intent intent=new Intent(Kelas7Activity.this, VllCActivity.class);
        startActivity(intent);
    }
    public void tujuhd(View view){
        Intent intent=new Intent(Kelas7Activity.this, VllDActivity.class);
        startActivity(intent);
    }
    public void tujuhe(View view){
        Intent intent=new Intent(Kelas7Activity.this, VllEActivity.class);
        startActivity(intent);
    }
    public void tujuhf(View view){
        Intent intent=new Intent(Kelas7Activity.this, VllFActivity.class);
        startActivity(intent);
    }
    public void tujuhg(View view){
        Intent intent=new Intent(Kelas7Activity.this, VllGActivity.class);
        startActivity(intent);
    }
    public void tujuhh(View view){
        Intent intent=new Intent(Kelas7Activity.this, VllHActivity.class);
        startActivity(intent);
    }
}