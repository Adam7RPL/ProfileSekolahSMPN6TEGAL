package com.example.profilesekolahsmpn6tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bk);
    }
    public void profilgurubk(View view){
        Intent intent=new Intent(BkActivity.this, ProfilgurubkActivity.class);
        startActivity(intent);
    }
    public void materibk(View view){
        Intent intent=new Intent(BkActivity.this, MateribkActivity.class);
        startActivity(intent);
    }
}