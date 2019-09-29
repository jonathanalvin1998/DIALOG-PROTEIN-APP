package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mahasiswaBtn = findViewById(R.id.btnMahasiswa);

        Button listBtn = findViewById(R.id.btnList);

        Button kelolaBtn = findViewById(R.id.btnKelola);

        Button dataBtn = findViewById(R.id.btnDataMahasiswa);

        Button dataSIBtn = findViewById(R.id.btnDataMahasiswaSI);

        mahasiswaBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
        dataSIBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,RecyclerViewMhsActivity.class);
                startActivity(i);
            }
        });
        kelolaBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,ReadActivity.class);
                startActivity(i);
            }
        });
        dataBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(i);
            }
        });
        listBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                startActivity(i);
            }
        });
    }
}
