package com.example.karen.huerto_matico;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.karen.huerto_matico.Utilidades.Utilidades;

public class AgregarPlanta extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Planta nPlanta;
    Button regresarIni;
    Spinner tipoPlanta;

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

        tipoPlanta= findViewById(R.id.cbtipoPlanta);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.tipoP,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoPlanta.setAdapter(adapter);
        tipoPlanta.setOnItemSelectedListener(this);
    }

    public void onClick(View view){
        agregarPlanta();
    }

    private void agregarPlanta() {
        BDSQLite conn= new BDSQLite(this, "BD_Huertomatico", null, 1);
        SQLiteDatabase BDH= conn.getWritableDatabase();

        ContentValues values= new ContentValues();
        values.put(Utilidades.CAMPO_idC,1);
        values.put(Utilidades.CAMPO_idP,1);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
