package com.example.privateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
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
    Button toElements;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logistica);
          getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.titlelayout);
toElements=findViewById(R.id.button9);
toElements.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Logistica.this,ChooseElements.class);
        startActivity(intent);
    }
});

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


        profession.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String  st = parent.getItemAtPosition(position).toString();
                if (!(st.equals("נא לבחור מהרשימה"))) {

                    findViewById(R.id.textView14).setVisibility(View.VISIBLE);
                    findViewById(R.id.button9).setVisibility(View.VISIBLE);
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
                if(!(role.getSelectedItem().toString().equals("נא לבחור מהרשימה"))){
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
