package com.example.profilesekolahsmpn6tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kelas8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas8);
    }
    public void delapana(View view){
        Intent intent=new Intent(Kelas8Activity.this, VlllAActivity.class);
        startActivity(intent);
    }
    public void delapanb(View view){
        Intent intent=new Intent(Kelas8Activity.this, VlllBActivity.class);
        startActivity(intent);
    }
    public void delapanc(View view){
        Intent intent=new Intent(Kelas8Activity.this, VlllCActivity.class);
        startActivity(intent);
    }
    public void delapand(View view){
        Intent intent=new Intent(Kelas8Activity.this, VlllDActivity.class);
        startActivity(intent);
    }
    public void delapane(View view){
        Intent intent=new Intent(Kelas8Activity.this, VlllEActivity.class);
        startActivity(intent);
    }
    public void delapanf(View view){
        Intent intent=new Intent(Kelas8Activity.this, VlllFActivity.class);
        startActivity(intent);
    }
    public void delapang(View view){
        Intent intent=new Intent(Kelas8Activity.this, VlllGActivity.class);
        startActivity(intent);
    }
    public void delapanh(View view){
        Intent intent=new Intent(Kelas8Activity.this, VlllHActivity.class);
        startActivity(intent);
    }
}