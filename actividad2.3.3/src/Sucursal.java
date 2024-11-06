
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Sucursal {
    
    private String idSucursal,nombreSucursal;
    private ArrayList<Vehiculo> listaVehiculos;

 

    public Sucursal(String idSucursal, String nombreSucursal) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.listaVehiculos =  new ArrayList<>();
    }

    public void agregarVehivulos(Vehiculo vehiculo) {
    
        listaVehiculos.add(vehiculo);
    
    }
    
    
    public void listar() {
        for (Vehiculo i : listaVehiculos) {
            System.out.println(i); 
        }
    }
    
    public double calcularCostoTotal() {
            double total =0;
            for (Vehiculo i : listaVehiculos)  {
                total+=i.calcularCostoAlquiler();
                
            }
            return 0;
        }
    
    
}
