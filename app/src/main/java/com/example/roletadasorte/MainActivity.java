package com.example.roletadasorte;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rodar(View view) {
        TextView texto = findViewById(R.id.textView);

        int x = new Random().nextInt(11);

        texto.setText("Numero Sorteado: " + x);
    }
}