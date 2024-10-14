/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Persona {
    private static final int MAYOR_EDAD =18; // YA no se puede poner el en constructor
    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void imprimir(){
        System.out.println(nombre + " " + edad + " ");
    }
    
    public String retornarNombre (){
        return nombre;
    }
    
    public boolean esMayor(){
        return edad>=18;
    }
    
    
    public static void main(String[] args) {
        Persona persona1 =new Persona("hernan xolo ",MAYOR_EDAD);
        if (persona1.esMayor()) {
            System.out.println("es mayor de edad "+persona1.retornarNombre());
        } else {
            System.out.println("es menor "+persona1.retornarNombre());
        }
    }
    
    
    
}
