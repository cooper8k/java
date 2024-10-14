/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Director {
    private String nombre;
    private int edad;
    private boolean oscar;
    private int cantidadPeliculas;

    public Director() {
    }

    public Director(String nombre, int edad, boolean oscar, int cantidadPeliculas) {
        this.nombre = nombre;
        this.edad = edad;
        this.oscar = oscar;
        this.cantidadPeliculas = cantidadPeliculas;
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
        this.edad = edad;
    }

    public boolean isOscar() {
        return oscar;
    }

    public void setOscar(boolean oscar) {
        this.oscar = oscar;
    }

    public int getCantidadPeliculas() {
        return cantidadPeliculas;
    }

    public void setCantidadPeliculas(int cantidadPeliculas) {
        this.cantidadPeliculas = cantidadPeliculas;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", edad=" + edad + ", oscar=" + oscar + ", cantidadPeliculas=" + cantidadPeliculas + '}';
    }
    
    
        
    public void imprimirDirector (){
        System.out.println("nombre"+this.getNombre());
        System.out.println("edad"+this.getEdad());
        
    }
}
