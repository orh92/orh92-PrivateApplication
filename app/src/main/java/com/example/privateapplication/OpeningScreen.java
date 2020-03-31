package com.example.privateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpeningScreen extends AppCompatActivity {
    Button forms;
    Button privateProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_screen);
        forms=findViewById(R.id.forms);
        privateProfile=findViewById(R.id.privateProfile);
        forms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OpeningScreen.this,Forms.class);
                startActivity(intent);

            }
        });
        privateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OpeningScreen.this,PrivateProfile.class);
                startActivity(intent);
            }
        });
    }
}
