package com.example.abdulkarem.Alani.S300993768;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AbdulkaremHomeType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abdulkarem_home_types);
    }

    public void onClick(View view) {
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

            default: setContentView(R.layout.abdulkarem_home_types);
        }
    }

    @Override
    public void onBackPressed(){
        //show the previous view
        setContentView(R.layout.abdulkarem_home_types);

    }

}