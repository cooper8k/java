
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Inventario {
    private ArrayList <Producto> listaproductos;

    public Inventario() {
        listaproductos=new ArrayList<>();
    }
    
    
    public boolean buscarProducto(int codigo){
        for (Producto pro : listaproductos) {
            if (pro.getCodido()==codigo) {
                return true;
            }
        }
        return false;
    }
    
    
    public void agregarProductos(Producto prod) {
        if (buscarProducto(prod.getCodido())==false) {
            listaproductos.add(prod);
        } else {
            System.out.println("producto ya existe:  "+prod.getNombre());
        }
    }
    
    public void mostrarInventario() {
        for (Producto lista: listaproductos) {
            System.out.println("-----------productos-----------");
            lista.mostrarDetalle();
            System.out.println("--------------------");
        }
    }
    
    
    public double calcularTotalInventario(){
        double total=0;
        for (Producto list : listaproductos) {
            total=total+(list.getCantidad()*list.getPrecio());
        }
    return total;
    }
    
}
