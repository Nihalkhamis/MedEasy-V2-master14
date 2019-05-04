package com.example.nihal.medeasy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.nihal.medeasy.Adapters.DrugsAdapter;
import com.example.nihal.medeasy.Models.Drugs;

import java.util.ArrayList;


public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Drugs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);






    ArrayList<Drugs> drugs = new ArrayList<>();
    String drugname[] = {"Actemra", "Losartan", "Meloxicam", "Zinacef", "Doxycycline"};
    String drugdose[] = {"50g", "90g", "50g", "75g", "60g"};
    String drugperday[] = {"2 in day", "2 in day", "1 in day", "2 in day", "3 in day"};
    String drugduration[] = {"6 monthes", "3 monthes", "1 month", "8 monthes", "6 monthes"};


   for(int i=0;i<drugname.length;i++){

       Drugs drugs1 = new Drugs(drugname[i],drugdose[i],drugperday[i],drugduration[i]);

       drugs.add(drugs1);

   }
        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        DrugsAdapter adapter = new DrugsAdapter(drugs);
        recyclerview.setAdapter(adapter);

    }


}
