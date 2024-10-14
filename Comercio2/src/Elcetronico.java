/**
 *
 * @author orlan
 */
public class Elcetronico extends Producto {
    private String marca;
    private int mesesGarantia;

    public Elcetronico() {
    }

    public Elcetronico(String marca, int mesesGarantia, String idProducto, String nombre, Double precio) {
        super(idProducto, nombre, precio);
        this.marca = marca;
        this.mesesGarantia = mesesGarantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public String toString() {
        return "Elcetronico{" + "marca=" + marca + ", mesesGarantia=" + mesesGarantia +  super.toString()+'}'; 
        // puedo usar super tanto como al inicio del toString como al final
    }
    
    
    public void extenderGarantia(int mesesExtra){
        this.mesesGarantia=this.mesesGarantia +mesesExtra;
        // this.mesesGarantia *= mesesExtra;
        // this.setMesesGarantia(this.getMesesGarantia() + mesesExtra);
        
        // estos 3 metodos son lo mismo 
    }
    
    
}
