package org.example.factorymethod;

import org.example.dominio.ClienteCredito;
import org.example.dominio.ICliente;

public class ClienteCreditoFactory extends AbstractFactory {
    @Override
    public ICliente crearCliente() {
        return new ClienteCredito();
    }
}
