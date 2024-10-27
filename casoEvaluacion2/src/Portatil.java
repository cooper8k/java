/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Portatil extends Consola {
    
    private int autonomiaBateria;
    private float descuentoPortatil ;

    public Portatil() {
    }

    public Portatil(int autonomiaBateria, String marca, String modelo, int precio) {
        super(marca, modelo, precio);
        this.autonomiaBateria = autonomiaBateria;
        this.descuentoPortatil=0.07f;
    
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public float getDescuentoPortatil() {
        return descuentoPortatil;
    }

    public void setDescuentoPortatil(float descuentoPortatil) {
        this.descuentoPortatil = descuentoPortatil;
    }
    
            
            
            
    @Override
    public String clasificacionConsola() {
        return "portatil";
    }

    @Override
    public double CalcularPrecioFinal() {
        double PrecioFinal=0;
        double descuentoMoneda=getPrecio()*descuentoPortatil;
        PrecioFinal=(getPrecio()-descuentoMoneda)*IVA;
        return PrecioFinal;
    }
    
    
    
}
