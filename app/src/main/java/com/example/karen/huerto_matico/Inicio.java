package com.example.karen.huerto_matico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    Button cultivo;
    Button agregar;
    Button ajustes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        cultivo=(Button)findViewById(R.id.BCultivo);
        cultivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cultivo= new Intent(Inicio.this, Cultivo.class );
                startActivity(cultivo);
            }
        });

        agregar=(Button)findViewById(R.id.BAgregar);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent agregar= new Intent(Inicio.this, AgregarPlanta.class );
                startActivity(agregar);
            }
        });

        ajustes=(Button)findViewById(R.id.BAjustes);
        ajustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ajustes= new Intent(Inicio.this, Ajustes.class );
                startActivity(ajustes);
            }
        });

    }
}
