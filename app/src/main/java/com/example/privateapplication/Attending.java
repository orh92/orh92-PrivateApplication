package com.example.privateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Attending extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attending);

           //spinner info slots
        String[] hours = new String[]{
                "8:00",  "9:00", "10:00"
        };
        //type spinner
        final Spinner spinnerOptions = findViewById(R.id.chooseOptions);
        ArrayAdapter<String> optionsAdp = new ArrayAdapter<String>(Attending.this,android.R.layout.simple_spinner_item, hours);
        optionsAdp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOptions.setAdapter(optionsAdp);
    }



}
