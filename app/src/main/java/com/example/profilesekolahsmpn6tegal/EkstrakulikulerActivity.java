package com.example.profilesekolahsmpn6tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EkstrakulikulerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstrakulikuler);
    }
    public void futsal(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, FutsalActivity.class);
        startActivity(intent);
    }
    public void volly(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, VollyActivity.class);
        startActivity(intent);
    }
    public void basket(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, BasketActivity.class);
        startActivity(intent);
    }
    public void marchingband(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, MarchingbandActivity.class);
        startActivity(intent);
    }
    public void silat(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, SilatActivity.class);
        startActivity(intent);
    }
}