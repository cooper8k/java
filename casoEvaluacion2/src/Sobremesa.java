/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Sobremesa extends Consola {
    
    private int numeroControles;
    private float descuentoSobremesa ;

    public Sobremesa() {
    }

    public Sobremesa(int numeroControles, String marca, String modelo, int precio) {
        super(marca, modelo, precio);
        this.numeroControles = numeroControles;
        this.descuentoSobremesa=0.1f;
    
    }

    public int getNumeroControles() {
        return numeroControles;
    }

    public void setNumeroControles(int numeroControles) {
        this.numeroControles = numeroControles;
    }

    public float getDescuentoSobremesa() {
        return descuentoSobremesa;
    }

    public void setDescuentoSobremesa(float descuentoSobremesa) {
        this.descuentoSobremesa = descuentoSobremesa;
    }
    
            
            
            
    @Override
    public String clasificacionConsola() {
        return "sobremesa";
    }

    @Override
    public double CalcularPrecioFinal() {
        double PrecioFinal=0;
        double descuentoMoneda=getPrecio()*descuentoSobremesa;
        PrecioFinal=(getPrecio()-descuentoMoneda)*IVA;
        return PrecioFinal;
    }
    
    
    
}
