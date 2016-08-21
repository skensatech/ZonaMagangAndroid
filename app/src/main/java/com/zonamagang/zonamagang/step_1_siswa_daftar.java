package com.zonamagang.zonamagang;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.*;
import android.view.View;
import android.widget.*;
import android.widget.Toolbar;


import java.util.ArrayList;
import java.util.List;

public class step_1_siswa_daftar extends AppCompatActivity {
    //deklarasi
    String email,password;
    Button y;
    String selectedItem="";
    int array_bulan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_1_siswa_daftar);

        //coding untuk toolbar
        android.support.v7.widget.Toolbar x = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(x);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //coding untuk jika button click
        y =(Button) findViewById(R.id.BtnSiswa_step_1_submit);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(getApplicationContext(),step_2_siswa.class);
                startActivity(z);
            }
        });
        //Passing form sebelumnya
        email = getIntent().getStringExtra("email");
        password = getIntent().getStringExtra("pass");

        //coding untuk spinner
        final Spinner tahun = (Spinner) findViewById(R.id.tahun);
        List<String> tahuns = new ArrayList<>();
        tahuns.add("Tahun");
        for (int i = 1990; i <= 2002; i++)
            tahuns.add(""+i);
        ArrayAdapter<String> tahun_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, tahuns);
        tahun.setAdapter(tahun_adapter);
        tahun.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                selectedItem = tahun.getSelectedItem().toString();


            }

            public void onNothingSelected(AdapterView<?> arg0) {


            }
        });
        Spinner bulan = (Spinner) findViewById(R.id.bulan);
        List<String> bulans = new ArrayList<>();
        bulans.add("Bulan");
        bulans.add("Januari");
        bulans.add("Februari");
        bulans.add("Maret");
        bulans.add("April");
        bulans.add("Mei");
        bulans.add("Juni");
        bulans.add("Juli");
        bulans.add("Agustus");
        bulans.add("September");
        bulans.add("Oktober");
        bulans.add("November");
        bulans.add("Desember");
        ArrayAdapter<String> bulan_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, bulans);
        bulan.setAdapter(bulan_adapter);
        bulan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                array_bulan = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                array_bulan = 1;
            }
        });

        Spinner tanggal = (Spinner) findViewById(R.id.tanggal);
        List<String> tanggals = new ArrayList<String>();
        int batas;
//        if ((array_bulan % 2) == 1)
//            batas = 31;
//        else
//            batas = 30;
//        for (int i = 1; i <= batas; i++)
//            tanggals.add(""+i);
        tanggals.add("Tanggal");
        tanggals.add(""+array_bulan);
        ArrayAdapter<String> tanggal_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, tanggals);
        tanggal.setAdapter(tanggal_adapter);

    }
}
