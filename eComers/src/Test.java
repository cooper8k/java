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
        Electronico electrico1 = new Electronico("sony", 12, "123", "tv", 300_000);
        Electronico electrico2 = new Electronico("lg", 12, "564", "lavadora", 3_000_000);
        Electronico electrico3 = new Electronico("samsung", 12, "54354", "celular", 350_000);
        
        Pedido pedido1 = new Pedido();
        
        pedido1.agregarProducto(electrico1);
        pedido1.agregarProducto(electrico2);
        pedido1.agregarProducto(electrico3);
        
        pedido1.listar();
    }
}
