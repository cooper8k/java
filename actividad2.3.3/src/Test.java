/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Test {
    public static void main(String[] args) {
        
       VehiculoEstandar v1= new VehiculoEstandar("123","kia");
       VehiculoEstandar v2= new VehiculoEstandar("123","rio");
       VehiculoEstandar v3= new VehiculoEstandar("123","suzuki");
       
       VehiculoDelujoo v4 = new VehiculoDelujoo("2334", "lexus");
       VehiculoDelujoo v5 = new VehiculoDelujoo("23334", "maserati");
       VehiculoDelujoo v6 = new VehiculoDelujoo("23314", "mclaren");
       
       
        Sucursal sucursal1 = new Sucursal("123","apautos");
       
        
        sucursal1.agregarVehivulos(v6);
        sucursal1.agregarVehivulos(v1);
        sucursal1.agregarVehivulos(v2);
        sucursal1.agregarVehivulos(v3);
        sucursal1.agregarVehivulos(v4);
        sucursal1.agregarVehivulos(v5);
        
        sucursal1.listar();
        
        
        sucursal1.calcularCostoTotal();
       
    }

  
   
}
