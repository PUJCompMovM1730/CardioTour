package com.example.juancho.navegacionproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActividadBuscar extends AppCompatActivity {
    Button botonInfoInteres;
    Button botonHome;
    Button botonAmigos;
    Button botonPerfil;
    Button botonCTIndividual;
    Button botonCTGrupal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_buscar);
        botonInfoInteres = (Button) findViewById(R.id.botonInteres);
        botonInfoInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),ActividadInfoInteres.class);
                startActivity(intent);
            }
        });
        botonHome = (Button) findViewById(R.id.botonHome4);
        botonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActivityHome.class);
                startActivity(intent);
            }
        });
        botonAmigos = (Button) findViewById(R.id.botonAmigos4);
        botonAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActividadMisAmigos.class);
                startActivity(intent);
            }
        });
        botonPerfil = (Button) findViewById(R.id.botonPerfil4);
        botonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),ActividadMiPerfil.class);
                startActivity(intent);
            }
        });
        botonCTIndividual = (Button) findViewById(R.id.botonCTI);
        botonCTIndividual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),ActividadDesIndividual.class);
                startActivity(intent);
            }
        });
        botonCTGrupal = (Button) findViewById(R.id.botonCTG);
        botonCTGrupal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActividadDesGrupal.class);
                startActivity(intent);
            }
        });
    }
}
