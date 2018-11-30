package com.example.karen.huerto_matico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ajustes extends AppCompatActivity {
    Button regresarI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

        regresarI=(Button)findViewById(R.id.regresarAjus);
        regresarI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inicio= new Intent(Ajustes.this, Inicio.class );
                startActivity(inicio);
            }
        });
    }
}
