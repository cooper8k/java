/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class TiendaDeCampaña extends Producto {
    private String tamaño;

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public TiendaDeCampaña(String tamaño, int codido, int precio, int cantidad, String nombre, String marca) {
        super(codido, precio, cantidad, nombre, marca);
        this.tamaño = tamaño;
    }

    public TiendaDeCampaña() {
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("MOCHILA ");
        System.out.println("codigo"+this.codido);
        System.out.println("precio"+this.precio);
        System.out.println("cantidad"+this.cantidad);
        System.out.println("nombre"+this.nombre);
        System.out.println("marca"+this.marca);
        System.out.println("tamaño"+this.tamaño);
    }
    
}
