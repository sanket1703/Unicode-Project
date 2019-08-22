package com.example.loginapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;


        import android.widget.Button;
        import android.widget.EditText;
        import android.view.View;
        import android.widget.RadioButton;

public class GetDetails extends AppCompatActivity {

    String[] data = new String[5];
    EditText name,branch,sap,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getdetails);

        Button bt = findViewById(R.id.button);
        name = findViewById(R.id.name);
        branch = findViewById(R.id.branch);
        sap = findViewById(R.id.sap);
        age = findViewById(R.id.age);


        //0 is for name
        //1 is for branch
        //2 is for sap
        //3 is for gender
        //4 is for age

        // For fetching data from user
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data[0]=name.getText().toString();
                data[1]=branch.getText().toString();
                data[2]=sap.getText().toString();
                //gender data sent from radio button
                data[4]=age.getText().toString();

                //For sending data to another Activity - SaveIn

                Intent i3 = new Intent (GetDetails.this, SaveIn.class);
                i3.putExtra("Data",data);
                startActivity(i3);



            }
        });
    }
    // OnClick of Radio Buttons

    public void gen(View v1)
    {
        boolean check = ((RadioButton) v1).isChecked();
        switch (v1.getId())
        {
            case R.id.radioButton1:
                if (check)
                {
                    data[3]="Female";
                }
                else
                {
                    data[3]="Please enter data";
                }

                break;

            case R.id.radioButton2:
                if (check)
                {
                    data[3]="Male";
                }
                else
                {
                    data[3]="Please enter data";
                }
                break;

            case R.id.radioButton3:
                if (check)
                {
                    data[3]="TransGender";
                }
                else
                {
                    data[3]="Please enter data";
                }
                break;
        }
    }


}
