/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Electronico extends Producto{
    private String marca;
    private int grantiaMeses;

    public Electronico() {
    }

    public Electronico(String marca, int grantiaMeses, String producto, String nombre, double precio) {
        super(producto, nombre, precio);
        this.marca = marca;
        this.grantiaMeses = grantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGrantiaMeses() {
        return grantiaMeses;
    }

    public void setGrantiaMeses(int grantiaMeses) {
        this.grantiaMeses = grantiaMeses;
    }

    @Override
    public String toString() {
        return super.toString()+"Electronico{" + "marca=" + marca + ", grantiaMeses=" + grantiaMeses + '}';
    }
    
    public void extenderGrantia (int mesesExtra){
        setGrantiaMeses(grantiaMeses+mesesExtra);
        
    }
    
}
