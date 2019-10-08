package com.example.juego_num_aleatorio;



import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ranking<nombre> extends AppCompatActivity {
    protected TextView nombres;
    String nombre = "";



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombres.setText("Nombre: " + nombre + " Puntuacion: " );
    }
}
