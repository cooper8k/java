/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public abstract class Mascota {
    protected String nombre,idMascota;
    protected double  peso ;
    protected int edad,diasAlojamiento;
    protected boolean reqVeterinario;

    public Mascota() {
    }

    public Mascota(String nombre, String idMascota, double peso, int edad, int diasAlojamiento, boolean reqVeterinario) {
        this.nombre = nombre;
        this.idMascota = idMascota;
        this.peso = peso;
        this.edad = edad;
        this.diasAlojamiento = diasAlojamiento;
        this.reqVeterinario = reqVeterinario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiasAlojamiento() {
        return diasAlojamiento;
    }

    public void setDiasAlojamiento(int diasAlojamiento) {
        this.diasAlojamiento = diasAlojamiento;
    }

    public boolean isReqVeterinario() {
        return reqVeterinario;
    }

    public void setReqVeterinario(boolean reqVeterinario) {
        this.reqVeterinario = reqVeterinario;
    }
    
    
    public abstract void mostrarDatosmascota();
    

   
    

    
    
}
