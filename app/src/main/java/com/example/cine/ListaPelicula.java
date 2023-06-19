package com.example.cine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaPelicula extends AppCompatActivity {

    ImageView movieimagen;
    TextView movietext;

    Button buttonEscoger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pelicula);
     movieimagen= (ImageView) findViewById(R.id.movieImagen);
     movietext= (TextView) findViewById(R.id.movieText);
     buttonEscoger = (Button) findViewById(R.id.buttonEscoger);

        Button buttonflash = (Button) findViewById(R.id.buttonflash);
        Button buttonsirenita = (Button) findViewById(R.id.buttonsirenita);
        Button buttonrapido = (Button) findViewById(R.id.buttonrapido);

        buttonflash.setOnClickListener(this::onClick);
        buttonsirenita.setOnClickListener(this::onClick);
        buttonrapido.setOnClickListener(this::onClick);

        buttonEscoger.setOnClickListener(new View.OnClickListener(){


            @Override

            public void onClick(View v){

                Intent i3 = new Intent(ListaPelicula.this,MainActivityAsientos.class);
                startActivity(i3);

            }

        });
    }

    @SuppressLint("SetTextI18n")

    public void onClick(View v){
        int buttonId = v.getId();
        int imageId;

        switch (buttonId){
            case R.id.buttonflash:
                imageId = R.drawable.flash;
                movietext.setText(
                        "TITULO: Flash \n" +
                        "AÑO DE PUBLICACIÓN: 2023 \n" +
                        "ACTORES: EZRA, MICHAEL, BEN, SASHA \n" +
                        "GENERO: Acción/Aventura \n" +
                        "DURACIÓN: 2h 24m \n" );
                break;

            case R.id.buttonsirenita:
                imageId = R.drawable.sire;
                movietext.setText(
                        "TITULO: La Sirenita \n" +
                                "AÑO DE PUBLICACIÓN: 2023 \n" +
                                "ACTORES: HALLE, JONAH, MELISSA, JAVIER \n" +
                                "GENERO: Fantasía/Musical \n" +
                                "DURACIÓN: 2h 15mm \n");
                break;

            case R.id.buttonrapido:
                imageId = R.drawable.rapido;
                movietext.setText(
                        "TITULO: Rapidos y Furiosos X \n" +
                                "AÑO DE PUBLICACIÓN: 2023 \n" +
                                "ACTORES: VIN DIESEL, MICHELLE, JASON, ALAN \n" +
                                "GENERO: Acción/Aventura \n" +
                                "DURACIÓN: 2h 21m \n");
                break;
            default:
                imageId = 0;

        }if (imageId !=0){
            movieimagen.setImageDrawable(ContextCompat.getDrawable(this,imageId));
        }
    }
}