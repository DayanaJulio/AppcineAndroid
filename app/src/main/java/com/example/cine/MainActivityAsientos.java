package com.example.cine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MainActivityAsientos extends AppCompatActivity {

    Button buttonconfirmar;


    List<String> asientosSeleccionado= new ArrayList<>();

    public List<String> getAsientosSeleccionado() {
        return asientosSeleccionado;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_asientos);
        buttonconfirmar = (Button) findViewById(R.id.buttonconfirmar);

        buttonconfirmar.setOnClickListener(new View.OnClickListener(){


            @Override

            public void onClick(View v){

                Intent i4 = new Intent(MainActivityAsientos.this,MainActivityConfirmar.class);
                startActivity(i4);

            }

        });

        // Obtener la lista de todos los TextView del diseño
        List<TextView> textViewList = getTextViewId();


        for (final TextView textView : textViewList) {
            textView.setOnClickListener(new View.OnClickListener() {
                boolean flag=true;
                @Override
                public void onClick(View v) {

                    if (flag){
                        textView.setBackgroundColor(Color.RED);
                        flag=false;
                        asientosSeleccionado.add(textView.getText().toString());

                    } else{
                        textView.setBackgroundColor(Color.GREEN);
                    }

                }
            });
        }
    }


    public  List<TextView> getTextViewId(){

        List<TextView> textViewList = new ArrayList<>();

        textViewList.add(findViewById(R.id.s00));
        textViewList.add(findViewById(R.id.s01));
        textViewList.add(findViewById(R.id.s02));
        textViewList.add(findViewById(R.id.s03));
        textViewList.add(findViewById(R.id.s04));
        textViewList.add(findViewById(R.id.s05));
        textViewList.add(findViewById(R.id.s06));
        textViewList.add(findViewById(R.id.s07));
        textViewList.add(findViewById(R.id.s08));

        textViewList.add(findViewById(R.id.s10));
        textViewList.add(findViewById(R.id.s11));
        textViewList.add(findViewById(R.id.s12));
        textViewList.add(findViewById(R.id.s13));
        textViewList.add(findViewById(R.id.s14));
        textViewList.add(findViewById(R.id.s15));
        textViewList.add(findViewById(R.id.s16));
        textViewList.add(findViewById(R.id.s17));
        textViewList.add(findViewById(R.id.s18));

        textViewList.add(findViewById(R.id.s20));
        textViewList.add(findViewById(R.id.s21));
        textViewList.add(findViewById(R.id.s22));
        textViewList.add(findViewById(R.id.s23));
        textViewList.add(findViewById(R.id.s24));
        textViewList.add(findViewById(R.id.s25));
        textViewList.add(findViewById(R.id.s26));
        textViewList.add(findViewById(R.id.s27));
        textViewList.add(findViewById(R.id.s28));

        textViewList.add(findViewById(R.id.s30));
        textViewList.add(findViewById(R.id.s31));
        textViewList.add(findViewById(R.id.s32));
        textViewList.add(findViewById(R.id.s33));
        textViewList.add(findViewById(R.id.s34));
        textViewList.add(findViewById(R.id.s35));
        textViewList.add(findViewById(R.id.s36));
        textViewList.add(findViewById(R.id.s37));
        textViewList.add(findViewById(R.id.s38));

        textViewList.add(findViewById(R.id.s40));
        textViewList.add(findViewById(R.id.s41));
        textViewList.add(findViewById(R.id.s42));
        textViewList.add(findViewById(R.id.s43));
        textViewList.add(findViewById(R.id.s44));
        textViewList.add(findViewById(R.id.s45));
        textViewList.add(findViewById(R.id.s46));
        textViewList.add(findViewById(R.id.s47));
        textViewList.add(findViewById(R.id.s48));

        textViewList.add(findViewById(R.id.s50));
        textViewList.add(findViewById(R.id.s51));
        textViewList.add(findViewById(R.id.s52));
        textViewList.add(findViewById(R.id.s53));
        textViewList.add(findViewById(R.id.s54));
        textViewList.add(findViewById(R.id.s55));
        textViewList.add(findViewById(R.id.s56));
        textViewList.add(findViewById(R.id.s57));
        textViewList.add(findViewById(R.id.s58));

        textViewList.add(findViewById(R.id.s60));
        textViewList.add(findViewById(R.id.s61));
        textViewList.add(findViewById(R.id.s62));
        textViewList.add(findViewById(R.id.s63));
        textViewList.add(findViewById(R.id.s64));
        textViewList.add(findViewById(R.id.s65));
        textViewList.add(findViewById(R.id.s66));
        textViewList.add(findViewById(R.id.s67));
        textViewList.add(findViewById(R.id.s68));

        textViewList.add(findViewById(R.id.s70));
        textViewList.add(findViewById(R.id.s71));
        textViewList.add(findViewById(R.id.s72));
        textViewList.add(findViewById(R.id.s73));
        textViewList.add(findViewById(R.id.s74));
        textViewList.add(findViewById(R.id.s75));
        textViewList.add(findViewById(R.id.s76));
        textViewList.add(findViewById(R.id.s77));
        textViewList.add(findViewById(R.id.s78));


        return textViewList;
    }


}
