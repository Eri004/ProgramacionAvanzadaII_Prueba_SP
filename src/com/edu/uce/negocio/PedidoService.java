package com.edu.uce.negocio;

public class PedidoService {
    public void registrar(Pedido pedido) {

        // Implementar lógica de registro
        System.out.println("Registrando...");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en base de datos...");
        // Simular envío de correo
        NotificadorMail notificador = new NotificadorMail();
        notificador.enviar(pedido.getCorreo(), "Su pedido ha sido registrado exitosamente ");

        
    }
}
