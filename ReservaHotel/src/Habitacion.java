
/**
 *
 * @author orlan
 */
public class Habitacion {
    private String numeroHabitacion;
    private double precioNoche;
    private boolean disponible;

    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, double precioNoche, boolean disponible) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioNoche = precioNoche;
        this.disponible = disponible;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numeroHabitacion=" + numeroHabitacion + ", precioNoche=" + precioNoche + ", disponible=" + disponible + '}';
    }
    
    
}
