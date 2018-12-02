package com.example.karen.huerto_matico;

import java.io.Serializable;

public class CuidadoP implements Serializable {
    //private int idPlanta;
    private int diaRiego;
    private int agua;
    private int temp;
    private int tiempoLuz;

    public void Temperatura(Planta p){
        if(p.getCuidadoAuto()==true) {
            if (p.getTipoP() == "cactacea") {
                /**Temperatura 20°**/
                temp = 30;
            }

            if (p.getTipoP() == "hortaliza") {
                temp = 20;
            }

            if (p.getTipoP() == "ornamento") {
                temp = 20;
            }
        }
        else {
            /**Temperatura perzonalizada**/
        }
    }

    public void Agua(Planta p){
        if(p.getCuidadoAuto()==true){
            if (p.getTipoP() == "cactacea") {
                /**Cantidad Agua**/
                agua = 250;
            }

            if (p.getTipoP() == "hortaliza") {
                agua = 350;
            }

            if (p.getTipoP() == "ornamento") {
                agua = 300;
            }
        }

        else {
            /**Cantidad personalizada de agua**/
        }

    }

    public void RegarPlanta(Planta p){

    }

    public void setDiaRiego(int diaRiego) {
        this.diaRiego = diaRiego;
    }

    public int getDiaRiego() {
        return diaRiego;
    }


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getTiempoLuz() {
        return tiempoLuz;
    }

    public void setTiempoLuz(int tiempoLuz) {
        this.tiempoLuz = tiempoLuz;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }
}
