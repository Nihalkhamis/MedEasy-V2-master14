package com.example.nihal.medeasy;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.nihal.medeasy.Adapters.AddMedcineAdapter;
import com.example.nihal.medeasy.Models.AssessmentSheetModel;
import com.example.nihal.medeasy.Models.Drugs;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.orhanobut.hawk.Hawk;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DocSectionMedince extends AppCompatActivity {
    RecyclerView RV;
    AddMedcineAdapter adapter;
    ArrayList<Drugs> drugs;

    EditText add_Medicine, bar_day, dose, start_time, end_time;
    Button save, commit;
    FirebaseDatabase database1;
    DatabaseReference myRef1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_section_medince);
        RV = findViewById(R.id.RV);
        drugs = new ArrayList<>();
        adapter = new AddMedcineAdapter(drugs, new AddMedcineAdapter.OnItemClick() {
            @Override
            public void setOnItemClick(final int position) {


                new AlertDialog.Builder(DocSectionMedince.this)
                        .setTitle("")
                        .setMessage("are you sure you want to delete this item ?")

                        // Specifying a listener allows you to take an action before dismissing the dialog.
                        // The dialog is automatically dismissed when a dialog button is clicked.
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Continue with delete operation
                                drugs.remove(position);
                                adapter.notifyDataSetChanged();
                            }
                        })

                        // A null listener allows the button to dismiss the dialog and take no further action.
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();


            }

        });
        RV.setLayoutManager(new LinearLayoutManager(this));
        RV.setAdapter(adapter);
        Hawk.init(this).build();
        add_Medicine = findViewById(R.id.add_Medicine);
        bar_day = findViewById(R.id.bar_day);
        dose = findViewById(R.id.dose);
        start_time = findViewById(R.id.start_time);
        end_time = findViewById(R.id.end_time);
        save = findViewById(R.id.save);
        commit = findViewById(R.id.commit);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drugs drug = new Drugs(add_Medicine.getText().toString()
                        , bar_day.getText().toString()
                        , dose.getText().toString()
                        , start_time.getText().toString() + ""
                        , end_time.getText().toString() + "");

                drugs.add(drug);


                adapter.notifyDataSetChanged();
            }
        });

        commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < drugs.size(); i++) {
                    Drugs drug = drugs.get(i);
                    writeOnDataBase(drug);
                }

            }
        });


    }

    public void writeOnDataBase(Drugs model) {
        database1 = FirebaseDatabase.getInstance();
        String key;
        myRef1 = database1.getReference("Users").child("1UbTozyso3SR8ZY7y0O6mZxTVqd2").child("Roshetat");
        if (Hawk.contains("Key")) {


            key = Hawk.get("Key");


        } else {
            key = myRef1.push().getKey();
            Hawk.put("Key", key);
        }

        myRef1.child(key).child("Rosheta").child("Medicine").push().setValue(model);
        //Log.d("TTTT", "writeOnDataBase: " + key);
    }

}
