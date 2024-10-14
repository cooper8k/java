/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Main {
    public static void main(String[] args) {
        Producto pro1 = new Producto(1, "leche",5);
        Producto pro2 = new Producto(2, "colados",14);
        Producto pro3 = new Producto(3, "crema",3);
        
        pro1.mostrarDatos();
        
        pro2.mostrarDatos();
        
        pro3.mostrarDatos();
        
        Producto objpro = new Producto();
        System.out.println("***********");
        objpro.productoMasVendido(pro1, pro2, pro3);
        
    }
}
