
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class hotel {
    
    private ArrayList<Mascota> listaMascota;

    public hotel() {
        listaMascota=new ArrayList<>();
    }
    
    public boolean buscarMascota(String codigoMascota) {
        for (Mascota mas : listaMascota) {
            if(mas.getIdMascota().equals(codigoMascota)) {
                return true;
            }
        }
        return false;
    }
    
    
    public void agregarMAscota(Mascota masco) {
        
        if (buscarMascota(masco.getIdMascota())== false ) {
            listaMascota.add(masco);
        } else {
            System.out.println("mascota ya existe ");
        }
    
    }
    
    public void mostrarMascota(){
        for (Mascota masc : listaMascota) {
            masc.mostrarDatosmascota(); // polimorfismo
            
        }
    }
    
    public void cantidadMascota() {
    
        System.out.println("ahi " +listaMascota.size()+"mascotas");
    }
    
}
