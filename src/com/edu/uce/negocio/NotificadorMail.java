package com.edu.uce.negocio;

public class NotificadorMail {
    public void enviar(String correo, String mensaje) {
        System.out.println("Enviando correo a: " + correo);
        System.out.println("Mensaje: " + mensaje);
    }
}
