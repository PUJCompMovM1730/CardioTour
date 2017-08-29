package com.example.juancho.navegacionproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActividadEditarPerfil extends AppCompatActivity {
    Button botonGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_editar_perfil);
        botonGuardar = (Button) findViewById(R.id.botonGuardarPefil);
        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActividadMiPerfil.class);
                startActivity(intent);
            }
        });
    }
}
