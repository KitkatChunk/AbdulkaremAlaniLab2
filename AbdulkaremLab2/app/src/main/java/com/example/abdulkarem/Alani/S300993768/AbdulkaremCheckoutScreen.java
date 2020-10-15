package com.example.abdulkarem.Alani.S300993768;
//Abdulkarem Alani-300993768- lab2
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AbdulkaremCheckoutScreen extends AppCompatActivity {
    TextView textView;
    Button paymentbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alani_checkout_screen);
        //collecting the stored data
        textView = findViewById(R.id.selectedhomestxt);
        ArrayList<String> homeslist = (ArrayList<String>) getIntent().getSerializableExtra("homes");
        textView.setText(String.valueOf(homeslist));

        paymentbutton = findViewById(R.id.paymentbutton);

        //Tried implementing the radio group and radio buttons
   //     public void createRadioButton(final ArrayList<String> homeslist) {
   //         final RadioGroup rg = new RadioGroup(this); // create the RadioGroup
   //         rg.setOrientation(RadioGroup.VERTICAL);
   //         for (int i = 0; i < items.size(); i++) {
  //              RadioButton rb = new RadioButton(this);
  //              rb.setText(items.get(i)+"");
  //              rg.addView(rb);
  //          }
  //      };



        paymentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            //moving to the payment screen
            public void onClick(View v) {
                Intent intent = new Intent(AbdulkaremCheckoutScreen.this, AbdulkaremPayment.class);
                startActivity(intent);
            }
        });

    }
}