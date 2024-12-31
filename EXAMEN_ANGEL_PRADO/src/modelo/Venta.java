/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vina
 */
public class Venta {
    private Cliente cliente;
    private Vehiculo vehiculo;
    
    private String fecha;
    private int valorVenta;

    public Venta() {
    }

    public Venta(Cliente cliente, Vehiculo vehiculo, String fecha, int valorVenta) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.valorVenta = valorVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", fecha=" + fecha + ", valorVenta=" + valorVenta + '}';
    }
    
    
}
