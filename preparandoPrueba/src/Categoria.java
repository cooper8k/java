
/**
 *
 * @author orlan
 */
public class Categoria {
    private String idCategoria,nomCategoria,desCategoria;

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public String getDesCategoria() {
        return desCategoria;
    }

    public void setDesCategoria(String desCategoria) {
        this.desCategoria = desCategoria;
    }

    public Categoria() {
    }

    public Categoria(String idCategoria, String nomCategoria, String desCategoria) {
        this.idCategoria = idCategoria;
        this.nomCategoria = nomCategoria;
        this.desCategoria = desCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nomCategoria=" + nomCategoria + ", desCategoria=" + desCategoria + '}';
    }
    
    
}
