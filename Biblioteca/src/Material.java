/**
 *
 * @author orlan
 */
public class Material {
    protected String idMaterial,tituloMaterial;
    protected boolean disponibilidad;

    public Material() {
    }

    public Material(String idMaterial, String tituloMaterial, boolean disponibilidad) {
        this.idMaterial = idMaterial;
        this.tituloMaterial = tituloMaterial;
        this.disponibilidad = disponibilidad;
    }

    public String getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(String idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getTituloMaterial() {
        return tituloMaterial;
    }

    public void setTituloMaterial(String tituloMaterial) {
        this.tituloMaterial = tituloMaterial;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Material{" + "idMaterial=" + idMaterial + ", tituloMaterial=" + tituloMaterial + ", disponibilidad=" + disponibilidad + '}';
    }

   public boolean verificarDisponibilidad() {
       if (isDisponibilidad()==true) {
           return true;
       } else {
           return false;
       }
   }
    
    
}
