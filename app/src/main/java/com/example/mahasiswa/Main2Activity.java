package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity
        implements MahasiswaFragment.SendData,TampilMahasiswaFragment.SendData2{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       click2();
    }
    public void click (){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        TampilMahasiswaFragment fragmentTmpl = new TampilMahasiswaFragment();
        ft.replace(R.id.frameMain, fragmentTmpl);
        ft.commit();
    }

    public void click2(){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        MahasiswaFragment fragmentMhs = new MahasiswaFragment();
        ft.replace(R.id.frameMain, fragmentMhs);
        ft.commit();
    }
}
