package com.example.pconocimientos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BienvenidaActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button salirButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        textView = findViewById(R.id.textView);
        salirButton = findViewById(R.id.btn_salir);

        // Obtener el nombre de usuario de los extras del Intent
        String usuario = getIntent().getStringExtra("usuario");

        // Mostrar el nombre de usuario en el TextView
        textView.setText("¡Bienvenido, " + usuario + "!");

        // Asignar el OnClickListener al botón
        salirButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_salir) {
            finishAffinity();
        }
    }
}