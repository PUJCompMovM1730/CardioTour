package com.example.juancho.navegacionproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActividadMiPerfil extends AppCompatActivity {
    Button botonEditarPerfil;
    Button botonHistorial;
    Button botonHome;
    Button botonBuscar;
    Button botonAmigos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_mi_perfil);
        botonEditarPerfil = (Button) findViewById(R.id.botonEditarPefil);
        botonEditarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),ActividadEditarPerfil.class);
                startActivity(intent);
            }
        });
        botonHistorial = (Button) findViewById(R.id.botonHistorialdeRuta);
        botonHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActividadHistorialDeRuta.class);
                startActivity(intent);
            }
        });
        botonHome = (Button) findViewById(R.id.botonHome1);
        botonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActivityHome.class);
                startActivity(intent);
            }
        });
        botonBuscar = (Button) findViewById(R.id.botonBuscar1);
        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActividadBuscar.class);
                startActivity(intent);
            }
        });
        botonAmigos = (Button) findViewById(R.id.botonAmigos1);
        botonAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActividadMisAmigos.class);
                startActivity(intent);
            }
        });
    }
}
