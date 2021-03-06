package com.example.abdulkarem.Alani.S300993768;
//Abdulkarem Alani-300993768- lab2
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.content.SharedPreferences;

import java.util.ArrayList;

public class AbdulkaremHomeType extends AppCompatActivity {

    CheckBox apt1checkBox, apt2checkBox, condocheckBox, detachedhome1checkBox, detachedhome2checkBox, semidetached1checkBox, semidetached2checkBox, townhouse1checkBox, townhouse2checkBox;
    Button checkoutbtn;
    ArrayList<String> checkedhomes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alani_home_types);
        //find the correct checkbox
        apt1checkBox = findViewById(R.id.aptonecheckBox);
        apt2checkBox = findViewById(R.id.apttwocheckbox);

        condocheckBox = findViewById(R.id.condocheckBox);

        detachedhome1checkBox = findViewById(R.id.detachedhomeonecheckBox);
        detachedhome2checkBox = findViewById(R.id.detachedhometwocheckBox);

        semidetached1checkBox = findViewById(R.id.semidetachedhomeonecheckBox);
        semidetached2checkBox = findViewById(R.id.semidetachedhometwocheckBox);

        townhouse1checkBox = findViewById(R.id.townhouseonecheckBox);
        townhouse2checkBox = findViewById(R.id.townhousetwocheckBox);

        checkoutbtn = findViewById(R.id.checkoutbutton);





        //adding the selected homes from the list
        checkoutbtn.setOnClickListener(view -> {
            Intent intent = new Intent(AbdulkaremHomeType.this, AbdulkaremCheckoutScreen.class);
            intent.putExtra("homes", checkedhomes);
            startActivity(intent);
        });

    }

    public void onClick(View view) {
        //switching the layout accordingly
        switch(view.getId())
        {
            case R.id.abdulkaremapartmentbtn:
                setContentView(R.layout.alani_apartment);
                break;
            case R.id.abdulkaremdetachedhomebtn:
                setContentView(R.layout.alani_detached_home);
                break;
            case R.id.abdulkaremsemidetachedhomebtn:
                setContentView(R.layout.alani_semi_detached_home);
                break;
            case R.id.abdulkaremcondominiumapartmentbtn:
                setContentView(R.layout.alani_condominium_apartment);
                break;
            case R.id.abdulkaremtownhousebtn:
                setContentView(R.layout.alani_town_house);
                break;

            default: setContentView(R.layout.alani_home_types);
        }


    }

    public void onClickListener(View view)
    {
        //adding the price and address for selected home.
        apt1checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (apt1checkBox.isChecked())
                    checkedhomes.add("Apartment 1 - Price 1111,");
            }
        });

        apt2checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (apt2checkBox.isChecked())
                    checkedhomes.add("Apartment 2 - Price 2222,");
            }
        });

        condocheckBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (condocheckBox.isChecked())
                    checkedhomes.add("Condo 1 - Price 1111,");
            }
        });

        detachedhome1checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (detachedhome1checkBox.isChecked())
                    checkedhomes.add("Detached Home 1 - Price 1111,");
            }
        });
        detachedhome2checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (detachedhome2checkBox.isChecked())
                    checkedhomes.add("Detached Home 2 - Price 2222,");
            }
        });
        semidetached1checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (semidetached1checkBox.isChecked())
                    checkedhomes.add("Semi Detached Home 1 - Price 1111,");
            }
        });
        semidetached2checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (semidetached2checkBox.isChecked())
                    checkedhomes.add("Semi Detached Home 2 - Price 2222,");
            }
        });

        townhouse1checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (townhouse1checkBox.isChecked())
                    checkedhomes.add("Town Home 1 - Price 1111,");
            }
        });
        townhouse2checkBox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (townhouse2checkBox.isChecked())
                    checkedhomes.add("Town Home 2 - Price 2222,");
            }
        });

    }
    

    @Override
    public void onBackPressed(){
        //show the previous view
        setContentView(R.layout.alani_home_types);

        Intent intent = new Intent(AbdulkaremHomeType.this, AbdulkaremHomeType.class);
        intent.putExtra("homes", checkedhomes);
        startActivity(intent);

    }


//tried implementing application pref
    public void sendmsg(View view){
        // Do something in response to button
        SharedPreferences myPreference =
                getSharedPreferences("MyGoodMemory", 0);
        //prepare it for edit by creating and Edit object
        SharedPreferences.Editor prefEditor = myPreference.edit();
        //store a string in memory
        prefEditor.putString("OurString", checkedhomes.toString());
        //commit the transaction
        prefEditor.commit();
        //call intent only to show the next activity
        Intent intent = new Intent(this, AbdulkaremCheckoutScreen.class);
        startActivity(intent);
    }

    public void homes(Context context){
        SharedPreferences myPreference = getSharedPreferences("CheckedHomes", 0);
        SharedPreferences.Editor prefEditor = myPreference.edit();

    }




}
