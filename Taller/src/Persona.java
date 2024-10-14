/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angel
 */
// heranan saavedra youtube

public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private float estatura;
    
    // constructores >> con o sin parametros
    
    public Persona() { 
    }
    public Persona (String nombre, int edad, float estatura) {
        this.nombre= nombre;
        this.edad=edad;
        this.estatura=estatura;
    }
  
    
    // accesadores y mutadores > getter and setter
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    // metodos

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }

    public void validadEdad()
    {
        if (getEdad()>=18) 
        {
            System.out.println("es mayor de edad: "+this.edad);
        }else 
        {
            System.out.println("es menor de edad: "+this.edad);
        }
    }
    
    public void premio () 
    {
        if (getNombre().equalsIgnoreCase("angel")) 
        {
            System.out.println("te ganaste $10.000");
        } else 
        {
            System.out.println("no ganas nada");
        }
    }
    
}
