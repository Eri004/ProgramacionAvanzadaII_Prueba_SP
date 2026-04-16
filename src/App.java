import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
       
       //Caso 1
        Pedido pedido1 = new Pedido("Laptop", "Erick Pazmiño",1200.50, "erick.pazmiño@email.com",
         "0998765432");
        
        PedidoService pedidoService = new PedidoService();
        pedidoService.registrar(pedido1);

        //caso 2
        Pedido pedido2 = new Pedido("Mouse", "Maria Lopez", 25.00, "maria.lopez@email.com", "0998765432");
        pedidoService.registrar(pedido2);

        //caso 3
        Pedido pedido3 = new Pedido("Teclado", "Juan Perez", 75.00, "juan.perez@email.com", "0998765432");      
        pedidoService.registrar(pedido3);


    }
}
