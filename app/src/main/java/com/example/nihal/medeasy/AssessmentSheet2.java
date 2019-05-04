package com.example.nihal.medeasy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.EditText;

public class AssessmentSheet2 extends AppCompatActivity {

    CheckBox level_of_consclousness_A;
    CheckBox level_of_consclousness_P;
    CheckBox level_of_consclousness_V;
    CheckBox level_of_consclousness_U;
    EditText pulse_rate;
    EditText pulse_rhythm;
    EditText pulse_equality;
    CheckBox peripheral_pulsation_felt;
    CheckBox peripheral_pulsation_notfelt;
    EditText vital_signs_bp_right;
    EditText vital_signs_bp_left;
    EditText vital_signs_temp;
    EditText vital_signs_rr;
    EditText vital_signs_o2_saturation;
    CheckBox chest_pain_yes;
    CheckBox chest_pain_no;
    CheckBox head_and_neck_neck_veins;
    CheckBox head_and_neck_other;
    CheckBox ll_oedema_yes;
    CheckBox ll_oedema_no;
    CheckBox ll_oedema_right;
    CheckBox ll_oedema_left;
    CheckBox ll_oedema_bilateral;
    CheckBox ll_oedema_pitting;
    CheckBox ll_oedema_nonpitting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment_sheet2);

        level_of_consclousness_A = findViewById(R.id.level_of_consclousness_A);
        level_of_consclousness_P = findViewById(R.id.level_of_consclousness_P);
        level_of_consclousness_V = findViewById(R.id.level_of_consclousness_V);
        level_of_consclousness_U = findViewById(R.id.level_of_consclousness_U);
        pulse_rate = findViewById(R.id.pulse_rate);
        pulse_rhythm = findViewById(R.id.pulse_rhythm);
        pulse_equality = findViewById(R.id.pulse_equality);
        peripheral_pulsation_felt = findViewById(R.id.peripheral_pulsation_felt);
        peripheral_pulsation_notfelt = findViewById(R.id.peripheral_pulsation_notfelt);
        vital_signs_bp_right = findViewById(R.id.vital_signs_bp_right);
        vital_signs_bp_left = findViewById(R.id.vital_signs_bp_left);
        vital_signs_temp = findViewById(R.id.vital_signs_temp);
        vital_signs_rr = findViewById(R.id.vital_sign_rr);
        vital_signs_o2_saturation = findViewById(R.id.vital_sign_o2_saturation);
        chest_pain_yes = findViewById(R.id.chest_pain_yes);
        chest_pain_no = findViewById(R.id.chest_pain_no);
        head_and_neck_neck_veins = findViewById(R.id.head_and_neck_neck_veins);
        head_and_neck_other = findViewById(R.id.head_and_neck_other);
        ll_oedema_yes = findViewById(R.id.ll_oedema_yes);
        ll_oedema_no = findViewById(R.id.ll_oedema_no);
        ll_oedema_right = findViewById(R.id.ll_oedema_right);
        ll_oedema_left = findViewById(R.id.ll_oedema_left);
        ll_oedema_bilateral = findViewById(R.id.ll_oedema_bilateral);
        ll_oedema_pitting = findViewById(R.id.ll_oedema_pitting);
        ll_oedema_nonpitting = findViewById(R.id.ll_oedema_nonpitting);


    }
}
