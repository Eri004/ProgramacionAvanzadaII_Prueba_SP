package com.edu.uce.negocio;

public class NotificadorWhatsapp implements Notificador {
    @Override
    public void enviar(Pedido pedido, String mensaje) {
        // Implementar lógica de envío de WhatsApp
        System.out.println("Enviando WhatsApp a " + pedido.getTelefono() + ": " + mensaje);
        
    }

}
