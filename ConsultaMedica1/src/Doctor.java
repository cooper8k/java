/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Doctor {
     private String rut,nombre,apellido;
    private int edad;
    private String especialidad,turno;

    public Doctor() {
    }

    public Doctor(String rut, String nombre, String apellido, int edad, String especialidad, String turno) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.especialidad = especialidad;
        this.turno = turno;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
            this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Doctor{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", especialidad=" + especialidad + ", turno=" + turno + '}';
    }
    
    
    public void validarEdad () 
    {
        if (this.edad>=25) 
        {
            System.out.println("edad acorde para ejercer: " + this.edad);
        } else {
            System.out.println("edad no permitida para ejercer: "+ this.edad);
        }
    }
    
    
    public void mostrarDatos()
    {
        System.out.println("------------------------------");
        System.out.println("rut: "+this.rut);
        System.out.println("nombre: "+this.nombre);
        System.out.println("apellidot: "+this.apellido);
        System.out.println("edad: " );
        System.out.println("especialiad: "+this.especialidad);
        System.out.println("turno: "+this.turno);
        System.out.println("------------------------------");
    }
}
