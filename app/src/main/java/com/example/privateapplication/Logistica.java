package com.example.privateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
                "נא לבחור מהרשימה",  "קצין",  "לוחם","מפקד שאינו קצין","חייל מנהלה"
        };
        //role spinner
        final Spinner role = findViewById(R.id.chooseOptions2);
        ArrayAdapter<String> roleApd = new ArrayAdapter<String>(Logistica.this,android.R.layout.simple_spinner_item, roles);
        roleApd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        role.setAdapter(roleApd);



        //spinner info slots
        String[] professions = new String[]{
                "נא לבחור מהרשימה","מא\"ג", "נגביסט","קלע","צלף","חובש","מטול"
        };
        //type proffession
        final Spinner profession = findViewById(R.id.chooseOptions3);
        ArrayAdapter<String> professionApd = new ArrayAdapter<String>(Logistica.this,android.R.layout.simple_spinner_item, professions);
        professionApd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        profession.setAdapter(professionApd);

        role.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String  st = parent.getItemAtPosition(position).toString();
                if (st.equals("לוחם")) {
                    profession.setVisibility(View.VISIBLE);
                    findViewById(R.id.textView13).setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //spinner info slots
        String[] elements = new String[]{
                "נא לבחור מהרשימה","מחסניות","שקית שתייה","קיטבג","שק שינה","מעיל ב'","משקפי מגן","ברכיות", "ווסט לוחם","מנשא 90 ליטר","קסדה'","מדי ב'"
        };

        //element spinner
        final Spinner elementsSp = findViewById(R.id.chooseOptions4);
        ArrayAdapter<String> elementsAdp = new ArrayAdapter<String>(Logistica.this,android.R.layout.simple_spinner_item, elements);
        elementsAdp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        elementsSp.setAdapter(elementsAdp);

        profession.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String  st = parent.getItemAtPosition(position).toString();
                if (!(st.equals("נא לבחור מהרשימה"))) {
                    elementsSp.setVisibility(View.VISIBLE);
                    findViewById(R.id.textView14).setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //spinner info slots
        String[] size = new String[]{
               "נא לבחור מהרשימה", " 1"," 2"," 3"," 4"," 5","6","7","8","9","10","11","12"
        };

        //type size
        final Spinner sizeSp = findViewById(R.id.chooseOptions5);
        ArrayAdapter<String> sizeAdp = new ArrayAdapter<String>(Logistica.this,android.R.layout.simple_spinner_item, size);
        sizeAdp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sizeSp.setAdapter(sizeAdp);


        elementsSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String  st = parent.getItemAtPosition(position).toString();
                if (!(st.equals("נא לבחור מהרשימה"))) {
                    sizeSp.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        accept=findViewById(R.id.button6);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(profession.getSelectedItem().toString().equals("נא לבחור מהרשימה"))){
                    Intent intent=new Intent(Logistica.this,FinishProccess.class);
                    startActivity(intent);}
                else{
                    Toast toast=Toast.makeText(Logistica.this,"לא ניתן להמשיך, כי לא נבחר תפקיד.", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
    }
}
