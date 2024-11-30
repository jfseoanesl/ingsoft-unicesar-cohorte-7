package org.example.factorymethod;

import org.example.dominio.ICliente;

public abstract class AbstractFactory {

    public ICliente getCliente(String formaPago){
        return this.crearCliente();
    }

    public abstract ICliente crearCliente();

}
