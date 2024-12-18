import java.util.ArrayList;
/**
 *
 * @author orlan
 */
public class Cliente {
    private String idCliente,nombre;
    private ArrayList<Reserva> reservasRealizadas;

    public Cliente() {
        //
    }

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reservasRealizadas = new ArrayList<Reserva>();
    }
    
    public boolean agregar (Reserva reserva) {
        return reservasRealizadas.add(reserva);
    }
    
    
    public void listar () {
        for (Reserva i : reservasRealizadas){
            System.out.println(i.toString());
        }
        
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public void setReservasRealizadas(ArrayList<Reserva> reservasRealizadas) {
        this.reservasRealizadas = reservasRealizadas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", reservasRealizadas=" + reservasRealizadas + '}';
    }
    
    
}
