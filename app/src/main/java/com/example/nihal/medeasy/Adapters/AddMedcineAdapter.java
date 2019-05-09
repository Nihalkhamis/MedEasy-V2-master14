package com.example.nihal.medeasy.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nihal.medeasy.Models.Drugs;

import java.util.ArrayList;

public class AddMedcineAdapter extends RecyclerView.Adapter<AddMedcineAdapter.MedHolder> {

    ArrayList<Drugs> drugs;

    public AddMedcineAdapter(ArrayList<Drugs> drugs) {
        this.drugs = drugs;
    }

    @NonNull
    @Override
    public MedHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View row = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.add_drugs, viewGroup, false);
        //DrugsHolder holder = new DrugsHolder(row);
        return new AddMedcineAdapter.MedHolder(row);

    }

    @Override
    public void onBindViewHolder(@NonNull MedHolder medHolder, int i) {
        medHolder.name.setText(drugs.get(i).name);
        medHolder.dose.setText(drugs.get(i).dose);
        medHolder.date.setText(drugs.get(i).getFrom()+" to "+drugs.get(i).getTo());
    }

    @Override
    public int getItemCount() {
        return drugs.size();
    }

    public class MedHolder extends RecyclerView.ViewHolder {
        TextView name, dose, date;

        public MedHolder(@NonNull View itemView) {

            super(itemView);
//            name = itemView.findViewById(R.id.name);
//            dose = itemView.findViewById(R.id.dose);
//            date = itemView.findViewById(R.id.date);


        }


    }
}
