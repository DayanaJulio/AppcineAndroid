package com.example.cine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivityAsientos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_asientos);

        TextView textViews00= findViewById(R.id.s00);

        textViews00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acciones a realizar cuando se hace clic en el TextView
                // Puedes agregar aquí tu lógica personalizada
                textViews00.setText("¡Se hizo clic en el TextView!");
            }
        });
    }


        /*int backgroundColor;
        if ( ) {
           backgroundColor = Color.RED;
        } else {
           backgroundColor = Color.BLUE;
       } */

        //textView8a.setBackgroundColor(backgroundColor);
    }
