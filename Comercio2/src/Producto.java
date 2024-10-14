/**
 *
 * @author orlan
 */
public class Producto {
    //cuando las clases son heredadas se usa el protected en lugar del private 
    protected String idProducto,nombre;
    protected Double precio;

    public Producto() {
    }

    public Producto(String idProducto, String nombre, Double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    public double calcularDescuento( double descuento) {
         double total = precio - precio * descuento;
        return total;
    }
    
    
    
}
