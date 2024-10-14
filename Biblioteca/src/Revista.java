
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Revista extends Material{
    private String editorial;
    private int numeroEdicion;
    ArrayList<String>listaArticulos ;

    public Revista(String editorial, int numeroEdicion, String idMaterial, String tituloMaterial, boolean disponibilidad) {
        super(idMaterial, tituloMaterial, disponibilidad);
        this.editorial = editorial;
        this.numeroEdicion = numeroEdicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public String toString() {
        return "Revista{" + "editorial=" + editorial + ", numeroEdicion=" + numeroEdicion + '}';
    }

    public ArrayList<String> verArticulosDestacados () {
           return listaArticulos;
           
    }
    
    public boolean agregarArticulos(String articulo) {
        return listaArticulos.add(articulo);
    }
    public void listar() {
        for (String i : listaArticulos) {
            System.out.println(i);
        }
    }
    
}
