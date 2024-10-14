
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Empresa {
    private ArrayList<Empleado> listaEmpleado;
    
    public Empresa () 
    {
        listaEmpleado = new ArrayList<Empleado>();
    
    }
    
    public boolean agregar (Empleado empleado) 
    {
        return listaEmpleado.add(empleado);
    }
    
    public void listarEmpleado ()
    {
        for(Empleado i : listaEmpleado) {
            System.out.println(i);
        }
    }
    
    public boolean buscarEmplado (String rut) 
    {
        for (Empleado i : listaEmpleado) 
        {
            if (i.getRut().equals(rut)) {
                return true;
            }
        }
        return false;
    }
}
