/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Profesor {
    private String rut,numeroDocente,nombreDocente,fechaDeIngreso,sede;

    public Profesor() {
    }
    
    public Profesor(String rut, String numeroDocente, String nombreDocente, String fechaDeIngreso, String sede) {
        this.rut = rut;
        this.numeroDocente = numeroDocente;
        this.nombreDocente = nombreDocente;
        this.fechaDeIngreso = fechaDeIngreso;
        this.sede = sede;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNumeroDocente() {
        return numeroDocente;
    }

    public void setNumeroDocente(String numeroDocente) {
        this.numeroDocente = numeroDocente;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Profesor{" + "rut=" + rut + ", numeroDocente=" + numeroDocente + ", nombreDocente=" + nombreDocente + ", fechaDeIngreso=" + fechaDeIngreso + ", sede=" + sede + '}';
    }

    public void mostararDatosProfesor () 
    {
        System.out.println("rut: "+this.getRut());
        System.out.println("nombre docente: "+this.getNombreDocente());
        System.out.println("numero docente: "+this.getNumeroDocente());
        System.out.println("fecha de ingreso: "+this.getFechaDeIngreso());
        System.out.println("sede: "+this.getSede());
    }
}
