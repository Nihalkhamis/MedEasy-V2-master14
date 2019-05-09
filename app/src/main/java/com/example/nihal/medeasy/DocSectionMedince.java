package com.example.nihal.medeasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.nihal.medeasy.Adapters.AddMedcineAdapter;
import com.example.nihal.medeasy.Models.Drugs;

import java.util.ArrayList;

public class DocSectionMedince extends AppCompatActivity {
    RecyclerView RV;
    AddMedcineAdapter adapter;
    ArrayList<Drugs> drugs;

    EditText add_Medicine,bar_day,dose,start_time,end_time ;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_section_medince);
        RV=findViewById(R.id.RV);
        drugs =new ArrayList<>();
        adapter=new AddMedcineAdapter(drugs);
        RV.setLayoutManager(new LinearLayoutManager(this));
        RV.setAdapter(adapter);

        add_Medicine = findViewById(R.id.add_Medicine);
        bar_day = findViewById(R.id.bar_day);
        dose = findViewById(R.id.dose);
        start_time = findViewById(R.id.start_time);
        end_time = findViewById(R.id.end_time);
        save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drugs.add(new Drugs(add_Medicine.getText().toString(),bar_day.getText().toString(),dose.getText().toString(),start_time.getText().toString(),end_time.getText().toString()));
                adapter.notifyDataSetChanged();
            }
        });



    }
}
