package com.example.privateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrivateProfileEntery extends AppCompatActivity {
    Button enterToPrivateProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_profile_entery);
        enterToPrivateProfile=findViewById(R.id.enterToPrivateProfile);
        enterToPrivateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PrivateProfileEntery.this,PrivateProfile.class);
                startActivity(intent);
            }
        });
    }
}
