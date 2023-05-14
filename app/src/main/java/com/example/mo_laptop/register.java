package com.example.mo_laptop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity
{
    EditText EmailEdt1,PasswordEdt1,Fname,Lname;
    Button RegBtn1;
    int user_counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)

    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        user user=new user();
        EmailEdt1=findViewById(R.id.MailRegEdt);
        PasswordEdt1=findViewById(R.id.PassRegEdt);
        Fname=findViewById(R.id.FnameEdt);
        Lname=findViewById(R.id.LnameEdt);
        RegBtn1=findViewById(R.id.RegRegBtn);

        RegBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if(EmailEdt1.getText().toString().equals("") || (PasswordEdt1.getText().toString().equals(""))|| (Fname.getText().toString().equals(""))|| (Lname.getText().toString().equals("")))
                {
                    Toast.makeText(register.this, "please enter email,password,firstname and lastname", Toast.LENGTH_SHORT).show();
                }
                else
                {

                   user.arr[user_counter].Email.equals(EmailEdt1.getText().toString());
                   user.arr[user_counter].Password.equals(PasswordEdt1.getText().toString());
                   user.arr[user_counter].FirstName.equals(Fname.getText().toString());
                   user.arr[user_counter].LastName.equals(Lname.getText().toString());
                   user_counter++;
                    ToMain();
                }
            }
        });
    }
    void ToMain()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}