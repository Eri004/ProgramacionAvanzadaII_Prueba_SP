package com.edu.uce.negocio;

public class Pedido {
    private String producto;
    private String cliente;
    private double total;
    private String correo;

    public Pedido() {
    
    }

    public Pedido(String producto, String cliente, double total,
         String correo) {
        this.producto = producto;
        this.cliente = cliente;
        this.total = total;
        this.correo = correo;   
    }

    //etters y setters generados por el increible autor
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
