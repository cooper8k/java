/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class SacoDeDormir extends Producto{
    private String rangoDeTempratura;

    public String getRangoDeTempratura() {
        return rangoDeTempratura;
    }

    public void setRangoDeTempratura(String rangoDeTempratura) {
        this.rangoDeTempratura = rangoDeTempratura;
    }

    public SacoDeDormir(String rangoDeTempratura, int codido, int precio, int cantidad, String nombre, String marca) {
        super(codido, precio, cantidad, nombre, marca);
        this.rangoDeTempratura = rangoDeTempratura;
    }

    public SacoDeDormir() {
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("MOCHILA ");
        System.out.println("codigo"+super.codido);
        System.out.println("precio"+super.precio);
        System.out.println("cantidad"+super.cantidad);
        System.out.println("nombre"+super.nombre);
        System.out.println("marca"+super.marca);
        System.out.println("rango de temperatura "+this.rangoDeTempratura);
    }
    
}
