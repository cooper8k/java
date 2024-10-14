/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Alumno {
    private String rut , nombreAlumno ,edad, fechaNacimiento;

    public Alumno() {
    }

    public Alumno(String rut, String nombreAlumno, String edad, String fechaNacimiento) {
        this.rut = rut;
        this.nombreAlumno = nombreAlumno;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", nombreAlumno=" + nombreAlumno + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    public void mostrarDatosAlumno () 
    {
        System.out.println("rut: " +this.getRut());
        System.out.println("nombre: "+this.getNombreAlumno());
        System.out.println("edad: "+this.getEdad());
        System.out.println("fecha de nacimiento: "+this.getFechaNacimiento());
    }
}
