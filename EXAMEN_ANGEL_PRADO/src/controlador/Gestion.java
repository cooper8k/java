/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Vehiculo;
import modelo.Venta;

/**
 *
 * @author vina
 */
public class Gestion {
    static ArrayList<Cliente> listacliente = new ArrayList<>();
    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    ArrayList<Venta> listaVenta = new ArrayList<>();
    
    public void agregarCliente(Cliente cliente){
    listacliente.add(cliente);
    }
    
    public void listarClientes (){
        for (Cliente cli : listacliente) {
            System.out.println(cli);
        }
    }
    
    public void agregarVehiculo (Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }
    
    public void lisarVehiculo(){
        for (Vehiculo vehi : listaVehiculos) {
            vehi.mostrarDatos();
        }
    }
    
    
    
    
     public void agrearVenta (Venta venta) {
        listaVenta.add(venta);
    
    }
    
    public void listarVenta (){
        for (Venta vent : listaVenta) {
            System.out.println(vent);
        }
    }
    
    public ArrayList<Cliente>listarclientestabla(){
        ArrayList<Cliente> clienteTabla = new ArrayList<>();
        for (Cliente cli : listacliente) {
            clienteTabla.add(cli);
        }
        return clienteTabla;
    
    }
    
    
   
    
}
