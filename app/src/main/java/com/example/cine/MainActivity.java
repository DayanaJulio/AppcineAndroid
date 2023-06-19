package com.example.cine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin;
    Button buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin=(Button)findViewById(R.id.buttonLogin);
        buttonSignup=(Button) findViewById(R.id.buttonSignup);

        buttonLogin.setOnClickListener(new View.OnClickListener(){


            @Override

            public void onClick(View v){

                Intent i = new Intent(MainActivity.this,ListaPelicula.class);
                startActivity(i);

            }

        });

        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this,MainActivitysignup.class);
                startActivity(i2);
            }
        });
    }
}