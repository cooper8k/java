/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class validacion {
    
    // todas las validaciones que sean booleanas como recomendacion..
    public boolean validarPrecio (int precio) {
        if (precio>0) {
            return true;
        } else {
            return false;
        }
    }
    // lo de aca arriba es lo mismo que return precio > 0;
    // en cantidad es lo mismo que precio
    public boolean validarCantidad (int cantidad) {
        return cantidad > 0;
    }
    
    public boolean validarNombre (String nombre) {
        if (nombre.isEmpty()) {
            return false;
        }else {
            return true;
        }
    }
    
    
}
