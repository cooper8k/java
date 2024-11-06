/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Conejo extends Mascota{
    private String comida;

    public Conejo() {
    }

    public Conejo(String comida, String nombre, String idMascota, double peso, int edad, int diasAlojamiento, boolean reqVeterinario) {
        super(nombre, idMascota, peso, edad, diasAlojamiento, reqVeterinario);
        this.comida = comida;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
     

    @Override
    public void mostrarDatosmascota() {
        System.out.println("conejo");
        System.out.println(".........");
        // estos 3 datos sirven
        System.out.println("nombre"+super.getNombre()); // ese
        System.out.println("codigo"+this.getIdMascota()); /// ese
        System.out.println("peso"+ peso); // ese
        System.out.println("edad"+super.getEdad());
        System.out.println("dias alojamiento"+diasAlojamiento);
        if (reqVeterinario) {
            System.out.println("requerie vet");
        } else {
            System.out.println(" no requiere vet");
        }
        System.out.println("tipo de comida"+getComida());
    }
    
}
