/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Familia {
    private String nombre,apellido,rut,fechaNacimiento;
    private float saldoCuenta;
// constructor sinparametros
    public Familia() {
    }
// constructor con parametros 
    public Familia(String nombre, String apellido, String rut, String fechaNacimiento, float saldoCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
        this.saldoCuenta = saldoCuenta;
    }
// accesadores y mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(float saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
// metodos
    @Override
    public String toString() {
        return "Familia{" + "nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", fechaNacimiento=" + fechaNacimiento + ", saldoCuenta=" + saldoCuenta + '}';
    }
    
    
    
}
