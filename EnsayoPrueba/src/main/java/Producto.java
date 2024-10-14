
/**
 *
 * @author orlan
 */
public class Producto {
    
   
    
    private String idProducto, nombreProducto;
    private int precio,stock;
    private Proveedor proveedor; // esto son colaboraciones 
    private Categoria categoria; 

    public Producto() {
    }

    public Producto(String idProducto, String nombreProducto, int precio, int stock, Proveedor proveedor, Categoria categoria) {
        
        //Validacion val = new Validacion();
        //if// (val.precio(precio)) {
            this.precio = precio;
        //}
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        //if (val.cantidad(stock)) {
            this.stock = stock;
        //}
        this.proveedor = proveedor;
        this.categoria = categoria;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
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
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", stock=" + stock + ", proveedor=" + proveedor + ", categoria=" + categoria + '}';
    }
    
    public void mostrarInfoProducto () {
        System.out.println("producto: " + this.getNombreProducto());
        System.out.println("precio: "+this.getPrecio());
        System.out.println("cantidad stock: "+getStock());
        System.out.println("categoria "+ this.getCategoria().getNombreCategoria());
        System.out.println("proveedor "+ this.getProveedor().getNomProveedor() );
    }
    
    
    public void comprarProducto (int cantidad) { 
        System.out.println("el stock es "+ this.getStock());
        if (this.getStock() >=cantidad) {
            int total = this.getPrecio() * cantidad;
           this.setStock(this.getStock()-cantidad);
            System.out.println("el nuevo stock es "+ this.getStock());
            System.out.println("el total de la compra es:   $"+total);
           
        } else {
            System.out.println("no ahi stock de producto");
        }
    }

  
    
    
}
