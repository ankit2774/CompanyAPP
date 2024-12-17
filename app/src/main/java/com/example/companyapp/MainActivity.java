package com.example.companyapp;

import android.content.Intent;
import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    Button b1;
    String ad1,ad2;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.login);
        t1=(EditText) findViewById(R.id.uname);
        t2=(EditText) findViewById(R.id.pswd);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ad1=t1.getText().toString();
                    ad2=t2.getText().toString();
                    if(ad1.equals("admin"))
                    {

                        if (ad2.equals("12345"))
                        {
                           Toast.makeText(getApplicationContext(),"GOOD",Toast.LENGTH_LONG).show();
                            flag=0;
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"WRONG PASSWORD",Toast.LENGTH_LONG).show();
                            flag=1;
                        }
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"WRONG USERNAME",Toast.LENGTH_LONG).show();
                        flag=1;
                    }
                    if (flag==1)
                    {
                        Toast.makeText(getApplicationContext(),"CHECK USERNAME AND PASSWORD",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Intent i=new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(i);
                    }
                }
            });


    }
}