/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vina
 */
public class Cliente {
    private String rut,nombre_completo,correo;
    private int telefono;

    public Cliente() {
    }

    public Cliente(String rut, String nombre_completo, String correo, int telefono) {
        this.rut = rut;
        this.nombre_completo = nombre_completo;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre_completo=" + nombre_completo + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
}
