package com.example.abdulkarem.Alani.S300993768;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class AbdulkaremPayment extends AppCompatActivity {

    Button orderbutton;
    EditText nametxtfield, cardtxtfield, emailtxtfield, addresstxtfield;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdulkarem_payment);

        orderbutton = (Button) findViewById(R.id.orderbutton);

        nametxtfield = (EditText) findViewById(R.id.nametxtfield);
        emailtxtfield = (EditText) findViewById(R.id.emailtxtfield);
        cardtxtfield = (EditText) findViewById(R.id.cardtxtfield);
        addresstxtfield = (EditText) findViewById(R.id.addresstxtfield);

        orderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( nametxtfield.getText().toString().length() == 0 )
                    nametxtfield.setError( "First name is required!" );
                else if( cardtxtfield.getText().toString().length() != 16 )
                    cardtxtfield.setError( "Valid card number is required!" );
                else if( emailtxtfield.getText().toString().length() == 0 )
                    emailtxtfield.setError( "Email is required!" );
                else if( addresstxtfield.getText().toString().length() == 0 )
                    addresstxtfield.setError( "Email is required!" );
                else {
                    Intent intent = new Intent(AbdulkaremPayment.this, AbdulkaremMainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}