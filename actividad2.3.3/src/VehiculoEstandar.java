/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class VehiculoEstandar extends Vehiculo  {

    public VehiculoEstandar(String idVehiculo, String modelo) {
        super(idVehiculo, modelo);
    }

    @Override
    public double calcularCostoAlquiler() {
        double costo=0;
        costo=getCostoBase()+450_000;
        return costo;

    }
 
    
    
    

    

    
}
