
/**
 *
 * @author orlan
 */
public class Producto {
    private String idProducto,nomProducto;
    private int precio,stock;
    private Proveedor proveedor;
    private Categoria categoria;

    public Producto() {
    }

    public Producto(String idProducto, String nomProducto, int precio, int stock, Proveedor proveedor, Categoria categoria) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
        this.categoria = categoria;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nomProducto=" + nomProducto + ", precio=" + precio + ", stock=" + stock + ", proveedor=" + proveedor + ", categoria=" + categoria + '}';
    }
    
    public void mostrarInfoProducto () {
        System.out.println("producto: "+this.getNomProducto());
        System.out.println("precio: "+this.getPrecio());
        System.out.println("cantidd de stock: "+this.getStock());
        System.out.println("categoria: " + this.getCategoria().getNomCategoria());
        System.out.println("proveedor: "+this.getProveedor().getNomProveedor());
    }
    
    
    
    public void comprarProducto (int cantidad) {
        System.out.println(" el stoclk actual es: "+this.getStock());
        if (this.getStock()>cantidad) {
            int total = this.getPrecio() * cantidad;
            this.setStock(this.getStock()-cantidad); // estoy mutando el stock con el set
            System.out.println("el nuevo stock es :"+this.getStock());
            System.out.println("el total de la compra es : $"+total);
        }else {
            System.out.println("no ahi stock disponible o hay un error");
        }
        
    }
}
