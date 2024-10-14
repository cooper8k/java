/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author orlan
 */
public class Auto {
    private String numeroChasis,kilometrosPorLitro;
    private float valorPesoChileno, cargoFijoMantencion;
    private Cliente cliente;

    public Auto() {
    }

    public Auto(String numeroChasis, String kilometrosPorLitro, float valorPesoChileno, float cargoFijoMantencion, Cliente cliente) {
        this.numeroChasis = numeroChasis;
        this.kilometrosPorLitro = kilometrosPorLitro;
        this.valorPesoChileno = valorPesoChileno;
        this.cargoFijoMantencion = cargoFijoMantencion;
        this.cliente = cliente;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getKilometrosPorLitro() {
        return kilometrosPorLitro;
    }

    public void setKilometrosPorLitro(String kilometrosPorLitro) {
        this.kilometrosPorLitro = kilometrosPorLitro;
    }

    public float getValorPesoChileno() {
        return valorPesoChileno;
    }

    public void setValorPesoChileno(float valorPesoChileno) {
        this.valorPesoChileno = valorPesoChileno;
    }

    public float getCargoFijoMantencion() {
        return cargoFijoMantencion;
    }

    public void setCargoFijoMantencion(float cargoFijoMantencion) {
        this.cargoFijoMantencion = cargoFijoMantencion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Auto{" + "numeroChasis=" + numeroChasis + ", kilometrosPorLitro=" + kilometrosPorLitro + ", valorPesoChileno=" + valorPesoChileno + ", cargoFijoMantencion=" + cargoFijoMantencion + ", cliente=" + cliente + '}';
    }

    

    
    
    public void validarNumeroCHasis (Cliente cliente) {
        if (getNumeroChasis().length()==8){
            System.out.println("numero valido");
            if (getNumeroChasis()==cliente.getChasis()) {
                System.out.println("numero valido");
                System.out.println("chasis: "+this.getNumeroChasis());
                cliente.mostrarDatosCliente();
            } else {
                System.out.println("el cliente no tiene auto vinculado ");
            }
        } else {
            System.out.println("debe ingresar 8 numeros de chasis");
        }
    
    }
    
    public void obtenerDescuento(Cliente cliente){
        double totalIva,total2,total3,totalPagar=0;
        if (cliente.getTipoCliente()=="p") {
                
                total2=(float)(getValorPesoChileno()*0.1);
                total3=(float)(getValorPesoChileno()*0.9);
                totalIva=(float) (total3*0.19);
                totalPagar=total3+totalIva;
                System.out.println("............................................");
                System.out.println("valor bruto $"+this.getValorPesoChileno());
                System.out.println("descuento 10%: $"+total2);
                System.out.println("total: $"+total3);
                System.out.println("iva: $"+totalIva);
                System.out.println("a pagar: $"+totalPagar);
                System.out.println("............................................");
                
        }else if (cliente.getTipoCliente()=="n"){
            System.out.println("cliente no aplica descuento");
            System.out.println("valor total: $"+this.getValorPesoChileno());
            
        } else {
            System.out.println("no ahi datos de tipo de cliente");
        }
        
        
    }
    
    public void mantenciones(Cliente cliente) {
        double totalN = 0,totalP=0;
        if (cliente.getTipoCliente()=="n") {
            setCargoFijoMantencion(cargoFijoMantencion);
            cargoFijoMantencion=(float) (cargoFijoMantencion*0.95);
            System.out.println("descuento con el 5%:"+cargoFijoMantencion);
        } 
        else if (cliente.getTipoCliente()=="p") {
            setCargoFijoMantencion(cargoFijoMantencion);
            cargoFijoMantencion=(float) (cargoFijoMantencion*0.9);
            System.out.println("descuento con el 10%:"+cargoFijoMantencion);
    }
}
}
    
    
    
    
    

