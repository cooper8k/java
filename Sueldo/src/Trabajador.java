
/**
 *
 * @author orlan
 */
public class Trabajador {
    private String nombre;
    private int sueldo,anioServiocio;

    public Trabajador() {
    }

    public Trabajador(String nombre, int sueldo, int anioServiocio) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.anioServiocio = anioServiocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnioServiocio() {
        return anioServiocio;
    }

    public void setAnioServiocio(int anioServiocio) {
        this.anioServiocio = anioServiocio;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", anioServiocio=" + anioServiocio + '}';
    }
    
    public void SubirSueldo()
           
    {
        float nuevoSueldo,nuevoSueldo2;
        if (getSueldo()<500000 && getAnioServiocio() >=10) 
        {
            nuevoSueldo = getSueldo()*1.20f;
            System.out.println("sueldo a pagar:"+nuevoSueldo);
        }
        
        if (getSueldo()<500000 && getAnioServiocio()<10) 
        {
            nuevoSueldo2=getSueldo()*1.05f;
            System.out.println("nuevo sueldo es:"+nuevoSueldo2);
        }
        
        if (getSueldo()>500000)
        {
            System.out.println("su sueldo no tiene modificaciones:" + getSueldo());
        }
    }
    
}
