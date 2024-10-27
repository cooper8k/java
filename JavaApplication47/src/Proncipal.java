/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Proncipal {
    public static void main(String[] args) {
        Producto tienda1=new TiendaDeCampaña("grande", 1, 50000, 4, "tienda grande full", "GTD");
        Producto tienda2=new TiendaDeCampaña("median", 2, 40000, 4, "tienda mediana full", "GTD");
        Producto tienda3=new TiendaDeCampaña("grande", 3, 30000, 4, "tienda infantill", "GTD");
        
        Producto mochila1 = new Mochila("senderismo", 4, 35000, 10, "send1", "head");
        Producto mochila2 = new Mochila("alpinismo", 5, 45000, 11, "send2", "saxoline");
        
        Producto saco1 = new SacoDeDormir("media baja", 6, 120000, 10, "saco1", "australia");
        Producto saco2 = new SacoDeDormir("media alta", 7, 90000, 10, "saco2", "austri");
        
        
        
        Inventario inventario = new Inventario();
        
        inventario.agregarProductos(tienda1);
        inventario.agregarProductos(tienda2);
        inventario.agregarProductos(tienda3);
        inventario.agregarProductos(mochila1);
        inventario.agregarProductos(mochila2);
        inventario.agregarProductos(saco1);
        inventario.agregarProductos(saco1);
        
        
        inventario.mostrarInventario();
        
        
        System.out.println("el total es :"+inventario.calcularTotalInventario());
        
    }
}
