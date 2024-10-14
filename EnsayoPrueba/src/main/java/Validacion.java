
/**
 *
 * @author orlan
 */
public class Validacion {
    // recomendaciones, todas las validaciones hagalas booleanas
    public boolean validarPrecio (int precio)
    {
        if (precio > 0)  
        {
            return true;
        }else 
        {
            return false;
        }
    }
    
    
    
    public boolean validadCantidad (int cantidad) 
    {
        return cantidad > 0;
    }
    
    
    public boolean validadNombre(String nombre) {
        if (nombre.isEmpty()) // significa que esta vacio//
        {
            return false;
        }
        else {
            return  true ;
        }
    }
}
