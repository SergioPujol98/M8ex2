package com.example.juego_num_aleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import java.util.Random;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected EditText texto;
    protected Button enviar;
    protected TextView tv;
    int min = 0;
    int max = 100;
    int n = new Random().nextInt((max - min) + 1) + min;
    int nm;

    int intentos = 0;
    int puntuacion = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView3);
        texto = findViewById(R.id.editText3);

        enviar = findViewById(R.id.button);

        String adiv = "El numero a adivinar es: " + n;
        tv.setText(adiv);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nm = Integer.parseInt(texto.getText().toString());
                    if (nm == n) {
                        String s2 = ("Has adivinado el numero, FELICIDADES. \nTu puntuacion es: " + puntuacion);
                        Toast.makeText(getApplicationContext(), s2, Toast.LENGTH_SHORT).show();

                    } else {
                        intentos++;
                        puntuacion--;
                        if (nm < n) {
                            String s1 = ("Fallos: " + intentos + "\nPuntuacion: " + puntuacion + "\nEl numero es mayor al introducido" +n);
                            Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_SHORT).show();
                        } else {
                            String s1 = ("Fallos: " + intentos + "\nPuntuacion: " + puntuacion + "\nEl numero es menor al introducido");
                            Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_SHORT).show();
                        }

                    }
                    if (puntuacion == 0) {
                        String s3 = ("Has perdido, el numero era el: " + n);
                        Toast.makeText(getApplicationContext(), s3, Toast.LENGTH_SHORT).show();

                    }
                }

        });
    }
}
