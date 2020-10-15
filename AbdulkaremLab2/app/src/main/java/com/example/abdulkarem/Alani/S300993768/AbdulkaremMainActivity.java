package com.example.abdulkarem.Alani.S300993768;
//Abdulkarem Alani-300993768- lab2
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AbdulkaremMainActivity extends AppCompatActivity {


    private Button btnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alani_activity_main);

       // image display
        ImageView myImageView = (ImageView) findViewById(R.id.AlaniImageview);
        myImageView.setImageResource(R.drawable.renthome);

        btnMove = findViewById(R.id.AlaniStartButton);

        btnMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                moveToHomeType();
            }
        });

    }

    private void moveToHomeType(){
        Intent intent = new Intent(AbdulkaremMainActivity.this, AbdulkaremHomeType.class);
        startActivity(intent);
    }
}