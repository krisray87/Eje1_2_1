package com.example.eje1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nombre;
    EditText apellido;
    EditText edad;
    EditText correo;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText) findViewById(R.id.txtNombre);
        apellido=(EditText) findViewById(R.id.txtApell);
        edad=(EditText) findViewById(R.id.txtEdad);
        correo=(EditText) findViewById(R.id.txtCorreo);
        enviar=(Button) findViewById(R.id.btnEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activity2.class);
                intent.putExtra("nombre",nombre.getText().toString());
                intent.putExtra("apellido",apellido.getText().toString());
                intent.putExtra("edad",edad.getText().toString());
                intent.putExtra("correo",correo.getText().toString());
                startActivity(intent);
            }
        });

    }
}