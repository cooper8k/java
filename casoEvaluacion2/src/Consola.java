/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public abstract class Consola implements ICalculable {

   protected String marca,modelo;
   protected int precio;

    public Consola() {
    }

    public Consola(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Consola{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
   
    
    // metodo implementado de i calculable
    @Override
    public double CalcularPrecioFinal() {
        return 0;
    }
    
    // metodo abstracto
    public abstract String clasificacionConsola() ;
}
