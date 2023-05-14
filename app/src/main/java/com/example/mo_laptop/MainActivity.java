package com.example.mo_laptop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText EmailEdt,PasswordEdt;
    Button SignBtn,RegBtn;
    user user;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IT mo=new IT("ahmed elshalakany","ahmed@gmail.com","aa11ss11dd11");
        EmailEdt=findViewById(R.id.LogMailEdt);
        PasswordEdt=findViewById(R.id.LogPassEdt);
        SignBtn=findViewById(R.id.SignBtn);
        RegBtn=findViewById(R.id.RegLogBtn);

        SignBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(EmailEdt.getText().toString().equals("") || (PasswordEdt.getText().toString().equals("")))
                {
                    Toast.makeText(MainActivity.this, "please enter email and password", Toast.LENGTH_SHORT).show();
                }
                else if(EmailEdt.getText().toString().equals(mo.getEmail()) && (PasswordEdt.getText().toString().equals(mo.getPassword())))
                {
                    ToItHome();
                }
                else if(EmailEdt.getText().toString().equals(user.arr[0].Email) && (PasswordEdt.getText().toString().equals(user.arr[0].Password)))
                {
                    ToLapStore();
                }
            }
        });


        RegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ToReg();
            }
        });

    }
    void ToItHome()
    {
        Intent intent=new Intent(this,IT_home.class);
        startActivity(intent);
    }
    void ToLapStore()
    {
        Intent intent=new Intent(this,lap_store.class);
        startActivity(intent);
    }
    void ToReg()
    {
        Intent intent=new Intent(this,register.class);
        startActivity(intent);
    }

}