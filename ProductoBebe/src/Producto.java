/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Producto {
    private int numeroBebe;
    private String tipoProducto;
    private int cantidadProducto;

    public Producto() {
    }

    public Producto(int numeroBebe, String tipoProducto, int cantidadProducto) {
        this.numeroBebe = numeroBebe;
        this.tipoProducto = tipoProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public int getNumeroBebe() {
        return numeroBebe;
    }

    public void setNumeroBebe(int numeroBebe) {
        this.numeroBebe = numeroBebe;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int calcularTotal ()
    {
        int total = 0;
        if(this.getTipoProducto().equalsIgnoreCase("leche")) {
            total = this.cantidadProducto * 3000;
        } else {
            if (this.getTipoProducto().equalsIgnoreCase("colados")) {
                total = this.cantidadProducto *1500;
            } else {
                if (this.getTipoProducto().equalsIgnoreCase("crema")) {
                    total = this.cantidadProducto * 2500;
                } else {
                    if (this.getTipoProducto().equalsIgnoreCase("colonia")) {
                        total = this.cantidadProducto *10000;
                    } 
                }
            }
        }
        return total;
    }
    
    
    public void  mostrarDatos ()
    {
        System.out.println("bienvenido cmprad de bebe");
        System.out.println(".............................");
        System.out.println("numero de bebe: "+this.getNumeroBebe());
        System.out.println("producto que lleva: "+this.getTipoProducto());
        System.out.println("total: $"+this.calcularTotal());
        
    }
    public void productoMasVendido (Producto pro1, Producto pro2,Producto pro3)
    {
        if (pro1.getCantidadProducto()>pro2.getCantidadProducto() && pro1.getCantidadProducto()> pro3.getCantidadProducto()) {
            System.out.println("el mayor es "+pro1.getTipoProducto());
        }
        else {
            if (pro2.getCantidadProducto()>pro1.getCantidadProducto() && pro2.getCantidadProducto()>pro3.getCantidadProducto()) {
                    System.out.println("el mayor es "+pro2.getTipoProducto());

            }else {
                if (pro3.getCantidadProducto()>pro1.getCantidadProducto() && pro3.getCantidadProducto()>pro2.getCantidadProducto()) {
                    System.out.println("la mayor cantidad de productos es: "+pro3.getTipoProducto());
            }
        
        }
    }
    
    }
}