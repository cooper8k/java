
import java.util.ArrayList;

/**
 *
 * @author orlan
 */
public class Cliente {
    private String idCliente,mombre;
    private ArrayList<Pedido> pedidosRealizados;

    public Cliente() {
    }

    public Cliente(String idCliente, String mombre) {
        this.idCliente = idCliente;
        this.mombre = mombre;
        this.pedidosRealizados = new ArrayList<>();
    }
    
    public void agregarPedido (Pedido pedido) {
        this.pedidosRealizados.add(pedido);
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", mombre=" + mombre + ", pedidosRealizados=" + pedidosRealizados + '}';
    }
    
    
    
}
