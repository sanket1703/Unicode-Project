package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileInputStream;

import static com.example.loginapplication.SaveIn.SHARED_PREFS;

public class show extends AppCompatActivity {

    TextView Head,Name,Age,Gender,Sap,Branch;
    String[] dataCopyHere = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);

        //importing data from SP -> passing it to dataCopyHere string array obj

        dataCopyHere[0] = sharedPreferences.getString("Name","N/A");
        dataCopyHere[1] = sharedPreferences.getString("Branch","N/A");
        dataCopyHere[2] = sharedPreferences.getString("SAP","N/A");
        dataCopyHere[3] = sharedPreferences.getString("Gender","N/A");
        dataCopyHere[4] = sharedPreferences.getString("Age","N/A");
        Head=findViewById(R.id.Head);
        Age=findViewById(R.id.Age);
        Gender=findViewById(R.id.Gender);
        Sap=findViewById(R.id.Sap);
        Branch=findViewById(R.id.Branch);
        Name=findViewById(R.id.Name);

        //Putting those values to the text view

        Head.setText(dataCopyHere[0]+"! These are your saved details");
        Name.setText( "Name:"+"\t"+dataCopyHere[0]);
        Sap.setText( "SAP:"+"\t"+dataCopyHere[2]);
        Branch.setText("Branch:"+"\t"+dataCopyHere[1]);
        Gender.setText("Gender:"+"\t"+dataCopyHere[3]);
        Age.setText("Age:"+"\t"+dataCopyHere[4]);

    }

}
