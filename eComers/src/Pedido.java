
import java.util.ArrayList;

/**
 *
 * @author orlan
 */
public class Pedido {
    private ArrayList<Producto> listaProductos;
    private double total;
    
    public Pedido () {
        listaProductos=new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" + "listaProductos=" + listaProductos + ", total=" + total + '}';
    }
    
    
    public boolean agregarProducto(Producto producto) {
        return listaProductos.add(producto);
    }
    
    public void listar() {
        System.out.println("productos");
        System.out.println("************");
        for (Producto i : listaProductos) {
            System.out.println(i.toString());
        }
    }
}
