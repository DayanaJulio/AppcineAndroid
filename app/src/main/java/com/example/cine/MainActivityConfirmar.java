package com.example.cine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivityConfirmar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_confirmar);

        Toast.makeText(MainActivityConfirmar.this, "Su compra fue exitosa", Toast.LENGTH_LONG).show();
    }
}