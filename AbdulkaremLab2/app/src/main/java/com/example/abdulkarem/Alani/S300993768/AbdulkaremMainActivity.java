package com.example.abdulkarem.Alani.S300993768;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class AbdulkaremMainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // image display
        ImageView myImageView = (ImageView) findViewById(R.id.AlaniImageview);
        myImageView.setImageResource(R.drawable.renthome);

    }
}