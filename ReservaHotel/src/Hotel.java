import java.util.ArrayList;
/**
 *
 * @author orlan
 */
public class Hotel {

    
    private String idhotel,nombre;
    private ArrayList<Habitacion> habitacionesDisponibles;

    public Hotel() {
        // 
    }

    public Hotel(String idhotel, String nombre) {
        this.idhotel = idhotel;
        this.nombre = nombre;
        this.habitacionesDisponibles = new ArrayList<Habitacion>(); // forma de crear un array list
        
        
    }
    
    public boolean agregarHabitacion (Habitacion habitacion) {
        return habitacionesDisponibles.add(habitacion);
    }
    
    public void listarHabitacion (){
        for (Habitacion i : habitacionesDisponibles) {
        System.out.println(i.toString());
    }
        
    }

    public String getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(String idhotel) {
        this.idhotel = idhotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(ArrayList<Habitacion> habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    @Override
    public String toString() {
        return "Hotel{" + "idhotel=" + idhotel + ", nombre=" + nombre + ", habitacionesDisponibles=" + habitacionesDisponibles + '}';
    }

    
    
}
