/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author orlan
 */
public class Familia {
    private String nombre,rut,parentezco;
    private int edad;
    
    // constructor 

    public Familia() {
    }

    public Familia(String nombre, String rut, String parentezco, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.parentezco=parentezco;
        setEdad(edad);
    }
    
    
    // accesadores y murador

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    
    
    
    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String rut) {
        this.parentezco = parentezco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>18) {
            System.out.println("MAYOR DE EDAD");
            
        }else{
            System.out.println("menor de edad");
        }
    }

    @Override
    public String toString() {
        return "Familia{" + "nombre=" + nombre + ", rut=" + rut + ", parentezco=" + parentezco + ", edad=" + edad + '}';
    }

    

    
    

}




    