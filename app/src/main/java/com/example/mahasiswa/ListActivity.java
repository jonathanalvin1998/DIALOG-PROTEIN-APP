package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Spinner spinner = findViewById(R.id.spinnerProgmob);

        ListView lv = (ListView)findViewById(R.id.lvLoremlpsum);

        lv.setAdapter(new ArrayAdapter<String>(ListActivity.this,android.R.layout.simple_list_item_1,items));
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long id) {
                Toast.makeText(ListActivity.this,"Anda memilih " +
                        items[position], Toast.LENGTH_LONG).show();
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l)
            {
                Toast.makeText(ListActivity.this, "Anda memilih = " + items[i], Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(ListActivity.this, "Anda tidak memilih ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

