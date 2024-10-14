/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodireccion;

/**
 *
 * @author orlan
 */
public class Familia {
    private String nombre;
    private int edad;

    public Familia() {
    }

    Familia(String angel, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=18){
            System.out.println("mayor de edad");
            this.edad = edad;
        }else{
            System.out.println("menor de edad");
        }
    }

    @Override
    public String toString() {
        return "Familia{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
