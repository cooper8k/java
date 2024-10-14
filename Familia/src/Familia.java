/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Familia {
    // atributos
    private String papa ,mama,hermano,hermana;
    private int cantidad_integrantes;
    
    // constructor

    public Familia(String papa, String mama, String hermano, String hermana, int cantidad_integrantes) {
        this.papa = papa;
        this.mama = mama;
        this.hermano = hermano;
        this.hermana = hermana;
        this.cantidad_integrantes = cantidad_integrantes;
    }

    public String getPapa() {
        return papa;
    }

    public void setPapa(String papa) {
        this.papa = papa;
    }

    public String getMama() {
        return mama;
    }

    public void setMama(String mama) {
        this.mama = mama;
    }

    public String getHermano() {
        return hermano;
    }

    public void setHermano(String hermano) {
        this.hermano = hermano;
    }

    public String getHermana() {
        return hermana;
    }

    public void setHermana(String hermana) {
        this.hermana = hermana;
    }

    public int getCantidad_integrantes() {
        return cantidad_integrantes;
    }

    public void setCantidad_integrantes(int cantidad_integrantes) {
        this.cantidad_integrantes = cantidad_integrantes;
    }

    @Override
    public String toString() {
        return "Familia{" + "papa=" + papa + ", mama=" + mama + ", hermano=" + hermano + ", hermana=" + hermana + ", cantidad_integrantes=" + cantidad_integrantes + '}';
    }
    
}
