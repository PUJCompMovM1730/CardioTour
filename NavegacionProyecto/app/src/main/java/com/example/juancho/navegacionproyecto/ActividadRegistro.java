package com.example.juancho.navegacionproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActividadRegistro extends AppCompatActivity {
    Button botonContinuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_registro);
        botonContinuar = (Button) findViewById(R.id.botonContinuarRegistro);
        botonContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ActivityHome.class);
                startActivity(intent);
            }
        });
    }
}
