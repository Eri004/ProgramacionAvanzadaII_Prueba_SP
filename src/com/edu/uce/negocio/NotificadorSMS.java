package com.edu.uce.negocio;

public class NotificadorSMS implements Notificador {

    @Override
    public void enviar(Pedido pedido, String mensaje) {
        System.out.println("Enviando SMS a: " + pedido.getTelefono());
        System.out.println("Mensaje: " + mensaje);
    }
}
