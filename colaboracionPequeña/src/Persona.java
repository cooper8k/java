
/**
 *
 * @author orlan
 */
public class Persona {
    private String BuscarAsiento;

    public Persona() {
    }

    public Persona(String BuscarAsiento) {
        this.BuscarAsiento = BuscarAsiento;
    }

    public String getBuscarAsiento() {
        return BuscarAsiento;
    }

    public void setBuscarAsiento(String BuscarAsiento) {
        this.BuscarAsiento = BuscarAsiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "BuscarAsiento=" + BuscarAsiento + '}';
    }
    
    
    
}
