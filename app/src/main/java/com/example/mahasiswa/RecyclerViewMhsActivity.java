package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mahasiswa.Adapter.MahasiswaAdapter;
import com.example.mahasiswa.Adapter.MahasiswaSiAdapter;
import com.example.mahasiswa.Model.Mahasiswa;
import com.example.mahasiswa.Model.MahasiswaSI;

import java.util.ArrayList;

public class RecyclerViewMhsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaSiAdapter mhsSIAdapter;
    private ArrayList<MahasiswaSI> mhsSIArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_mhs);

        addData();

        recyclerView = findViewById(R.id.rvMahasiswa);
        mhsSIAdapter = new MahasiswaSiAdapter(mhsSIArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewMhsActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mhsSIAdapter);
    }
    private  void addData(){
        mhsSIArrayList =  new ArrayList<>();
        mhsSIArrayList.add(new MahasiswaSI("Michael Gerardi Adji","72170100","Basket","Membahagiakan Ortu","Maju Terus Pantang Mundur",R.drawable.mekel));
        mhsSIArrayList.add(new MahasiswaSI("Emma Norren Cahya Putri","72170097","Menggambar","Dokter","Percaya kepada Tuhan",R.drawable.emma));
        mhsSIArrayList.add(new MahasiswaSI("Aditya Halimawan","72160032","Tidur","Raja Arab","Percaya Diri",R.drawable.adit));
        mhsSIArrayList.add(new MahasiswaSI("Angkie Octovaldo Elias Wangkay","72170146","Tidur","Membahagiakan Ortu","Terus Berusaha",R.drawable.angkie));
    }

}
