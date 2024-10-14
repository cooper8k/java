/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Libro extends Material{
    private String autor,genero;

    public Libro(String autor, String genero, String idMaterial, String tituloMaterial, boolean disponibilidad) {
        super(idMaterial, tituloMaterial, disponibilidad);
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", genero=" + genero + '}';
    }

    public String obtenerResumen(){
        return "resumen";
    }
}
