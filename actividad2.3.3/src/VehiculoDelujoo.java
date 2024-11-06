/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class VehiculoDelujoo extends Vehiculo  {

    public VehiculoDelujoo(String idVehiculo, String modelo) {
        super(idVehiculo, modelo);
    }

    @Override
    public double calcularCostoAlquiler() {
        double costo=0;
        costo=getCostoBase()+650_000;
        return costo;

    }
 
    
    
    

    

    
}
