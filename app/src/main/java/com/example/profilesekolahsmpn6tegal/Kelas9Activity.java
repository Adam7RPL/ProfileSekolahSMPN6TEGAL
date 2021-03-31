package com.example.profilesekolahsmpn6tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kelas9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas9);
    }
    public void sembilana(View view){
        Intent intent=new Intent(Kelas9Activity.this, IXAActivity.class);
        startActivity(intent);
    }
    public void sembilanb(View view){
        Intent intent=new Intent(Kelas9Activity.this, IXBActivity.class);
        startActivity(intent);
    }
    public void sembilanc(View view){
        Intent intent=new Intent(Kelas9Activity.this, IXCActivity.class);
        startActivity(intent);
    }
    public void sembiland(View view){
        Intent intent=new Intent(Kelas9Activity.this, IXDActivity.class);
        startActivity(intent);
    }
    public void sembilane(View view){
        Intent intent=new Intent(Kelas9Activity.this, IXEActivity.class);
        startActivity(intent);
    }
    public void sembilanf(View view){
        Intent intent=new Intent(Kelas9Activity.this, IXFActivity.class);
        startActivity(intent);
    }
    public void sembilang(View view){
        Intent intent=new Intent(Kelas9Activity.this, IXGActivity.class);
        startActivity(intent);
    }
    public void sembilanh(View view){
        Intent intent=new Intent(Kelas9Activity.this, IXHActivity.class);
        startActivity(intent);
    }
}