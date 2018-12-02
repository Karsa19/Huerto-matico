package com.example.karen.huerto_matico;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import com.example.karen.huerto_matico.Utilidades.Utilidades;

public class BDSQLite extends SQLiteOpenHelper {

    public BDSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //db.execSQL(Utilidades.crear_tabla_cultivo);
        db.execSQL(Utilidades.crear_tabla_planta);
        db.execSQL(Utilidades.crear_tabla_cuidado);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL("DROP TABLE IF EXISTS Cultivo");
        db.execSQL("DROP TABLE IF EXISTS Planta");
        db.execSQL("DROP TABLE IF EXISTS Cuidado");
        onCreate(db);
    }
}
