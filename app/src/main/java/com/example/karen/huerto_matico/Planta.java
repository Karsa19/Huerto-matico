package com.example.karen.huerto_matico;

import java.io.Serializable;

public class Planta implements Serializable {

    private int id_P;
    private String nombreP;
    private String tipoP;
    private int tiempoLuzP;
    private int tempP;
    private int humedadP;
    private boolean cuidadoAuto= true;

    public Planta(String nombreP, String tipoP, int tiempoLuzP, int tempP, int humedadP, boolean cuidadoAuto) {
        this.nombreP = nombreP;
        this.tipoP = tipoP;
        this.tiempoLuzP = tiempoLuzP;
        this.tempP = tempP;
        this.humedadP = humedadP;
        this.cuidadoAuto = cuidadoAuto;
    }

    public Planta() {

    }



    /** Set y Get**/


    public int getId_P() {
        return id_P;
    }

    public void setId_P(int id_P) {
        this.id_P = id_P;
    }

    public void setTiempoLuz(int tiempoLuz) {
        this.tiempoLuzP = tiempoLuz;
    }

    public void setTempP(int tempP) {
        this.tempP = tempP;
    }

    public void setHumedadP(int humedadP) {
        this.humedadP = humedadP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public String getTipoP() {
        return tipoP;
    }

    public int getTiempoLuz() {
        return tiempoLuzP;
    }

    public int getTempP() {
        return tempP;
    }

    public int getHumedadP() {
        return humedadP;
    }

    public boolean getCuidadoAuto() {
        return cuidadoAuto;
    }

    public void setCuidadoAuto(boolean cuidadoAuto) {
        this.cuidadoAuto = cuidadoAuto;
    }
}
