/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vina
 */
public class Camioneta extends Vehiculo{
    private String carga;

    public Camioneta() {
    }

    public Camioneta(String carga, String patente, String marca, String modelo, int kilometraje) {
        super(patente, marca, modelo, kilometraje);
        this.carga = carga;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "carga=" + carga + '}';
    }

    
    
    @Override
    public void mostrarDatos() {
        System.out.println("  Camioneta = " 
                + "carga = " + carga +
                " patente =  " + this.getPatente() +
                " marca = " + this.getMarca() +
                " modelo = " + this.getModelo()+
                " kilometraje = " + this.getKilometraje());
    }
}
