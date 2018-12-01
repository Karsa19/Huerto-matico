package com.example.karen.huerto_matico.Utilidades;

public class Utilidades {

    //Tabla Cultivo
    public static final String TABLA_Cultivo="Cultivo";
    public static final String CAMPO_idC="id_C";
    public static final String CAMPO_HumedadCul="humedad";
    public static final String CAMPO_TemperaturaCul="temperatura";
    public static final String CAMPO_TiempoLuzCul="tiempoLuz";

    public static final String crear_tabla_cultivo= "CREATE TABLE" + TABLA_Cultivo +
            "("+ CAMPO_idC + "PRIMARY KEY,"
            + CAMPO_HumedadCul + "INTEGER NOT NULL,"
            +CAMPO_TemperaturaCul+ "INTEGER NOT NULL,"
            +CAMPO_TiempoLuzCul+ "INTEGER)";

    //Tabla Planta
    public static final String TABLA_Planta="Planta";
    public static final String CAMPO_idP="id_P";
    public static final String CAMPO_idCultivo="id_P";
    public static final String CAMPO_Nombre="nombre";
    public static final String CAMPO_Tipo="tipo";
    public static final String CAMPO_Humedad="humedad";
    public static final String CAMPO_Temperatura="temperatura";
    public static final String CAMPO_TiempoLuz="tiempoLuz";

    public static final String crear_tabla_planta= "CREATE TABLE" + TABLA_Planta +
            "("+ CAMPO_idP + "INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "FOREIGN KEY ("+ CAMPO_idCultivo +") REFERENCES "+ TABLA_Cultivo+ "("+CAMPO_idC+"),"
            +CAMPO_Nombre + "TEXT NOT NULL,"
            + CAMPO_Tipo + "TEXT NOT NULL,"
            +CAMPO_Temperatura+ "INTEGER,"
            +CAMPO_Humedad+"INTEGER,"
            +CAMPO_TiempoLuz+ "INTEGER)";

    //Tabla Cuidado
    public static final String TABLA_Cuidado="Cuidado";
    public static final String CAMPO_idPlanta="id_P";
    public static final String CAMPO_Agua="agua";
    public static final String CAMPO_TemperaturaC="temperatura";
    public static final String CAMPO_TiempoLuzC="tiempoLuz";

    public static final String crear_tabla_cuidado= "CREATE TABLE" + TABLA_Cuidado +
            "( FOREIGN KEY ("+CAMPO_idPlanta+") REFERENCES "+ TABLA_Planta+"("+CAMPO_idP+"),"
            + CAMPO_Agua + "INTEGER NOT NULL,"
            +CAMPO_TemperaturaC+ "INTEGER NOT NULL,"
            +CAMPO_TiempoLuzC+ "INTEGER)";


}
