import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido1 = new Pedido("Laptop", "Erick Pazmiño",1200.50, "erick.pazmiño@email.com",
         "0998765432");
        
        PedidoService pedidoService = new PedidoService();
        pedidoService.registrar(pedido1);

    }
}
