package org.example.dominio;

public class ClienteContado implements ICliente{

    @Override
    public Pedido crearPedido() {
        return new Pedido("Pedido de contado", 50);
    }
}
