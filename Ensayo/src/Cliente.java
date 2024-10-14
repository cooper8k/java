/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Cliente {
    private String nombre,rut,tipoPago,producto;
    private int cantidadProductos;
    private String totalPagar;

    public Cliente() {
    }

    public Cliente(String nombre, String rut, String tipoPago, String producto, int cantidadProductos) {
        this.nombre = nombre;
        this.rut = rut;
        this.tipoPago = tipoPago;
        this.producto = producto;
        this.cantidadProductos = cantidadProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", rut=" + rut + ", tipoPago=" + tipoPago + ", producto=" + producto + ", cantidadProductos=" + cantidadProductos + '}';
    }
    
    
    public int totalPagar ()
    {
        int total =0;
        if (this.getTipoPago().equalsIgnoreCase("leche")) 
        {
            total = this.cantidadProductos*2000;
            System.out.println("total a pagar es: "+total);
        }
        return total;
    
    }

    public void descuento () 
    {
        if (this.getTipoPago().equalsIgnoreCase("debito")) 
        {
            System.out.println("descuento de 10% para debito");
        }
        else 
        {
            if (this.getTipoPago().equalsIgnoreCase("credito"))
            {
                System.out.println("descuento 15% para credito");
            }
            else 
            {
                if (this.getTipoPago().equalsIgnoreCase("efectivo"))
                {
                    System.out.println("descuento del 20% para efectivo");
                }
            }
        }

    }
    
    
    
    public void mostarProducto ()
    {
        System.out.println(this.getProducto());
    }
    public void mostrarDatosCompra () 
    {
        System.out.println("tipo de pago: "+this.getTipoPago());
        System.out.println("producto: "+this.getProducto());
        System.out.println("cantidad de productos: "+this.getCantidadProductos());
        System.out.println("pagar sin descuento; "+this.totalPagar());
    }
}