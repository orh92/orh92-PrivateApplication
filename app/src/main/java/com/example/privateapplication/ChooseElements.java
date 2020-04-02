package com.example.privateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ChooseElements extends AppCompatActivity {
Button goToFinishProccess;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_elements);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.titlelayout);

        //spinner info slots
        String[] size = new String[]{
         "0", " 1"," 2"," 3"," 4"," 5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"
        };

        final Spinner chooseOptions23 = findViewById(R.id.chooseOptions23);
        ArrayAdapter<String> chooseOptions23Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions23Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions23.setAdapter(chooseOptions23Adp);

        final Spinner chooseOptions24 = findViewById(R.id.chooseOptions24);
        ArrayAdapter<String> chooseOptions24Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions24Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions24.setAdapter(chooseOptions24Adp);

        final Spinner chooseOptions12 = findViewById(R.id.chooseOptions12);
        ArrayAdapter<String> chooseOptions12Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions12Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions12.setAdapter(chooseOptions12Adp);

        final Spinner chooseOptions25 = findViewById(R.id.chooseOptions25);
        ArrayAdapter<String> chooseOptions25Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions25Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions25.setAdapter(chooseOptions25Adp);

        final Spinner chooseOptions26 = findViewById(R.id.chooseOptions26);
        ArrayAdapter<String> chooseOptions26Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions26Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions26.setAdapter(chooseOptions26Adp);

        final Spinner chooseOptions27 = findViewById(R.id.chooseOptions27);
        ArrayAdapter<String> chooseOptions27Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions27Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions27.setAdapter(chooseOptions27Adp);

        final Spinner chooseOptions28 = findViewById(R.id.chooseOptions28);
        ArrayAdapter<String> chooseOptions28Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions28Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions28.setAdapter(chooseOptions28Adp);

        final Spinner chooseOptions29 = findViewById(R.id.chooseOptions29);
        ArrayAdapter<String> chooseOptions29Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions29Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions29.setAdapter(chooseOptions29Adp);

        final Spinner chooseOptions30 = findViewById(R.id.chooseOptions30);
        ArrayAdapter<String> chooseOptions30Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions30Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions30.setAdapter(chooseOptions30Adp);

        final Spinner chooseOptions31 = findViewById(R.id.chooseOptions31);
        ArrayAdapter<String> chooseOptions31Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions31Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions31.setAdapter(chooseOptions31Adp);

        final Spinner chooseOptions32 = findViewById(R.id.chooseOptions32);
        ArrayAdapter<String> chooseOptions32Adp = new ArrayAdapter<String>(ChooseElements.this,android.R.layout.simple_spinner_item, size);
        chooseOptions32Adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        chooseOptions32.setAdapter(chooseOptions32Adp);
        goToFinishProccess=findViewById(R.id.button8);
        goToFinishProccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChooseElements.this,FinishProccess.class);
                startActivity(intent);
            }
        });

    }
}
