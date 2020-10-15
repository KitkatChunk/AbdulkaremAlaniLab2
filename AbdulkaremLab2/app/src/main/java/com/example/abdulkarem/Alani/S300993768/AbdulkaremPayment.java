package com.example.abdulkarem.Alani.S300993768;
//Abdulkarem Alani-300993768- lab2
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AbdulkaremPayment extends AppCompatActivity {
//declaring of button and edit text
    Button orderbutton;
    EditText nametxtfield, cardtxtfield, emailtxtfield, addresstxtfield;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alani_payment);

        orderbutton = (Button) findViewById(R.id.orderbutton);

        nametxtfield = (EditText) findViewById(R.id.nametxtfield);
        emailtxtfield = (EditText) findViewById(R.id.emailtxtfield);
        cardtxtfield = (EditText) findViewById(R.id.cardtxtfield);
        addresstxtfield = (EditText) findViewById(R.id.addresstxtfield);

        //Edit field Validation according to the fields.
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