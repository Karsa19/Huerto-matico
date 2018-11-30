package com.example.karen.huerto_matico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgregarPlanta extends AppCompatActivity {
    Planta nPlanta;
    Button regresarIni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_planta);

        regresarIni=(Button)findViewById(R.id.regresarAgrega);
        regresarIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inicio= new Intent(AgregarPlanta.this, Inicio.class );
                startActivity(inicio);
            }
        });

        Intent datosP=new Intent(AgregarPlanta.this, Planta.class);


    }
}
