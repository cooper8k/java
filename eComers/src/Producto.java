/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Producto {
    protected String producto,nombre;
    protected double precio;

    public Producto() {
    }

    public Producto(String producto, String nombre, double precio) {
        this.producto = producto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "producto=" + producto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    public double calcularDescuento (double descuento) {
        
       double  preciofinal=precio-(precio*descuento)/100;
        return preciofinal;
    }
    
    
    
    
}
