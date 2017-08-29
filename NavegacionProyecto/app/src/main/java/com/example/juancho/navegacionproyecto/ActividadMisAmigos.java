package com.example.juancho.navegacionproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActividadMisAmigos extends AppCompatActivity {
    Button botonHome;
    Button botonBuscar;
    Button botonPerfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_mis_amigos);
        botonHome = (Button) findViewById(R.id.botonHome2);
        botonBuscar = (Button) findViewById(R.id.botonBuscar2);
        botonPerfil = (Button) findViewById(R.id.botonPerfil2);
        botonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActivityHome.class);
                startActivity(intent);
            }
        });
        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActividadBuscar.class);
                startActivity(intent);
            }
        });
        botonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActividadMiPerfil.class);
                startActivity(intent);
            }
        });
    }
}
