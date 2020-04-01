package com.example.privateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Logistica extends AppCompatActivity {
Button accept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logistica);


        //spinner info slots
        String[] roles = new String[]{
                "נא לבחור מהרשימה",  "קצין",  "לוחם","מש\"קש","חייל מנהלה"
        };
        //role spinner
        final Spinner role = findViewById(R.id.chooseOptions2);
        ArrayAdapter<String> roleApd = new ArrayAdapter<String>(Logistica.this,android.R.layout.simple_spinner_item, roles);
        roleApd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        role.setAdapter(roleApd);



        //spinner info slots
        String[] professions = new String[]{
                "נא לבחור מהרשימה","מא\"ג", "נגביסט","קלע","צלף","חובש"
        };
        //type proffession
        final Spinner profession = findViewById(R.id.chooseOptions3);
        ArrayAdapter<String> professionApd = new ArrayAdapter<String>(Logistica.this,android.R.layout.simple_spinner_item, professions);
        professionApd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        profession.setAdapter(professionApd);


        //spinner info slots
        String[] elements = new String[]{
                "נא לבחור מהרשימה","משקפי מגן","מעיל ב'" ,"ברכיות", "ווסט לוחם","מנשא 90 ל'","קסדה'","מדי ב'"
        };
        //element spinner
        final Spinner elementsSp = findViewById(R.id.chooseOptions4);
        ArrayAdapter<String> elementsAdp = new ArrayAdapter<String>(Logistica.this,android.R.layout.simple_spinner_item, elements);
        elementsAdp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        elementsSp.setAdapter(elementsAdp);



        //spinner info slots
        String[] size = new String[]{
                "0 - 1","0 - 2","0 - 3","0 - 4","0 - 5","נא לבחור מהרשימה"
        };

        //type size
        final Spinner sizeSp = findViewById(R.id.chooseOptions5);
        ArrayAdapter<String> sizeAdp = new ArrayAdapter<String>(Logistica.this,android.R.layout.simple_spinner_item, size);
        sizeAdp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sizeSp.setAdapter(sizeAdp);
        if(!(roles.toString().equals("נא לבחור מהרשימה"))){profession.setVisibility(View.VISIBLE);}

        accept=findViewById(R.id.button6);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(role.toString().equals("נא לבחור מהרשימה"))){Intent intent=new Intent(Logistica.this,FinishProccess.class);
                    startActivity(intent);}
                else{
                    Toast toast=Toast.makeText(getApplicationContext(),"לא ניתן להמשיך, כי לא נבחר תפקיד.", Toast.LENGTH_SHORT);
                }

            }
        });
    }
}
