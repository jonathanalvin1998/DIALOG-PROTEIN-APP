package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ReadActivity extends AppCompatActivity {

    String[] items={"Riyan Mozes Sahetapy ", "Brian Eldrin Sombuk", "Elias Aru F. Langer ", "Aditya Halimawan", "Immanuel Harold Maga",
            "Eben Haezer Gultom", "Yosua Erick Gunawan", "Nana Eka Wulandari", "Eva Kristina", "Jonathan Prajna Marga Parama",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "Emma Norren Cahya Putri", "Michael Gerardi Adji", "Cynthia Kumalasari", "Nikolaus Aryawan Ravato Wijaya", "Daniel Surya Nugraha",
            "Lionrico Sanjay Exauvida Jeipy", "Jonathan Alvin Ananto", "Monica Carista", "Didimus Candra Gased", "Valeriana Tanesha Indra S",
            "Ivan Bernov","Friska F. Nainggolan","Grace Hutabarat","Beni Mulia Tabarus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        ListView lv = findViewById(R.id.lvLoremlpsum);

        Button createBtn = findViewById(R.id.btnCreate);

        Button updateBtn = findViewById(R.id.btnUpdate);

        lv.setAdapter(new ArrayAdapter<String>(ReadActivity.this,android.R.layout.simple_list_item_1,items));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long id) {
                Toast.makeText(ReadActivity.this,"Anda memilih " +
                        items[position], Toast.LENGTH_LONG).show();
            }
        });

        createBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(ReadActivity.this,CreateActivity.class);
                startActivity(i);
            }
        });

        updateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(ReadActivity.this,UpdateActivity.class);
                startActivity(i);
            }
        });
    }
}
