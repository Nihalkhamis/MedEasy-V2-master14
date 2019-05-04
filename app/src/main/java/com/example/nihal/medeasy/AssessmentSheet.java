package com.example.nihal.medeasy;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AssessmentSheet extends AppCompatActivity {

    private EditText yourComplaint ;
    private LinearLayout pastHistory ;
    private LinearLayout hideLinearLayoutPastHistory ;
    private EditText pasthistory_editText;
    FirebaseDatabase database ;
    DatabaseReference myRef ;


    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment_sheet);


        yourComplaint = findViewById(R.id.yourComplaint);
        yourComplaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeKeyboard();
            }
        });


        //visible the editText in pastHistory Section
        pastHistory = findViewById(R.id.pastHistory_Section);
        hideLinearLayoutPastHistory = findViewById(R.id.hideLinearLayoutPastHistory);
        pasthistory_editText = findViewById(R.id.pasthistory_editText);
        pastHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    flag = 1 ;
                    pasthistory_editText.setVisibility(View.VISIBLE);
                }
                else {
                    flag = 0 ;
                    pasthistory_editText.setVisibility(View.INVISIBLE);
                }
            }
        }) ;

    }

    public void closeKeyboard(){
        View view = this.getCurrentFocus();
        if(view != null){
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(),0);
        }
    }
}
