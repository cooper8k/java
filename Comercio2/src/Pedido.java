import java.util.ArrayList;
/**
 *
 * @author orlan
 */
public class Pedido {
    private ArrayList<Producto> productos;
    private double total;

    public Pedido() {
        productos = new ArrayList<>();
    }

    public void agregarProducto (Producto prod) {
        this.productos.add(prod);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double calcularTotal() {
        total=0;
        for (Producto prod : productos) {
            total = total + prod.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" + "productos=" + productos + ", total=" + total + '}';
    }
}
