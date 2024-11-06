
/**
 *
 * @author orlan
 */
public  class Vehiculo implements CostoAlquilerCalculable {

   
    
    protected String idVehiculo,modelo;
    protected double costoBase;

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, String modelo) {
        this.idVehiculo = idVehiculo;
        this.modelo = modelo;
        this.costoBase = 200_000;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", modelo=" + modelo + ", costoBase=" + costoBase + '}';
    }
    
     @Override
    public double calcularCostoAlquiler() {
        return 0;
    }
    
    
}
