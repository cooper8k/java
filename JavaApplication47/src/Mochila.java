/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Mochila extends Producto{
    
    private String tipo;

    public Mochila(String tipo, int codido, int precio, int cantidad, String nombre, String marca) {
        super(codido, precio, cantidad, nombre, marca);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    public void mostrarDetalle() {
        System.out.println("MOCHILA ");
        System.out.println("codigo"+this.codido);
        System.out.println("precio"+this.precio);
        System.out.println("cantidad"+this.cantidad);
        System.out.println("nombre"+this.nombre);
        System.out.println("marca"+this.marca);
        System.out.println("tipo"+this.tipo);
    }
    
    
    
}
