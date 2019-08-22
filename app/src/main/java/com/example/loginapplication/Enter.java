package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Enter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter);


    }

    public void getDetails(View v)

    {
        Intent i1 = new Intent (Enter.this,show.class);
        startActivity(i1);
    }
    public void addDetails(View v)
    {
        Intent i2 = new Intent (Enter.this, GetDetails.class);
        startActivity(i2);
    }



}

