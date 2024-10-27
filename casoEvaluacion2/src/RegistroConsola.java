
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class RegistroConsola {
    
    private ArrayList<Consola> listaConsolas;

    public RegistroConsola() {
        
        listaConsolas= new ArrayList<>();
    }
    
    
    public boolean buscarConsola(String marca) {
        for (Consola i : listaConsolas) {
            if (marca.equalsIgnoreCase(i.getMarca())) {
                return true;               
            }
        }
        return false;
    }
    
    public boolean agregarConsola(Consola consola){
        if (buscarConsola(consola.getModelo())==true) {
            System.out.println("consola ya existente");
            return false;
        } else {
            listaConsolas.add(consola);
            System.out.println(" consola agregada");
            return true;
        }
    }
    
    public void Listar(){
        System.out.println("listado de consolas");
        System.out.println("--------------------------");
        for (Consola i : listaConsolas) {
            System.out.println(i.toString() + "precio final:  $" + i.CalcularPrecioFinal());
            
        }
    }
    
    public boolean eliminarConsola(String marca) {
        for (Consola i : listaConsolas) {
            if (marca.equalsIgnoreCase(i.getModelo())) {
                listaConsolas.remove(i);
                System.out.println("consola eliminada");
                return true;
            }
        } return false;
    }
    
    
    public int obtenerConsolasCaras(){
        int cantidad=0;
        for (Consola i : listaConsolas) {
            if (i.getPrecio()>500_000) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public void clasificacionConsolas(){
        int cantidadPortatil=0 , cantidadSobremesa=0;
        for (Consola i : listaConsolas) {
            if (i.clasificacionConsola().equalsIgnoreCase("portatil")) {
                cantidadPortatil++;
                
            } else {
                if (i.clasificacionConsola().equalsIgnoreCase("sobremesa")) {
                    cantidadSobremesa++;
                }
            }
        }
        System.out.println("cantidad consolas portatil  "+ cantidadPortatil);
        System.out.println("cantidad consolas sobremes " + cantidadSobremesa);
        
    }
    
    
}
