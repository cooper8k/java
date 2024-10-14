/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Cliente {
    private String rut,nombreCompleto,telefono,correoElectronico;
    private String tipoCliente;
    private String chasis;

    public Cliente() {
    }

    public Cliente(String rut, String nombreCompleto, String telefono, String correoElectronico, String tipoCliente, String chasis) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.tipoCliente = tipoCliente;
        this.chasis = chasis;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombreCompleto=" + nombreCompleto + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + ", tipoCliente=" + tipoCliente + ", chasis=" + chasis + '}';
    }

   public void mostrarDatosCliente() {
        System.out.print(this.getNombreCompleto()+" ");
        System.out.print(this.getTelefono()+" ");
        System.out.println(this.getTipoCliente());
    }
   
    public void modificarCliente (String modificacionCliente ) {
       this.setTipoCliente(tipoCliente);
       tipoCliente = modificacionCliente;
    }
      
    
    public void ValtipoCliente (){
        if (getTipoCliente().equalsIgnoreCase("p")){
            System.out.println("persona preferencial");
        }else if (getTipoCliente().equalsIgnoreCase("n")) {
            System.out.println("persona normal");
                    
        } else {
            System.out.println("tipo de persona :no valida");
        }
    }
    
    
    
    
    
}
