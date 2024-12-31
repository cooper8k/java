/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Gestion;
import modelo.Automovil;
import modelo.Camioneta;
import modelo.Cliente;
import modelo.Vehiculo;
import modelo.Venta;

/**
 *
 * @author vina
 */
public class Vista_terminal {
    public static void main(String[] args) {
        Gestion gest = new Gestion();
 
    Cliente cliente1 = new Cliente("19434-4", "juan pedro ardiles casas", "@juan", 9924582);
    Cliente cliente2 = new Cliente("29434-4", "maria patricia vargas prado", "@maria", 9925541);
    Cliente cliente3 = new Cliente("2145784-5", "pedro andres carrasco castro", "@pedro", 541353151);
    Cliente cliente4 = new Cliente("184612-5", "nicolas maria messi ronaldo", "@nicolas", 54631324);
    
    gest.agregarCliente(cliente1);
    gest.agregarCliente(cliente2);
    gest.agregarCliente(cliente3);
    gest.agregarCliente(cliente4);
    
    gest.listarClientes();
    
    Vehiculo vehiculo1 = new Camioneta("1500kg", "hhyj32", "nissan", "np300", 12000);
    Vehiculo vehiculo2 = new Camioneta("2500kg", "sskj23", "mistubishi", "l200", 14000);
    Vehiculo vehiculo3 = new Automovil("cmvencional ", true, "hdsa24", "kia", "stinger", 2500);
    Vehiculo vehiculo4 = new Automovil("electrico ", false, "erwq12", "tesla", "modelo 3", 22300);
    
    gest.agregarVehiculo(vehiculo1);
    gest.agregarVehiculo(vehiculo2);
    gest.agregarVehiculo(vehiculo3);
    gest.agregarVehiculo(vehiculo4);
    
    gest.lisarVehiculo();
    
    
        Venta venta1 = new Venta(cliente1, vehiculo1,"21/12/2023" , 15050);
        Venta venta2 = new Venta(cliente2, vehiculo2,"22/11/2023" , 25050);
        Venta venta3 = new Venta(cliente3, vehiculo3,"23/10/2023" , 35050);
        Venta venta4 = new Venta(cliente4, vehiculo4,"24/09/2023" , 5050);
        
        gest.agrearVenta(venta1);
        gest.agrearVenta(venta2);
        gest.agrearVenta(venta3);
        gest.agrearVenta(venta4);
    
        gest.listarVenta();
    
    
    
    }
    
    
    
}
