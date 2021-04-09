package com.profilesekolah.smpn6tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GaleriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
    }
    public void adiwiata(View view){
        Intent intent=new Intent(GaleriActivity.this,AdiwiyataActivity.class);
        startActivity(intent);
    }
    public void salam(View view){
        Intent intent=new Intent(GaleriActivity.this,SalamActivity.class);
        startActivity(intent);
    }
    public void jumatsalam(View view){
        Intent intent=new Intent(GaleriActivity.this,JumatsalamActivity.class);
        startActivity(intent);
    }
    public void pramuka(View view){
        Intent intent=new Intent(GaleriActivity.this,PramukaActivity.class);
        startActivity(intent);
    }
    public void qurban(View view){
        Intent intent=new Intent(GaleriActivity.this,QurbanActivity.class);
        startActivity(intent);
    }
}
