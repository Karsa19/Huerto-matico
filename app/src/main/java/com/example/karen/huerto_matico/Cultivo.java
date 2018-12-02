package com.example.karen.huerto_matico;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.karen.huerto_matico.Utilidades.Utilidades;

import java.util.ArrayList;
import java.util.List;

public class Cultivo extends AppCompatActivity {
    //ArrayList<Planta> cultivo= new ArrayList<Planta>();
    Button regresar;
    Button editar;

    ListView cultivo;
    ArrayList<String> cultivoPlantas;
    ArrayList<Planta> plantas;

    BDSQLite conn;

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

        conn= new BDSQLite(getApplicationContext(),"BD_Huertomatico",null,1);
        cultivo=(ListView) findViewById(R.id.ListaCultivo);
        consultarCultivo();

        ArrayAdapter adaptador= new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1, cultivoPlantas);
        cultivo.setAdapter(adaptador);

    }

    private void consultarCultivo() {

        SQLiteDatabase BDH=conn.getReadableDatabase();
         Planta planta= null;
         plantas= new ArrayList<Planta>();

        Cursor cursor=BDH.rawQuery("SELECT * FROM "+ Utilidades.TABLA_Planta,null);

        while (cursor.moveToNext()){
            planta= new Planta();
            planta.setId_P(cursor.getInt(0));
            planta.setNombreP(cursor.getString(1));
            planta.setTipoP(cursor.getString(2));

            plantas.add(planta);

        }
        
        obtenerCultivo();
    }

    private void obtenerCultivo() {

        cultivoPlantas= new ArrayList<String>();

         for(int i=0;i<cultivoPlantas.size();i++){
             cultivoPlantas.add(plantas.get(i).getId_P()+"-"+ plantas.get(i).getNombreP()+"/n"+plantas.get(i).getTipoP());
         }
    }
}
