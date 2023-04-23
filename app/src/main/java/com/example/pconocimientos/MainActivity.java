package com.example.pconocimientos;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.content.Intent;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencia al botón
        Button registerButton = findViewById(R.id.login_button);

        // Establecer el Listener del botón
        registerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Obtener las referencias a los EditText
        EditText emailEditText = findViewById(R.id.email_edit_text);
        EditText passwordEditText = findViewById(R.id.password_edit_text);
        EditText nameEditText = findViewById(R.id.name_edit_text);
        String nombreUsuario = nameEditText.getText().toString();



        //Obtener los valores de los EditText
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        //Verificar que los campos no estén vacíos y cumplan con las condiciones
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(MainActivity.this, "Los campos no pueden estar vacíos", Toast.LENGTH_SHORT).show();
        } else if (nameEditText.length() < 3) {
            Toast.makeText(MainActivity.this, "El nombre debe tener más de 3 caracteres", Toast.LENGTH_SHORT).show();
        } else if (password.length() < 8) {
            Toast.makeText(MainActivity.this, "La contraseña debe tener más de 8 caracteres", Toast.LENGTH_SHORT).show();
        } else {
            //Realizar el registro
            Toast.makeText(MainActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();

            // Iniciar la actividad BienvenidaActivity
            Intent intent = new Intent(MainActivity.this, BienvenidaActivity.class);
            intent.putExtra("usuario", nombreUsuario); // nombreUsuario es la variable que contiene el nombre de usuario
            startActivity(intent);


        }
    }
}
