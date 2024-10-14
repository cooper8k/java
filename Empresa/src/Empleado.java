/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Empleado {
    private String rut,nombreEpleado;
    private char genero;
    private int anio , edad;
    private Puesto puesto;
    
    private Empleado () 
    {
        puesto = new Puesto();
    }

    public Empleado(String rut, String nombreEpleado, char genero, int anio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreEpleado = nombreEpleado;
        this.genero = genero;
        this.anio = anio;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreEpleado() {
        return nombreEpleado;
    }

    public void setNombreEpleado(String nombreEpleado) {
        this.nombreEpleado = nombreEpleado;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rut=" + rut + ", nombreEpleado=" + nombreEpleado + ", genero=" + genero + ", anio=" + anio + ", edad=" + edad + ", puesto=" + puesto + '}';
    }
    
    
}
