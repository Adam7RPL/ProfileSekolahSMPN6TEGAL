package com.example.profilesekolahsmpn6tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsInfo;

    private String Username = "siswa";
    private String Password = "siswa123";

    boolean isValid = false;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.etName);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);
        eAttemptsInfo = findViewById(R.id.tvAttemptsInfo);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter all the details correctly!", Toast.LENGTH_SHORT).show();
                }else{

                    isValid = validate(inputName, inputPassword);

                    if(!isValid){

                        counter--;

                        Toast.makeText(MainActivity.this, "Incorrect credentials entered!", Toast.LENGTH_SHORT).show();

                        eAttemptsInfo.setText("No. of attempts remaining: 0" + counter);

                        if(counter ==0){
                            eLogin.setEnabled(false);
                        }
                    }else {

                        Toast.makeText(MainActivity.this, "Login successfull!", Toast.LENGTH_SHORT).show();

                        //tambahkan kode untuk pergi ke aktivitas baru
                        Intent intent = new Intent(MainActivity.this, HalamanBaruActivity.class);
                        startActivity(intent);
                    }

                }

            }
        });
    }

    private boolean validate(String name,String password){
        if(name.equals(Username)&& password.equals(Password)){
            return true;
        }

        return false;
    }
    public void profil(View view){
        Intent intent=new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }
    public void prestasi(View view){
        Intent intent=new Intent(MainActivity.this, PrestasiActivity.class);
        startActivity(intent);
    }
    public void galeri(View view){
        Intent intent=new Intent(MainActivity.this, GaleriActivity.class);
        startActivity(intent);
    }
    public void visidanmisi(View view){
        Intent intent=new Intent(MainActivity.this, VisidanmisiActivity.class);
        startActivity(intent);
    }
    public void ekstrakulikuler(View view){
        Intent intent=new Intent(MainActivity.this, EkstrakulikulerActivity.class);
        startActivity(intent);
    }
    public void jadwal(View view){
        Intent intent=new Intent(MainActivity.this, JadwalActivity.class);
        startActivity(intent);
    }

    public void bk(View view){
        Intent intent=new Intent(MainActivity.this, BkActivity.class);
        startActivity(intent);
    }
    public void gurustaff(View view){
        Intent intent=new Intent(MainActivity.this, GuruStaffdanSatpamActivity.class);
        startActivity(intent);
    }


}