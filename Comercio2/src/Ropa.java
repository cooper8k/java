/**
 *
 * @author orlan
 */
public class Ropa extends Producto {
    private String talla,color;

    public Ropa() {
    }

    public Ropa(String talla, String color, String idProducto, String nombre, Double precio) {
        super(idProducto, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", color=" + color + '}';
    }
    
    
    public void ajustarTalla (String nueva_talla) {
    
        this.setTalla(nueva_talla);
    }
    
}
