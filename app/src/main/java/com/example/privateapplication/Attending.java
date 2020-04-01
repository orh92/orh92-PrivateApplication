package com.example.privateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Attending extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attending);
        Button goToLogistica;
        goToLogistica=findViewById(R.id.button4);
        goToLogistica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Attending.this, Logistica.class);
                startActivity(intent);
            }
        });
           //spinner info slots
        String[] hours = new String[]{
                "נא לבחור מהרשימה", "6:00 - 8:00","8:00 - 10:00",  "10:00 - 12:00", "12:00 - 14:00","14:00 - 16:00","16:00 - 18:00"
        };
        //type spinner
        final Spinner spinnerOptions = findViewById(R.id.chooseOptions);
        ArrayAdapter<String> optionsAdp = new ArrayAdapter<String>(Attending.this,android.R.layout.simple_spinner_item, hours);
        optionsAdp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOptions.setAdapter(optionsAdp);
    }



}
