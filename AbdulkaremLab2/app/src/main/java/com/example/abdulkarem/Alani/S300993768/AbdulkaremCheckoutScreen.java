package com.example.abdulkarem.Alani.S300993768;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AbdulkaremCheckoutScreen extends AppCompatActivity {
    TextView textView;
    Button paymentbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdulkarem_checkout_screen);

        textView = findViewById(R.id.selectedhomestxt);
        ArrayList<String> homeslist = (ArrayList<String>) getIntent().getSerializableExtra("homes");
        textView.setText(String.valueOf(homeslist));

        paymentbutton = findViewById(R.id.paymentbutton);


        paymentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbdulkaremCheckoutScreen.this, AbdulkaremPayment.class);
                startActivity(intent);
            }
        });

    }
}