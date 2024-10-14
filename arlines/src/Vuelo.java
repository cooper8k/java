/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Vuelo {
    private String idVuelo,origen,destno,asientosDisponibles;

    public Vuelo() {
    }

    public Vuelo(String idVuelo, String origen, String destno, String asientosDisponibles) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destno = destno;
        this.asientosDisponibles = asientosDisponibles;
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestno() {
        return destno;
    }

    public void setDestno(String destno) {
        this.destno = destno;
    }

    public String getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(String asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "idVuelo=" + idVuelo + ", origen=" + origen + ", destno=" + destno + ", asientosDisponibles=" + asientosDisponibles + '}';
    }
    

   
    
    
}
