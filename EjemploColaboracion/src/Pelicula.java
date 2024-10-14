/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Pelicula {
    private int año;
    private String nombre, genero;
    private double duracion;
    private Director director;
   
    
    public Pelicula() {
    }

    public Pelicula(int año, String nombre, String genero, double duracion, Director director) {
        this.año = año;
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "a\u00f1o=" + año + ", nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", director=" + director + '}';
    }
    
    
    
    
    public void imprimirPelicula (){
        System.out.println("nombre de pelicula"+this.nombre);
        System.out.println("genero"+this.genero);
        System.out.println("duracion"+this.getDuracion());
        System.out.println("director"+this.getDirector());
    
    }
}
