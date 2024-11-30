package org.example.dominio;

public class ClienteCredito implements  ICliente{
    @Override
    public Pedido crearPedido() {
        return new Pedido("pedido a credito", 100);
    }
}
