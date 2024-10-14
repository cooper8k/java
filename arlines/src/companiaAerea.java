/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class companiaAerea {
    private String idCompania,combreCompania,vuelosDisponibles;

    public companiaAerea() {
    }

    public companiaAerea(String idCompania, String combreCompania, String vuelosDisponibles) {
        this.idCompania = idCompania;
        this.combreCompania = combreCompania;
        this.vuelosDisponibles = vuelosDisponibles;
    }

    public String getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(String idCompania) {
        this.idCompania = idCompania;
    }

    public String getCombreCompania() {
        return combreCompania;
    }

    public void setCombreCompania(String combreCompania) {
        this.combreCompania = combreCompania;
    }

    public String getVuelosDisponibles() {
        return vuelosDisponibles;
    }

    public void setVuelosDisponibles(String vuelosDisponibles) {
        this.vuelosDisponibles = vuelosDisponibles;
    }

    @Override
    public String toString() {
        return "companiaAerea{" + "idCompania=" + idCompania + ", combreCompania=" + combreCompania + ", vuelosDisponibles=" + vuelosDisponibles + '}';
    }
   

    
    
    
}
