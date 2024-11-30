package org.example.factorymethod;

import org.example.dominio.ClienteContado;
import org.example.dominio.ICliente;

public class ClienteContadoFactory extends AbstractFactory{
    @Override
    public ICliente crearCliente() {
        return new ClienteContado();
    }
}
