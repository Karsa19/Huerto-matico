package com.example.karen.huerto_matico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Cultivo extends AppCompatActivity {
    ArrayList<Planta> cultivo= new ArrayList<Planta>();
    Button regresar;
    Button editar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultivo);

        regresar=(Button)findViewById(R.id.regresarCultivo);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inicio= new Intent(Cultivo.this, Inicio.class );
                startActivity(inicio);
            }
        });

        editar=(Button)findViewById(R.id.bEditarCuidado);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent editar= new Intent(Cultivo.this, EditarCuidado.class );
                startActivity(editar);
            }
        });
    }
}
