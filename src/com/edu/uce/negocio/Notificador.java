package uce.edu.ec.api.bodega;

public interface Notificador {
    void enviar(Pedido  pedido, String mensaje);
}