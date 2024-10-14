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
        Puesto puesto1 = new Puesto (1,"gerente");
        Puesto puesto2 = new Puesto (2,"ejecutivo");
        
        Empleado empleado1 = new Empleado ("111","lucho",'m',10,30,puesto1);
        Empleado empleado2 = new Empleado ("221","herni",'f',15,80,puesto2);
        
        Empresa empresa = new Empresa();
        
        if (empresa.buscarEmplado("111")==false) 
        {
            empresa.agregar(empleado1);
            System.out.println("agregado");
        } else 
        {
            System.out.println("ya existe");
        } 
        
        empresa.agregar(empleado2);
        
        
        
        
 
    }
}
