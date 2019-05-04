package com.example.nihal.medeasy.Models;

public  class Drugs {
    public String name,dose,tperd,duration;

    public Drugs(String name, String dose, String tperd, String duration) {
        this.name = name;
        this.dose = dose;
        this.tperd = tperd;
        this.duration = duration;
    }



    public String getname() {

        return name;
    }
    public String getdose() {
        return dose;
    }
    public String gettperd() {
        return tperd;
    }
    public String getduration() {
        return duration;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public void setTperd(String tperd) {
        this.tperd = tperd;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}

