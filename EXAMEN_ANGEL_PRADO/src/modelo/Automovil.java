/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vina
 */
public class Automovil extends Vehiculo{
    private String tipo_energia;
    private boolean aireAcondicionado;

    public Automovil() {
    }

    public String getTipo_energia() {
        return tipo_energia;
    }

    public void setTipo_energia(String tipo_energia) {
        this.tipo_energia = tipo_energia;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public Automovil(String tipo_energia, boolean aireAcondicionado, String patente, String marca, String modelo, int kilometraje) {
        super(patente, marca, modelo, kilometraje);
        this.tipo_energia = tipo_energia;
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public void mostrarDatos() {
        System.out.println(" Automobil = "  
                + " enegria = " + this.getTipo_energia() +
                " aire acondicionado = " + aireAcondicionado+
                " patente = " + this.getPatente() +
                " marca = " + this.getMarca() +
                " modelo = " + this.getModelo()+
                " kilometraje = " + this.getKilometraje());
    }

    
}
