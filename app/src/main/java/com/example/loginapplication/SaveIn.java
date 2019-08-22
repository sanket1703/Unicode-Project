package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class SaveIn extends AppCompatActivity {

    String[] data1 = new String[5];
    SharedPreferences sharedPreferences;
    public static final String SHARED_PREFS = "sharedPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savein);

        //Fetching data from GetDetails

        Intent i4 = getIntent();
        data1 = i4.getStringArrayExtra("Data");


        TextView Head, Name, Age, Gender, Sap, Branch;
        Head = findViewById(R.id.Head);
        Age = findViewById(R.id.Age);
        Gender = findViewById(R.id.Gender);
        Sap = findViewById(R.id.Sap);
        Branch = findViewById(R.id.Branch);
        Name = findViewById(R.id.Name);

        // Display Data

        Head.setText(data1[0] + "! Check your details below.");
        Name.setText("Name:" + "\t" + data1[0]);
        Sap.setText("SAP:" + "\t" + data1[2]);
        Branch.setText("Branch:" + "\t" + data1[1]);
        Gender.setText("Gender:" + "\t" + data1[3]);
        Age.setText("Age:" + "\t" + data1[4]);


    }

    // Action when save button clicked

    public void save(View v) {

        saveData();

    }

    //Function for saving data to Shared Preferences

    public void saveData()
    {
        sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("Name",data1[0]);
        editor.putString("Branch",data1[1]);
        editor.putString("SAP",data1[2]);
        editor.putString("Gender",data1[3]);
        editor.putString("Age",data1[4]);
        editor.commit();

        Toast.makeText(this,"Data saved",Toast.LENGTH_LONG).show();
    }

}


