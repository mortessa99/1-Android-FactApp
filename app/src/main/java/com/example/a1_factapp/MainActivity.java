package com.example.a1_factapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtFact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFact = findViewById(R.id.txtFact);
        //txtFact.setText("Morteza Jahanbakhsh");

        String[] myFacts = Fact.getFacts();
        for (String fact:myFacts){
            txtFact.append(fact+"\n\n");
        }
    }
}