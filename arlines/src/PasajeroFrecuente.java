/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class PasajeroFrecuente {
    private String numeroPasajeto;
    private int puntos;

    public PasajeroFrecuente() {
    }

    public PasajeroFrecuente(String numeroPasajeto, int puntos) {
        this.numeroPasajeto = numeroPasajeto;
        this.puntos = puntos;
    }

    public String getNumeroPasajeto() {
        return numeroPasajeto;
    }

    public void setNumeroPasajeto(String numeroPasajeto) {
        this.numeroPasajeto = numeroPasajeto;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "PasajeroFrecuente{" + "numeroPasajeto=" + numeroPasajeto + ", puntos=" + puntos + '}';
    }
    
    
}
