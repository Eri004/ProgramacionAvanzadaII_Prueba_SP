package com.edu.uce.negocio;

public class PedidoService {
    
    public void registrar(Pedido pedido) {
        
        // Implementar lógica de registro
        System.out.println("Registrando...");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en base de datos...\n");
        // Lectura de total y seleccion de notificador
        Notificador notificador = seleccionarNotificador(pedido);
        notificador.enviar(pedido, "Su pedido ha sido registrado exitosamente");

    }
    
    // Logica de negocio 
    private Notificador seleccionarNotificador(Pedido pedido) {
        if (pedido.getTotal() > 100) {
            System.out.println("El pedido supera los $100, enviando correo de confirmación...");
            return new NotificadorMail();
        }
        else if(pedido.getTotal() < 50) {
            //Whatsapp
            System.out.println("El pedido es menor que $50, enviando mensaje de WhatsApp...");
            return new NotificadorWhatsapp();
        }
        else{
        System.out.println("El pedido no supera los $100 ni es menor que 50$, se enviará SMS de confirmación.");
        return new NotificadorSMS();
    } 
    }
    
    
}
